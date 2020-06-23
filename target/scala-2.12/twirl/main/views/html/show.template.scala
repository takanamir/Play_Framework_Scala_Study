
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,PersonForm.PersonData,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, item:PersonForm.PersonData ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),_display_(/*3.2*/main("Index Page", "Hello", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<p>"""),_display_(/*4.5*/Html(message)),format.raw/*4.18*/("""</p>
<ul>
  <li>ID: """),_display_(/*6.12*/item/*6.16*/.id),format.raw/*6.19*/("""</li>
  <li>NAME: """),_display_(/*7.14*/item/*7.18*/.name),format.raw/*7.23*/("""</li>
  <li>MAIL: """),_display_(/*8.14*/item/*8.18*/.mail),format.raw/*8.23*/("""</li>
  <li>TEL: """),_display_(/*9.13*/item/*9.17*/.tel),format.raw/*9.21*/("""</li>
</ul>
""")))}))
      }
    }
  }

  def render(message:String,item:PersonForm.PersonData): play.twirl.api.HtmlFormat.Appendable = apply(message,item)

  def f:((String,PersonForm.PersonData) => play.twirl.api.HtmlFormat.Appendable) = (message,item) => apply(message,item)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T12:44:15.197509100
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/show.scala.html
                  HASH: c5731a74caa72243508fbdde9ed8e638a8534b01
                  MATRIX: 750->1|890->46|920->51|974->97|1013->99|1041->101|1070->105|1103->118|1152->141|1164->145|1187->148|1233->168|1245->172|1270->177|1316->197|1328->201|1353->206|1398->225|1410->229|1434->233
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9
                  -- GENERATED --
              */
          