
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.SignUp],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.SignUp]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<html>
    <head>
        <title>E-Karo - Sign Up</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Projects.index)),format.raw/*12.44*/("""" id="logo"><span>E-</span>Karo</a>
        </header>
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticateSignUp)/*15.60*/ {_display_(Seq[Any](format.raw/*15.62*/("""
            
            <h1>Sign Up</h1>
            
            """),_display_(Seq[Any](/*19.14*/if(form.hasGlobalErrors)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*21.22*/form/*21.26*/.globalError.message)),format.raw/*21.46*/("""
                </p>
            """)))})),format.raw/*23.14*/("""
            
            """),_display_(Seq[Any](/*25.14*/if(flash.contains("success"))/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*27.22*/flash/*27.27*/.get("success"))),format.raw/*27.42*/("""
                </p>
            """)))})),format.raw/*29.14*/("""
            <p>
              Email  <input type="email" name="email" value=""""),_display_(Seq[Any](/*31.63*/form("email")/*31.76*/.value)),format.raw/*31.82*/("""">
            </p>
            <p>
              Username  <input type="username" name="username" value=""""),_display_(Seq[Any](/*34.72*/form("username")/*34.88*/.value)),format.raw/*34.94*/("""">
            </p>
            <p>
               Password <input type="password" name="password">
            </p>
            <p>
               Re-Enter Password <input type="password" name="password2">
            </p>
             <p>
            Role  <select name="role">
                  <option value="Student">Student</option>
        		  <option value="Admin">Admin</option>
  					<option value="Guardian">Guardian</option>
  					<option value="Treasurer">Treasurer</option>
					</select>
            </p>
            <span>
            
            </span>
            <p>
                <button type="submit">Register</button>
            </p>
            Already Registered? <button><a href=""""),_display_(Seq[Any](/*56.51*/routes/*56.57*/.Application.login)),format.raw/*56.75*/("""" id="register">Login </a></button>           
        """)))})),format.raw/*57.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.SignUp]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.SignUp]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 10 18:24:15 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/signup.scala.html
                    HASH: 4d874f5e9ea7c1dfc60f1dad6891ccc5cef7d34b
                    MATRIX: 793->1|919->33|1072->151|1086->157|1139->189|1246->261|1260->267|1317->302|1427->376|1442->382|1479->397|1587->469|1602->475|1655->519|1695->521|1800->590|1833->614|1873->616|1966->673|1979->677|2021->697|2088->732|2151->759|2189->788|2229->790|2323->848|2337->853|2374->868|2441->903|2556->982|2578->995|2606->1001|2749->1108|2774->1124|2802->1130|3551->1843|3566->1849|3606->1867|3694->1923
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|59->31|59->31|59->31|62->34|62->34|62->34|84->56|84->56|84->56|85->57
                    -- GENERATED --
                */
            