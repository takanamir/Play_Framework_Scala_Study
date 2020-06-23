
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

object add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Form[PersonForm.Data],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, form:Form[PersonForm.Data])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.87*/("""

"""),_display_(/*3.2*/main("Add Person", "Add", "copyright 2018.")/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""
  """),format.raw/*4.3*/("""<p>"""),_display_(/*4.7*/message),format.raw/*4.14*/("""</p>
  """),_display_(/*5.4*/helper/*5.10*/.form(action=routes.HomeController.create())/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""
  """),_display_(/*6.4*/helper/*6.10*/.CSRF.formField),format.raw/*6.25*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(form("name"))),format.raw/*7.34*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputText(form("mail"))),format.raw/*8.34*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(form("tel"))),format.raw/*9.33*/("""
  """),format.raw/*10.3*/("""<button>Create Person</button>
  """)))}),format.raw/*11.4*/("""
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(message:String,form:Form[PersonForm.Data],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form)(request)

  def f:((String,Form[PersonForm.Data]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form) => (request) => apply(message,form)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T10:29:32.366881600
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/add.scala.html
                  HASH: e95f82c53895eace494547fb9c33a3e5509d8118
                  MATRIX: 771->1|951->86|981->91|1033->135|1072->137|1102->141|1131->145|1158->152|1192->161|1206->167|1258->211|1297->213|1327->218|1341->224|1376->239|1406->244|1420->250|1464->274|1494->279|1508->285|1552->309|1582->314|1596->320|1639->343|1670->347|1735->382|1768->385
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|36->11|37->12
                  -- GENERATED --
              */
          