
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

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
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticate)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
            
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
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            Do not have an account? <a href=""""),_display_(Seq[Any](/*40.47*/routes/*40.53*/.Application.signup)),format.raw/*40.72*/("""" id="register">Sign Up </a> here!           
        """)))})),format.raw/*41.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 18:21:38 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/login.scala.html
                    HASH: f2368a43ce85d3241df281f9e264f72bc90b73f1
                    MATRIX: 791->1|916->32|1059->140|1073->146|1126->178|1233->250|1247->256|1304->291|1414->365|1429->371|1466->386|1574->458|1589->464|1636->502|1676->504|1781->573|1814->597|1854->599|1947->656|1960->660|2002->680|2069->715|2132->742|2170->771|2210->773|2304->831|2318->836|2355->851|2422->886|2574->1002|2600->1018|2629->1024|2929->1288|2944->1294|2985->1313|3072->1368
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|68->40|68->40|68->40|69->41
                    -- GENERATED --
                */
            