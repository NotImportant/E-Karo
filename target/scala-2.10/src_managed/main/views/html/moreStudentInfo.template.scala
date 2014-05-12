
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
object moreStudentInfo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[Application.StudentRegistration],List[Institution],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, form: Form[Application.StudentRegistration], institutions: List[Institution]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.98*/("""

<html>
    <head>
        <title>E-Karo - Sign Up</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Projects.index)),format.raw/*12.44*/("""" id="logo"><span>E-</span>Karo</a>
        </header>
        Welcome to E-Karo <h1>"""),_display_(Seq[Any](/*14.32*/username)),format.raw/*14.40*/("""</h1>!
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.moreInformation(username))/*15.67*/ {_display_(Seq[Any](format.raw/*15.69*/("""
            
            <h1>More Information</h1>
            
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
              User Name  <input type="username" name="username" value=""""),_display_(Seq[Any](/*31.73*/form("username")/*31.89*/.value)),format.raw/*31.95*/("""">
            </p>
            <p>
              First Name  <input type="firstName" name="firstName" value=""""),_display_(Seq[Any](/*34.76*/form("firstName")/*34.93*/.value)),format.raw/*34.99*/("""">
            </p>
            <p>
              Last Name  <input type="lastName" name="lastName" value=""""),_display_(Seq[Any](/*37.73*/form("lastName")/*37.89*/.value)),format.raw/*37.95*/("""">
            </p>
            <p>
             Class Year <input type="classyear" name="classyear">
            </p> 
            <p>
             Institution <select name="role">
             """),_display_(Seq[Any](/*44.15*/for( institution <- institutions) yield /*44.48*/ {_display_(Seq[Any](format.raw/*44.50*/("""
			    <option value="""),_display_(Seq[Any](/*45.23*/institution/*45.34*/.id)),format.raw/*45.37*/(""">"""),_display_(Seq[Any](/*45.39*/institution/*45.50*/.name)),format.raw/*45.55*/("""</option>
			  """)))})),format.raw/*46.7*/("""
		      </select>
	</p>
            </p>
            <p>
                <button type="submit">Finish Registration</button>
            </p>
                 
        """)))})),format.raw/*54.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(username:String,form:Form[Application.StudentRegistration],institutions:List[Institution]): play.api.templates.HtmlFormat.Appendable = apply(username,form,institutions)
    
    def f:((String,Form[Application.StudentRegistration],List[Institution]) => play.api.templates.HtmlFormat.Appendable) = (username,form,institutions) => apply(username,form,institutions)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 22:19:57 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/moreStudentInfo.scala.html
                    HASH: bbcae4d6b34e852b4f5af226ede4092d244c83ed
                    MATRIX: 840->1|1030->97|1183->215|1197->221|1250->253|1357->325|1371->331|1428->366|1538->440|1553->446|1590->461|1711->546|1741->554|1793->570|1808->576|1868->627|1908->629|2022->707|2055->731|2095->733|2188->790|2201->794|2243->814|2310->849|2373->876|2411->905|2451->907|2545->965|2559->970|2596->985|2663->1020|2788->1109|2813->1125|2841->1131|2988->1242|3014->1259|3042->1265|3186->1373|3211->1389|3239->1395|3471->1591|3520->1624|3560->1626|3619->1649|3639->1660|3664->1663|3702->1665|3722->1676|3749->1681|3796->1697|3997->1866
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|42->14|42->14|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|59->31|59->31|59->31|62->34|62->34|62->34|65->37|65->37|65->37|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|74->46|82->54
                    -- GENERATED --
                */
            