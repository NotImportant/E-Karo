
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
        <title>E-Karo</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Projects.index)),format.raw/*12.44*/("""" id="logo"><span>E-</span>Karo</a>
        </header>
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticateSignUp))),format.raw/*15.60*/(""", 'id -> myForm' """),format.raw/*15.77*/("""{"""),format.raw/*15.78*/("""
            
            <h1>Sign in</h1>
            
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
              Email:  <input type="email" name="email" value=""""),_display_(Seq[Any](/*31.64*/form("email")/*31.77*/.value)),format.raw/*31.83*/("""">
            </p>
            <p>
              Username:  <input type="username" name="username" value=""""),_display_(Seq[Any](/*34.73*/form("username")/*34.89*/.value)),format.raw/*34.95*/("""">
            </p>
            <p>
               Password: <input type="password" name="password">
            </p>
            <p>
               Re-Enter Password: <input type="password2" name="password2">
            </p>
             <p>
               Role: <input type="role" name="role">
            </p>
            <p>
                <button type="submit">Register</button>
            </p>
            Already Registered? <a href=""""),_display_(Seq[Any](/*48.43*/routes/*48.49*/.Application.login)),format.raw/*48.67*/("""" id="register">Login </a> here!           
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
        
            
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
                    DATE: Sun May 04 03:59:17 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/signup.scala.html
                    HASH: 478cd00a5e889c4e6584cab61303502d557befc4
                    MATRIX: 793->1|919->33|1062->141|1076->147|1129->179|1236->251|1250->257|1307->292|1417->366|1432->372|1469->387|1577->459|1592->465|1658->509|1703->526|1732->527|1837->596|1870->620|1910->622|2003->679|2016->683|2058->703|2125->738|2188->765|2226->794|2266->796|2360->854|2374->859|2411->874|2478->909|2594->989|2616->1002|2644->1008|2788->1116|2813->1132|2841->1138|3322->1583|3337->1589|3377->1607|3456->1659|3485->1660
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|59->31|59->31|59->31|62->34|62->34|62->34|76->48|76->48|76->48|77->49|77->49
                    -- GENERATED --
                */
            