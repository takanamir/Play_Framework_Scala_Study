
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[PersonForm.Data],Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, form:Form[PersonForm.Data], id:Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),_display_(/*3.2*/main("Edit Person", "Edit", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
  """),format.raw/*4.3*/("""<p>"""),_display_(/*4.7*/message),format.raw/*4.14*/("""</p>
  """),_display_(/*5.4*/helper/*5.10*/.form(action=routes.HomeController.update(id))/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""
  """),_display_(/*6.4*/helper/*6.10*/.CSRF.formField),format.raw/*6.25*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(form("name"))),format.raw/*7.34*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputText(form("mail"))),format.raw/*8.34*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(form("tel"))),format.raw/*9.33*/("""
  """),format.raw/*10.3*/("""<button>Create Person</button>
  """)))}),format.raw/*11.4*/("""
""")))}))
      }
    }
  }

  def render(message:String,form:Form[PersonForm.Data],id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form,id)(request)

  def f:((String,Form[PersonForm.Data],Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form,id) => (request) => apply(message,form,id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T10:39:05.224872400
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/edit.scala.html
                  HASH: 3eb71d1d68f2eafe0bba283edf9a365f728ba564
                  MATRIX: 776->1|964->94|994->99|1048->145|1087->147|1117->151|1146->155|1173->162|1207->171|1221->177|1275->223|1314->225|1344->230|1358->236|1393->251|1423->256|1437->262|1481->286|1511->291|1525->297|1569->321|1599->326|1613->332|1656->355|1687->359|1752->394
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|36->11
                  -- GENERATED --
              */
          