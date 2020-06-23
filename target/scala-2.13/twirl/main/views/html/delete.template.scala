
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

object delete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,PersonForm.Data,Int,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, data:PersonForm.Data, id:Int)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""

"""),_display_(/*3.2*/main("Delete Person", "DEL", "copyright 2018.")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
"""),format.raw/*4.1*/("""<p>"""),_display_(/*4.5*/message),format.raw/*4.12*/("""</p>
<p>ID = """),_display_(/*5.10*/id),format.raw/*5.12*/("""</p>
<ul>
  <li>name: """),_display_(/*7.14*/data/*7.18*/.name),format.raw/*7.23*/("""</li>
  <li>mail: """),_display_(/*8.14*/data/*8.18*/.mail),format.raw/*8.23*/("""</li>
  <li>tel: """),_display_(/*9.13*/data/*9.17*/.tel),format.raw/*9.21*/("""</li>
</ul>
  """),_display_(/*11.4*/helper/*11.10*/.form(action=routes.HomeController.remove(id))/*11.56*/ {_display_(Seq[Any](format.raw/*11.58*/("""
  """),_display_(/*12.4*/helper/*12.10*/.CSRF.formField),format.raw/*12.25*/("""
  """),format.raw/*13.3*/("""<button>Delete Person</button>
  """)))}),format.raw/*14.4*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(message:String,data:PersonForm.Data,id:Int,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(message,data,id)(request)

  def f:((String,PersonForm.Data,Int) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (message,data,id) => (request) => apply(message,data,id)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T10:45:42.496813800
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/delete.scala.html
                  HASH: e39400b4853b9089bc6324bab405ccd69642f1e3
                  MATRIX: 772->1|954->88|984->93|1039->140|1078->142|1106->144|1135->148|1162->155|1203->170|1225->172|1276->197|1288->201|1313->206|1359->226|1371->230|1396->235|1441->254|1453->258|1477->262|1520->279|1535->285|1590->331|1630->333|1661->338|1676->344|1712->359|1743->363|1808->398|1841->401
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|36->11|36->11|36->11|36->11|37->12|37->12|37->12|38->13|39->14|40->15
                  -- GENERATED --
              */
          