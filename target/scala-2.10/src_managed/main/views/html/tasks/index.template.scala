
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
                        <dl data-user-id=""""),_display_(Seq[Any](/*15.44*/user/*15.48*/.email)),format.raw/*15.54*/("""">
                            <dt>"""),_display_(Seq[Any](/*16.34*/user/*16.38*/.name)),format.raw/*16.43*/(""" <span>("""),_display_(Seq[Any](/*16.52*/user/*16.56*/.email)),format.raw/*16.62*/(""")<span>("""),_display_(Seq[Any](/*16.71*/user/*16.75*/.phoneNumber)),format.raw/*16.87*/(""")</span></dt>
                            <dd class="action">Action</dd>
                        </dl>
                    """)))})),format.raw/*19.22*/("""
                </div>
                <h3>Add a team mate</h3>
                <div class="addUserList">
                    """),_display_(Seq[Any](/*23.22*/User/*23.26*/.findAll.diff(project.members).map/*23.60*/ { user =>_display_(Seq[Any](format.raw/*23.70*/("""
                        <dl data-user-id=""""),_display_(Seq[Any](/*24.44*/user/*24.48*/.email)),format.raw/*24.54*/("""">
                            <dt>"""),_display_(Seq[Any](/*25.34*/user/*25.38*/.name)),format.raw/*25.43*/(""" <span>("""),_display_(Seq[Any](/*25.52*/user/*25.56*/.email)),format.raw/*25.62*/(""")</span></dt>
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
    <h1><span>"""),_display_(Seq[Any](/*41.16*/schoolStatus/*41.28*/.id)),format.raw/*41.31*/("""</span> """),_display_(Seq[Any](/*41.40*/schoolStatus/*41.52*/.description)),format.raw/*41.64*/("""</h1>
</article>

"""))}
    }
    
    def render(project:Project,tasks:List[Task],schoolStatus:SchoolStatus): play.api.templates.HtmlFormat.Appendable = apply(project,tasks,schoolStatus)
    
    def f:((Project,List[Task],SchoolStatus) => play.api.templates.HtmlFormat.Appendable) = (project,tasks,schoolStatus) => apply(project,tasks,schoolStatus)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 03 21:42:52 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/tasks/index.scala.html
                    HASH: 688bb98c077d4d7765714e1eb681e7201cb0a70c
                    MATRIX: 805->1|964->66|1036->103|1051->110|1079->117|1133->136|1148->143|1174->148|1421->359|1437->366|1458->378|1506->388|1586->432|1599->436|1627->442|1699->478|1712->482|1739->487|1784->496|1797->500|1825->506|1870->515|1883->519|1917->531|2073->655|2237->783|2250->787|2293->821|2341->831|2421->875|2434->879|2462->885|2534->921|2547->925|2574->930|2619->939|2632->943|2660->949|2816->1073|2969->1191|2983->1196|3014->1218|3024->1229|3056->1252|3096->1254|3146->1268|3160->1273|3215->1306|3257->1322|3371->1400|3392->1412|3417->1415|3462->1424|3483->1436|3517->1448
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|47->19|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|56->28|63->35|63->35|63->35|63->36|63->36|63->36|64->37|64->37|64->37|65->39|67->41|67->41|67->41|67->41|67->41|67->41
                    -- GENERATED --
                */
            