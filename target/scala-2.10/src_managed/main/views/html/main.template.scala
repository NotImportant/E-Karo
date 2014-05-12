
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""
<html>
    <head>
        <title>Welcome to E-Karo</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*5.59*/routes/*5.65*/.Assets.at("images/favicon.png"))),format.raw/*5.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.70*/routes/*6.76*/.Assets.at("stylesheets/main.css"))),format.raw/*6.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*7.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*8.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*9.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*10.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/main.js"))),format.raw/*11.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Application.javascriptRoutes)),format.raw/*12.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Projects.index)),format.raw/*16.44*/("""" id="logo"><span>E-</span>Karo</a>
           
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*19.22*/user/*19.26*/.username)),format.raw/*19.35*/(""" <span>("""),_display_(Seq[Any](/*19.44*/user/*19.48*/.email)),format.raw/*19.54*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*21.31*/routes/*21.37*/.Application.logout(user.username))),format.raw/*21.71*/("""">Logout</a>
                </dd>
                
                 <dd>
                    <a href=""""),_display_(Seq[Any](/*25.31*/routes/*25.37*/.Application.changePassword(user.username))),format.raw/*25.79*/("""">Change Password</a>
                </dd>
            </dl>           
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*32.18*/projects/*32.26*/.groupBy(_.folder).map/*32.48*/ {/*33.21*/case (group, projects) =>/*33.46*/ {_display_(Seq[Any](format.raw/*33.48*/("""
                        """),_display_(Seq[Any](/*34.26*/views/*34.31*/.html.projects.group(group, projects))),format.raw/*34.68*/("""
                    """)))}})),format.raw/*36.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*41.14*/body)),format.raw/*41.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.HtmlFormat.Appendable = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 20:48:51 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/main.scala.html
                    HASH: b5e6a3b64602c9c7611b9bd8579163fc9b6e1cf6
                    MATRIX: 790->1|933->50|1086->168|1100->174|1153->206|1260->278|1274->284|1330->318|1413->366|1427->372|1489->413|1581->470|1595->476|1662->522|1754->579|1768->585|1832->628|1925->685|1940->691|2003->732|2096->789|2111->795|2166->828|2259->885|2274->891|2325->920|2435->994|2450->1000|2487->1015|2619->1111|2632->1115|2663->1124|2708->1133|2721->1137|2749->1143|2850->1208|2865->1214|2921->1248|3061->1352|3076->1358|3140->1400|3395->1619|3412->1627|3443->1649|3454->1672|3488->1697|3528->1699|3590->1725|3604->1730|3663->1767|3718->1807|3882->1935|3908->1939
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|53->25|53->25|53->25|60->32|60->32|60->32|60->33|60->33|60->33|61->34|61->34|61->34|62->36|67->41|67->41
                    -- GENERATED --
                */
            