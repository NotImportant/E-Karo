
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
object changePassword extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.ChangePassword],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.ChangePassword]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

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
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticateChangePassword)/*15.68*/ {_display_(Seq[Any](format.raw/*15.70*/("""
            
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
                <input type="username" name="username" placeholder="Username" value=""""),_display_(Seq[Any](/*32.87*/form("username")/*32.103*/.value)),format.raw/*32.109*/("""">
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
    
    def render(form:Form[Application.ChangePassword]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.ChangePassword]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 17:03:33 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/changePassword.scala.html
                    HASH: cc7ba4f642b51fb5c7d4b284f944b495503107c8
                    MATRIX: 809->1|943->41|1086->149|1100->155|1153->187|1260->259|1274->265|1331->300|1441->374|1456->380|1493->395|1601->467|1616->473|1677->525|1717->527|1822->596|1855->620|1895->622|1988->679|2001->683|2043->703|2110->738|2173->765|2211->794|2251->796|2345->854|2359->859|2396->874|2463->909|2615->1025|2641->1041|2670->1047|3246->1587|3261->1593|3298->1608|3383->1661
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|74->46|74->46|74->46|75->47
                    -- GENERATED --
                */
            