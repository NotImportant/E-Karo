
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
object users extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Institution,List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(institution : Institution, users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*19.4*/display/*19.11*/(user:models.User):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.33*/(""" """),_display_(Seq[Any](/*19.35*/user/*19.39*/.email)),format.raw/*19.45*/(""" ("""),_display_(Seq[Any](/*19.48*/user/*19.52*/.username)),format.raw/*19.61*/(""")""")))};
Seq[Any](format.raw/*1.48*/("""

<html>
<head>
<title>E-Karo - Users</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("images/favicon.png"))),format.raw/*6.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*8.9*/routes/*8.15*/.Assets.at("stylesheets/login.css"))),format.raw/*8.50*/("""">
</head>
<body>

	<header>
		<a href=""""),_display_(Seq[Any](/*13.13*/routes/*13.19*/.Projects.index)),format.raw/*13.34*/("""" id="logo"><span>E-</span>Karo</a>
	</header>

	<h1>Welcome """),_display_(Seq[Any](/*16.15*/institution/*16.26*/.name)),format.raw/*16.31*/("""!</h1>
	<ul>

		"""),format.raw/*19.63*/("""
		 """),_display_(Seq[Any](/*20.5*/for( user <- users) yield /*20.24*/ {_display_(Seq[Any](format.raw/*20.26*/("""
		  """),_display_(Seq[Any](/*21.6*/if(user.role.equals('I'))/*21.31*/{_display_(Seq[Any](format.raw/*21.32*/("""
		<ol>"""),_display_(Seq[Any](/*22.8*/display(user))),format.raw/*22.21*/("""
		</ol>
		""")))})),format.raw/*24.4*/("""
		""")))})),format.raw/*25.4*/("""
	</ul>
</body>
</html>



"""))}
    }
    
    def render(institution:Institution,users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(institution,users)
    
    def f:((Institution,List[User]) => play.api.templates.HtmlFormat.Appendable) = (institution,users) => apply(institution,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 19:34:40 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/users.scala.html
                    HASH: f23b909cf944f199cfae06d74fe69720fa96b123
                    MATRIX: 790->1|914->444|930->451|1033->473|1071->475|1084->479|1112->485|1151->488|1164->492|1195->501|1236->47|1367->143|1381->149|1434->181|1533->246|1547->252|1603->287|1680->328|1695->334|1732->349|1830->411|1850->422|1877->427|1921->503|1961->508|1996->527|2036->529|2077->535|2111->560|2150->561|2193->569|2228->582|2271->594|2306->598
                    LINES: 26->1|28->19|28->19|30->19|30->19|30->19|30->19|30->19|30->19|30->19|31->1|36->6|36->6|36->6|38->8|38->8|38->8|43->13|43->13|43->13|46->16|46->16|46->16|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|54->24|55->25
                    -- GENERATED --
                */
            