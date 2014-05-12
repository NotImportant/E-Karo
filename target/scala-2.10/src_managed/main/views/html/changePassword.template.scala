
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
object changePassword extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Application.ChangePassword],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, form: Form[Application.ChangePassword]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

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
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticateChangePassword(username))/*15.78*/ {_display_(Seq[Any](format.raw/*15.80*/("""
            
            <h1>Password Change</h1>
            
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
                <input type="username" name="username" placeholder="""),_display_(Seq[Any](/*32.69*/username)),format.raw/*32.77*/(""" value=""""),_display_(Seq[Any](/*32.86*/form("username")/*32.102*/.value)),format.raw/*32.108*/("""">
            </p>
            <p>
                <input type="password" name="oldPassword" placeholder="Old Password">
            </p>
            <p>
                <input type="password" name="newPassword1" placeholder="New Password">
            </p>
            <p>
                <input type="password" name="newPassword2" placeholder="New Password">
            </p>
            <p>
                <button type="submit">Change Password</button>
            </p>
            Do not want to change password? Go back to <a href=""""),_display_(Seq[Any](/*46.66*/routes/*46.72*/.Projects.index)),format.raw/*46.87*/("""" id="home"> homepage </a> here!           
        """)))})),format.raw/*47.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(username:String,form:Form[Application.ChangePassword]): play.api.templates.HtmlFormat.Appendable = apply(username,form)
    
    def f:((String,Form[Application.ChangePassword]) => play.api.templates.HtmlFormat.Appendable) = (username,form) => apply(username,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 20:29:44 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/changePassword.scala.html
                    HASH: 26d5480aa7e765455b7bbe87fc72d0525f607334
                    MATRIX: 816->1|968->59|1111->167|1125->173|1178->205|1285->277|1299->283|1356->318|1466->392|1481->398|1518->413|1626->485|1641->491|1712->553|1752->555|1865->632|1898->656|1938->658|2031->715|2044->719|2086->739|2153->774|2216->801|2254->830|2294->832|2388->890|2402->895|2439->910|2506->945|2640->1043|2670->1051|2715->1060|2741->1076|2770->1082|3346->1622|3361->1628|3398->1643|3483->1696
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|60->32|60->32|74->46|74->46|74->46|75->47
                    -- GENERATED --
                */
            