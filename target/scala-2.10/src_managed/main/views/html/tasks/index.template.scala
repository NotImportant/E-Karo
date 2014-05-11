
package views.html.tasks

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Project,List[Task],SchoolStatus,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(project: Project, tasks: List[Task], schoolStatus: SchoolStatus):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.67*/("""

<header>
    <hgroup>
        <h1>"""),_display_(Seq[Any](/*5.14*/project/*5.21*/.folder)),format.raw/*5.28*/("""</h1>
        <h2>"""),_display_(Seq[Any](/*6.14*/project/*6.21*/.name)),format.raw/*6.26*/("""</h2>
    </hgroup>
    <dl class="users">
        <dt>Project's team</dt>
        <dd>
            <div class="wrap">
                <h3>Team mates</h3>
                <div class="list">
                    """),_display_(Seq[Any](/*14.22*/project/*14.29*/.members.map/*14.41*/ { user =>_display_(Seq[Any](format.raw/*14.51*/("""
                        <dl data-user-id=""""),_display_(Seq[Any](/*15.44*/user/*15.48*/.username)),format.raw/*15.57*/("""">
                            <dt>"""),_display_(Seq[Any](/*16.34*/user/*16.38*/.username)),format.raw/*16.47*/(""" <span>("""),_display_(Seq[Any](/*16.56*/user/*16.60*/.email)),format.raw/*16.66*/(""")</span></dt>
                            <dd class="action">Action</dd>
                        </dl>
                    """)))})),format.raw/*19.22*/("""
                </div>
                <h3>Add a team mate</h3>
                <div class="addUserList">
                    """),_display_(Seq[Any](/*23.22*/User/*23.26*/.findAll.diff(project.members).map/*23.60*/ { user =>_display_(Seq[Any](format.raw/*23.70*/("""
                        <dl data-user-id=""""),_display_(Seq[Any](/*24.44*/user/*24.48*/.username)),format.raw/*24.57*/("""">
                            <dt>"""),_display_(Seq[Any](/*25.34*/user/*25.38*/.username)),format.raw/*25.47*/(""" <span>("""),_display_(Seq[Any](/*25.56*/user/*25.60*/.email)),format.raw/*25.66*/(""")</span></dt>
                            <dd class="action">Action</dd>
                        </dl>
                    """)))})),format.raw/*28.22*/("""
                </div>
            </div>
        </dd>
    </dl>
</header>
<article  class="tasks" id="tasks">
    """),_display_(Seq[Any](/*35.6*/tasks/*35.11*/.groupBy(_.folder).map/*35.33*/ {/*36.9*/case (folder, tasks) =>/*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
            """),_display_(Seq[Any](/*37.14*/views/*37.19*/.html.tasks.folder(folder, tasks))),format.raw/*37.52*/("""
        """)))}})),format.raw/*39.6*/("""
    <a href="#newFolder" class="new newFolder">New folder</a>
</article>

"""))}
    }
    
    def render(project:Project,tasks:List[Task],schoolStatus:SchoolStatus): play.api.templates.HtmlFormat.Appendable = apply(project,tasks,schoolStatus)
    
    def f:((Project,List[Task],SchoolStatus) => play.api.templates.HtmlFormat.Appendable) = (project,tasks,schoolStatus) => apply(project,tasks,schoolStatus)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 10 18:24:16 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/tasks/index.scala.html
                    HASH: 322d6425bb1e48802557da423a9ec7aff67245e5
                    MATRIX: 805->1|964->66|1036->103|1051->110|1079->117|1133->136|1148->143|1174->148|1421->359|1437->366|1458->378|1506->388|1586->432|1599->436|1630->445|1702->481|1715->485|1746->494|1791->503|1804->507|1832->513|1988->637|2152->765|2165->769|2208->803|2256->813|2336->857|2349->861|2380->870|2452->906|2465->910|2496->919|2541->928|2554->932|2582->938|2738->1062|2891->1180|2905->1185|2936->1207|2946->1218|2978->1241|3018->1243|3068->1257|3082->1262|3137->1295|3179->1311
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|47->19|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|56->28|63->35|63->35|63->35|63->36|63->36|63->36|64->37|64->37|64->37|65->39
                    -- GENERATED --
                */
            