
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
object users extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Institution,List[Student],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(institution : Institution, students: List[Student]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

<html>
<head>
<title>E-Karo - Users</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("images/favicon.png"))),format.raw/*6.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*8.9*/routes/*8.15*/.Assets.at("stylesheets/login.css"))),format.raw/*8.50*/("""">
</head>
<body>
<h1>Welcome """),_display_(Seq[Any](/*11.14*/institution/*11.25*/.name)),format.raw/*11.30*/("""!</h1>
<ul>
"""),_display_(Seq[Any](/*13.2*/for( student <- students) yield /*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""
 <li>"""),_display_(Seq[Any](/*14.7*/student/*14.14*/.firstName)),format.raw/*14.24*/("""</li>
""")))})),format.raw/*15.2*/("""
</ul>
</body>
</html>



"""))}
    }
    
    def render(institution:Institution,students:List[Student]): play.api.templates.HtmlFormat.Appendable = apply(institution,students)
    
    def f:((Institution,List[Student]) => play.api.templates.HtmlFormat.Appendable) = (institution,students) => apply(institution,students)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 18:21:38 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/users.scala.html
                    HASH: be5d9f9fc1c995621cf6f8d35ef32ab3a7a04fa2
                    MATRIX: 793->1|939->53|1070->149|1084->155|1137->187|1236->252|1250->258|1306->293|1373->324|1393->335|1420->340|1468->353|1509->378|1549->380|1591->387|1607->394|1639->404|1677->411
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15
                    -- GENERATED --
                */
            