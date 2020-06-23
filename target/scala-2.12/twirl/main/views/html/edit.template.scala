
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[PersonForm.PersonData],Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, form:Form[PersonForm.PersonData], id:Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""

"""),_display_(/*3.2*/main("Edit Person", "Edit", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<p>"""),_display_(/*4.5*/message),format.raw/*4.12*/("""</p>

"""),_display_(/*6.2*/helper/*6.8*/.form(action=routes.HomeController.update(id))/*6.54*/ {_display_(Seq[Any](format.raw/*6.56*/("""
  """),format.raw/*7.3*/("""<input type="hidden" name="id" value=""""),_display_(/*7.42*/id),format.raw/*7.44*/("""">
  """),_display_(/*8.4*/helper/*8.10*/.CSRF.formField),format.raw/*8.25*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(form("name"))),format.raw/*9.34*/("""
  """),_display_(/*10.4*/helper/*10.10*/.inputText(form("mail"))),format.raw/*10.34*/("""
  """),_display_(/*11.4*/helper/*11.10*/.inputText(form("tel"))),format.raw/*11.33*/("""
  """),format.raw/*12.3*/("""<button>Update Person</button>
  """)))}),format.raw/*13.4*/("""
""")))}))
      }
    }
  }

  def render(message:String,form:Form[PersonForm.PersonData],id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,form,id)(request)

  def f:((String,Form[PersonForm.PersonData],Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,form,id) => (request) => apply(message,form,id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T13:04:02.564723200
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/edit.scala.html
                  HASH: 59447c93f62623540135ed3bb2fe1de9fbc9fecf
                  MATRIX: 782->1|977->100|1007->105|1061->151|1100->153|1128->155|1157->159|1184->166|1218->175|1231->181|1285->227|1324->229|1354->233|1419->272|1441->274|1473->281|1487->287|1522->302|1552->307|1566->313|1610->337|1641->342|1656->348|1701->372|1732->377|1747->383|1791->406|1822->410|1887->445
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|37->12|38->13
                  -- GENERATED --
              */
          