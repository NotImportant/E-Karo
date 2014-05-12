
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
object othermain extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Student],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(students: List[Student], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.17*/display/*32.24*/(student:models.Student):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.52*/(""" """),_display_(Seq[Any](/*32.54*/student/*32.61*/.firstName)),format.raw/*32.71*/(""" """),_display_(Seq[Any](/*32.73*/student/*32.80*/.lastName))))};
Seq[Any](format.raw/*1.39*/("""
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
            <h4 class="dashboard"><a href="#/">Students</a></h4>
            <ul id="projects">
               """),format.raw/*32.90*/("""
		      <select multiple>
		       """),_display_(Seq[Any](/*34.11*/for( student <- students) yield /*34.36*/ {_display_(Seq[Any](format.raw/*34.38*/("""
		      
		      <option value="""),_display_(Seq[Any](/*36.24*/display(student))),format.raw/*36.40*/("""> """),_display_(Seq[Any](/*36.43*/display(student))),format.raw/*36.59*/("""</option>
              
		     """)))})),format.raw/*38.9*/("""
		     
		     </select>
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            <p>ekaro.com - best educator.</p>
<p><small>© 2014-2050 by Titus Chirchir.</small></p>
        </section>
    </body>
</html>

"""))}
    }
    
    def render(students:List[Student],user:User): play.api.templates.HtmlFormat.Appendable = apply(students,user)
    
    def f:((List[Student],User) => play.api.templates.HtmlFormat.Appendable) = (students,user) => apply(students,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 21:44:26 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/othermain.scala.html
                    HASH: 566cb327bb37bf8373aa6e5786514abd25624575
                    MATRIX: 790->1|906->1605|922->1612|1031->1640|1069->1642|1085->1649|1117->1659|1155->1661|1171->1668|1214->38|1367->156|1381->162|1434->194|1541->266|1555->272|1611->306|1694->354|1708->360|1770->401|1862->458|1876->464|1943->510|2035->567|2049->573|2113->616|2206->673|2221->679|2284->720|2377->777|2392->783|2447->816|2540->873|2555->879|2606->908|2716->982|2731->988|2768->1003|2900->1099|2913->1103|2944->1112|2989->1121|3002->1125|3030->1131|3131->1196|3146->1202|3202->1236|3342->1340|3357->1346|3421->1388|3665->1678|3738->1715|3779->1740|3819->1742|3888->1775|3926->1791|3965->1794|4003->1810|4067->1843
                    LINES: 26->1|28->32|28->32|30->32|30->32|30->32|30->32|30->32|30->32|31->1|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|46->16|46->16|46->16|49->19|49->19|49->19|49->19|49->19|49->19|51->21|51->21|51->21|55->25|55->25|55->25|62->32|64->34|64->34|64->34|66->36|66->36|66->36|66->36|68->38
                    -- GENERATED --
                */
            