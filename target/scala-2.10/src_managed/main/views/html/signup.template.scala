
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.SignUp],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.SignUp]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

<html>
<head>
<title>E-Karo - Sign Up</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("images/favicon.png"))),format.raw/*6.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*8.9*/routes/*8.15*/.Assets.at("stylesheets/login.css"))),format.raw/*8.50*/("""">
</head>
<body>

	<header>
		<a href=""""),_display_(Seq[Any](/*13.13*/routes/*13.19*/.Projects.index)),format.raw/*13.34*/("""" id="logo"><span>E-</span>Karo</a>
	</header>

	"""),_display_(Seq[Any](/*16.3*/helper/*16.9*/.form(routes.Application.authenticateSignUp)/*16.53*/ {_display_(Seq[Any](format.raw/*16.55*/("""

	<h1>Sign Up</h1>

	"""),_display_(Seq[Any](/*20.3*/if(form.hasGlobalErrors)/*20.27*/ {_display_(Seq[Any](format.raw/*20.29*/("""
	<p class="error">"""),_display_(Seq[Any](/*21.20*/form/*21.24*/.globalError.message)),format.raw/*21.44*/("""</p>
	""")))})),format.raw/*22.3*/(""" """),_display_(Seq[Any](/*22.5*/if(flash.contains("success"))/*22.34*/ {_display_(Seq[Any](format.raw/*22.36*/("""
	<p class="success">"""),_display_(Seq[Any](/*23.22*/flash/*23.27*/.get("success"))),format.raw/*23.42*/("""</p>
	""")))})),format.raw/*24.3*/("""
	<p>
		Email <input type="email" name="email" value=""""),_display_(Seq[Any](/*26.50*/form("email")/*26.63*/.value)),format.raw/*26.69*/("""">
	</p>
	<p>
		Username <input type="username" name="username" value=""""),_display_(Seq[Any](/*29.59*/form("username")/*29.75*/.value)),format.raw/*29.81*/("""">
	</p>
	<p>
		Password <input type="password" name="password">
	</p>
	<p>
		Re-Enter Password <input type="password" name="password2">
	</p>
	<p>
		Role <select name="role">
			<option value="Student">Student</option>
			<option value="Admin">Admin</option>
			<option value="Guardian">Guardian</option>
			<option value="Treasurer">Treasurer</option>
			<option value="Institution">Institution</option>
		</select>
	</p>
	<span> </span>
	<p>
		<button type="submit">Register</button>
	</p>
	Already Registered?
	<button>
		<a href=""""),_display_(Seq[Any](/*52.13*/routes/*52.19*/.Application.login)),format.raw/*52.37*/("""" id="register">Login </a>
	</button>
	""")))})),format.raw/*54.3*/("""


</body>
</html>



"""))}
    }
    
    def render(form:Form[Application.SignUp]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.SignUp]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 11 18:21:38 EDT 2014
                    SOURCE: /Users/tituschirchir/E-Karo/E-Karo/app/views/signup.scala.html
                    HASH: 10beeaa97599fb5498a788600a4b931fc4d393c7
                    MATRIX: 793->1|919->33|1052->131|1066->137|1119->169|1218->234|1232->240|1288->275|1365->316|1380->322|1417->337|1502->387|1516->393|1569->437|1609->439|1667->462|1700->486|1740->488|1796->508|1809->512|1851->532|1889->539|1926->541|1964->570|2004->572|2062->594|2076->599|2113->614|2151->621|2242->676|2264->689|2292->695|2400->767|2425->783|2453->789|3025->1325|3040->1331|3080->1349|3151->1389
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|41->13|41->13|41->13|44->16|44->16|44->16|44->16|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|52->24|54->26|54->26|54->26|57->29|57->29|57->29|80->52|80->52|80->52|82->54
                    -- GENERATED --
                */
            