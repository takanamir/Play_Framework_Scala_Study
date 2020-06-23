
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[MyForm.Data],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, myform: Form[MyForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),_display_(/*3.2*/main("Index Page", "Hello", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
  """),format.raw/*4.3*/("""<p>"""),_display_(/*4.7*/message),format.raw/*4.14*/("""</p>
  """),_display_(/*5.4*/helper/*5.10*/.form(action=routes.HomeController.form)/*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""
  """),_display_(/*6.4*/helper/*6.10*/.CSRF.formField),format.raw/*6.25*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(myform("name"))),format.raw/*7.36*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputPassword(myform("pass"))),format.raw/*8.40*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputRadioGroup(myform("radio"),
      options = Seq("ウインドウズ" -> "Windows",
      "マック" -> "macOS", "リナックス" -> "Linux"))),format.raw/*11.45*/("""
  """),format.raw/*12.3*/("""<button>send form</button>
  """)))}),format.raw/*13.4*/("""
""")))}))
      }
    }
  }

  def render(message:String,myform:Form[MyForm.Data],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,myform)(request)

  def f:((String,Form[MyForm.Data]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,myform) => (request) => apply(message,myform)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-22T23:13:39.239360
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/index.scala.html
                  HASH: c76a8048d6f2273faf74390530b5eb0f59bca5f5
                  MATRIX: 769->1|948->85|978->90|1032->136|1071->138|1101->142|1130->146|1157->153|1191->162|1205->168|1253->208|1292->210|1322->215|1336->221|1371->236|1401->241|1415->247|1461->273|1491->278|1505->284|1555->314|1585->319|1599->325|1743->448|1774->452|1835->483
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|36->11|37->12|38->13
                  -- GENERATED --
              */
          