
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, header: String, footer: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
  <link rel="stylesheet" media="screen"
        href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.63*/("""">
  <link rel="shortcut icon" type="image/png"
        href=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("images/favicon.png")),format.raw/*10.61*/("""">
</head>
<body>
<header class="row">
  <div class="header">"""),_display_(/*14.24*/header),format.raw/*14.30*/("""</div>
  <h1>"""),_display_(/*15.8*/title),format.raw/*15.13*/("""</h1>
</header>
<article class="row">
  """),_display_(/*18.4*/content),format.raw/*18.11*/("""
"""),format.raw/*19.1*/("""</article>
<footer class="row">
  <p>"""),_display_(/*21.7*/footer),format.raw/*21.13*/("""</p>
</footer>
<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.versioned("javascripts/main.js")),format.raw/*23.61*/(""""
type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,header:String,footer:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,header,footer)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,header,footer) => (content) => apply(title,header,footer)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-22T20:48:17.970810500
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/main.scala.html
                  HASH: 7bfad3b3e5c0ed14a9fdf061201c086b27ba6baf
                  MATRIX: 747->1|904->63|934->67|1013->120|1038->125|1130->191|1144->197|1205->238|1297->303|1312->309|1372->348|1465->414|1492->420|1533->435|1559->440|1629->484|1657->491|1686->493|1752->533|1779->539|1837->570|1852->576|1913->616
                  LINES: 21->1|26->1|28->3|31->6|31->6|33->8|33->8|33->8|35->10|35->10|35->10|39->14|39->14|40->15|40->15|43->18|43->18|44->19|46->21|46->21|48->23|48->23|48->23
                  -- GENERATED --
              */
          