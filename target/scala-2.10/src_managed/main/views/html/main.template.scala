
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
        <title>E-Karo</title>
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
                <dt>"""),_display_(Seq[Any](/*18.22*/user/*18.26*/.name)),format.raw/*18.31*/(""" <span>("""),_display_(Seq[Any](/*18.40*/user/*18.44*/.email)),format.raw/*18.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.Application.logout())),format.raw/*20.58*/("""">Logout</a>
                </dd>
            </dl>           
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*27.18*/projects/*27.26*/.groupBy(_.folder).map/*27.48*/ {/*28.21*/case (group, projects) =>/*28.46*/ {_display_(Seq[Any](format.raw/*28.48*/("""
                        """),_display_(Seq[Any](/*29.26*/views/*29.31*/.html.projects.group(group, projects))),format.raw/*29.68*/("""
                    """)))}})),format.raw/*31.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*36.14*/body)),format.raw/*36.18*/("""
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
                    DATE: Wed Apr 30 22:30:19 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/main.scala.html
                    HASH: 1c049a92bb64a28c33eb57466710690f444d32e3
                    MATRIX: 790->1|933->50|1075->157|1089->163|1142->195|1249->267|1263->273|1319->307|1402->355|1416->361|1478->402|1570->459|1584->465|1651->511|1743->568|1757->574|1821->617|1914->674|1929->680|1992->721|2085->778|2100->784|2155->817|2248->874|2263->880|2314->909|2424->983|2439->989|2476->1004|2596->1088|2609->1092|2636->1097|2681->1106|2694->1110|2722->1116|2823->1181|2838->1187|2881->1208|3127->1418|3144->1426|3175->1448|3186->1471|3220->1496|3260->1498|3322->1524|3336->1529|3395->1566|3450->1606|3614->1734|3640->1738
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|48->20|48->20|48->20|55->27|55->27|55->27|55->28|55->28|55->28|56->29|56->29|56->29|57->31|62->36|62->36
                    -- GENERATED --
                */
            