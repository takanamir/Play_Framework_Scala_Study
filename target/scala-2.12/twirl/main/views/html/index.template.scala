
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[PersonForm.PersonData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String, result:List[PersonForm.PersonData] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Index Page", "Hello", "copyright 2018.")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<p>"""),_display_(/*4.5*/Html(message)),format.raw/*4.18*/("""</p>
<ul>
  """),_display_(/*6.4*/for(item<-result) yield /*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
  """),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/item/*7.12*/.name),format.raw/*7.17*/(""": """),_display_(/*7.20*/item/*7.24*/.mail),format.raw/*7.29*/(""" """),format.raw/*7.30*/("""("""),_display_(/*7.32*/item/*7.36*/.tel),format.raw/*7.40*/(""")</li>
  """)))}),format.raw/*8.4*/("""
"""),format.raw/*9.1*/("""</ul>
""")))}))
      }
    }
  }

  def render(message:String,result:List[PersonForm.PersonData]): play.twirl.api.HtmlFormat.Appendable = apply(message,result)

  def f:((String,List[PersonForm.PersonData]) => play.twirl.api.HtmlFormat.Appendable) = (message,result) => apply(message,result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-23T12:44:15.132549500
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/index.scala.html
                  HASH: 5db6b6ddb604f65b22615ea629237eb6a0ed4de9
                  MATRIX: 757->1|905->54|935->59|989->105|1028->107|1056->109|1085->113|1118->126|1158->141|1190->158|1228->159|1258->163|1288->168|1300->172|1325->177|1354->180|1366->184|1391->189|1419->190|1447->192|1459->196|1483->200|1523->211|1551->213
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|31->6|31->6|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|33->8|34->9
                  -- GENERATED --
              */
          