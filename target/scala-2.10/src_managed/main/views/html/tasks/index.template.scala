
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Project,List[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(project: Project, tasks: List[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

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
    
    def render(project:Project,tasks:List[Task]): play.api.templates.HtmlFormat.Appendable = apply(project,tasks)
    
    def f:((Project,List[Task]) => play.api.templates.HtmlFormat.Appendable) = (project,tasks) => apply(project,tasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 15:52:40 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/tasks/index.scala.html
                    HASH: 9fcc70cae914c207cdb472f5c82aecd3695d28f8
                    MATRIX: 792->1|923->38|995->75|1010->82|1038->89|1092->108|1107->115|1133->120|1380->331|1396->338|1417->350|1465->360|1545->404|1558->408|1589->417|1661->453|1674->457|1705->466|1750->475|1763->479|1791->485|1947->609|2111->737|2124->741|2167->775|2215->785|2295->829|2308->833|2339->842|2411->878|2424->882|2455->891|2500->900|2513->904|2541->910|2697->1034|2850->1152|2864->1157|2895->1179|2905->1190|2937->1213|2977->1215|3027->1229|3041->1234|3096->1267|3138->1283
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|47->19|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|56->28|63->35|63->35|63->35|63->36|63->36|63->36|64->37|64->37|64->37|65->39
                    -- GENERATED --
                */
            