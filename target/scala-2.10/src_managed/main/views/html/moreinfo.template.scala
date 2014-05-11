
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
object moreinfo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Guardian],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, form: Form[Guardian]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

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
        Welcome to E-Karo <h1>"""),_display_(Seq[Any](/*14.32*/username)),format.raw/*14.40*/("""</h1>!
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.moreInformation(username))/*15.67*/ {_display_(Seq[Any](format.raw/*15.69*/("""
            
            <h1>More Information</h1>
            
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
              First Name  <input type="firstName" name="firstName" value=""""),_display_(Seq[Any](/*31.76*/form("firstName")/*31.93*/.value)),format.raw/*31.99*/("""">
            </p>
            <p>
              Last Name  <input type="lastName" name="lastName" value=""""),_display_(Seq[Any](/*34.73*/form("lastName")/*34.89*/.value)),format.raw/*34.95*/("""">
            </p>
             <p>
              M.I. <input type="lastName" name="lastName" value=""""),_display_(Seq[Any](/*37.67*/form("middleName")/*37.85*/.value)),format.raw/*37.91*/("""">
            </p>
            <p>
             Phone Number <input type="phoneNumber" name="phoneNumber">
            </p>
 
            <p>
                <button type="submit">Finish Registration</button>
            </p>
            <span>
            
            </span>
            <p>
            Already Registered? <button><a href=""""),_display_(Seq[Any](/*50.51*/routes/*50.57*/.Application.login)),format.raw/*50.75*/("""" id="register">Login </a></button>  
            </p>
            <p>
            Begin Registration? <button><a href=""""),_display_(Seq[Any](/*53.51*/routes/*53.57*/.Application.signup)),format.raw/*53.76*/("""" id="register">Back to SignUp </a></button>  </p>         
        """)))})),format.raw/*54.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(username:String,form:Form[Guardian]): play.api.templates.HtmlFormat.Appendable = apply(username,form)
    
    def f:((String,Form[Guardian]) => play.api.templates.HtmlFormat.Appendable) = (username,form) => apply(username,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 10 23:28:48 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/moreinfo.scala.html
                    HASH: 9a9f1956e584b112c75977f91cad6f7a63668947
                    MATRIX: 792->1|926->41|1079->159|1093->165|1146->197|1253->269|1267->275|1324->310|1434->384|1449->390|1486->405|1607->490|1637->498|1689->514|1704->520|1764->571|1804->573|1918->651|1951->675|1991->677|2084->734|2097->738|2139->758|2206->793|2269->820|2307->849|2347->851|2441->909|2455->914|2492->929|2559->964|2687->1056|2713->1073|2741->1079|2885->1187|2910->1203|2938->1209|3077->1312|3104->1330|3132->1336|3513->1681|3528->1687|3568->1705|3725->1826|3740->1832|3781->1851|3882->1920
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|42->14|42->14|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|59->31|59->31|59->31|62->34|62->34|62->34|65->37|65->37|65->37|78->50|78->50|78->50|81->53|81->53|81->53|82->54
                    -- GENERATED --
                */
            