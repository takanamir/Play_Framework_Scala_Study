
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, result:List[String] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Index Page", "Hello", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<p>"""),_display_(/*4.5*/Html(message)),format.raw/*4.18*/("""</p>
<ul>
  """),_display_(/*6.4*/for(item<-result) yield /*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
  """),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/item),format.raw/*7.12*/("""</li>
  """)))}),format.raw/*8.4*/("""
"""),format.raw/*9.1*/("""</ul>
""")))}))
      }
    }
  }

  def render(message:String,result:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,result)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,result) => apply(message,result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T12:09:02.588389300
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/index.scala.html
                  HASH: 0e31cfd2c52296169a46aad74a6005146c50cbab
                  MATRIX: 742->1|875->39|905->44|959->90|998->92|1026->94|1055->98|1088->111|1128->126|1160->143|1198->144|1228->148|1258->153|1282->157|1321->167|1349->169
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9
                  -- GENERATED --
              */
          