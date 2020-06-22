
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content">
    <div class="wrapper doc">
        <article>
            <h2>Welcome to the Hello World Tutorial!</h2>
            <p>This tutorial introduces Play Framework, describes how Play web applications work, and walks you through
                steps
                to create page that displays a Hello World greeting.</p>
            <p>If you loaded this page from the web server running on <code>localhost:9000</code>, congratulations! You
                have
                successfully built and run a Play application. If not, you likely opened the source <code>index.scala.html</code>
                file. Please follow the directions in the <code>README.md</code> file in the top-level project directory
                to run
                the tutorial.</p>

            <h3 id="introduction">Introduction to Play</h3>
            <p>As illustrated below, Play is a full-stack framework with all of the components you need to build a Web
                Application or a REST service, including:</p>
            <ul>
                <li>An integrated HTTP server</li>
                <li>Form handling</li>
                <li>Cross-Site Request Forgery (CSRF) protection</li>
                <li>A powerful routing mechanism</li>
                <li>I18n support, and more.</li>
            </ul>

            <img src="assets/images/play-stack.png" alt="Play Stack" class="small-5 medium-4 large-3"/>

            <p>Play integrates with many object relational mapping (ORM) layers. It has out-of-the-box support for <a
                    href="https://www.playframework.com/documentation/"""),_display_(/*34.72*/version),format.raw/*34.79*/("""/Anorm"
                    target="_blank">Anorm</a>, <a href="https://www.playframework.com/documentation/"""),_display_(/*35.102*/version),format.raw/*35.109*/("""/JavaEbean"
                                                  target="_blank">JavaEbean</a>,
                <a href="https://www.playframework.com/documentation/"""),_display_(/*37.71*/version),format.raw/*37.78*/("""/PlaySlick" target="_blank">PlaySlick</a>,
                and
                <a href="https://www.playframework.com/documentation/"""),_display_(/*39.71*/version),format.raw/*39.78*/("""/JavaJPA" target="_blank">JPA</a>. See <a
                        href="https://www.playframework.com/documentation/"""),_display_(/*40.76*/version),format.raw/*40.83*/("""/JavaDatabase"
                        target="_blank">Accessing an SQL Database</a> for more information. Many customers use NoSQL,
                other ORMs or
                even access data from a REST service.</p>


            <p>Play APIs are available in both Scala and Java. The Framework uses <a href="https://akka.io"
                                                                                     target="_blank">Akka</a>
                and <a href="https://doc.akka.io/docs/akka-http/current/index.html" target="_blank">Akka HTTP</a> under
                the
                hood. This endows Play applications with a stateless, non-blocking, event-driven architecture that
                provides
                horizontal and vertical scalability and uses resources more efficiently.</p>

            <p>Here are just a few of the reasons developers love using Play Framework:</p>
            <ul>
                <li>Its Model-View-Controller (MVC) architecture is familiar and easy to learn.</li>
                <li>Direct support of common web development tasks and hot reloading saves precious development time.
                </li>
                <li>A large active community promotes knowledge sharing.</li>
                <li>Use of <a href="https://github.com/playframework/twirl">Twirl templates</a> to render pages. The
                    Twirl
                    template language is:
                    <ol>
                        <li>Easy to learn</li>
                        <li>Requires no special editor</li>
                        <li>Provides type safety</li>
                        <li>Is compiled so that errors display in the browser</li>
                    </ol>
                </li>
            </ul>

            <p>To learn more about Play's benefits, visit the <a href="https://www.playframework.com" target="_blank">Play
                website</a>.</p>

        </article>
    </div>
</section>
""")))}),format.raw/*78.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-22T15:47:40.480470200
                  SOURCE: C:/Users/TAKANAMI/play_trial/play-samples-scala/app/views/index.scala.html
                  HASH: 1aeeb3583b12819f9c7dcf6d2571059df731fe40
                  MATRIX: 722->1|818->3|848->8|871->23|910->25|938->28|985->67|1035->80|1065->84|2748->1740|2776->1747|2914->1857|2943->1864|3135->2029|3163->2036|3325->2171|3353->2178|3498->2296|3526->2303|5557->4304
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|59->34|59->34|60->35|60->35|62->37|62->37|64->39|64->39|65->40|65->40|103->78
                  -- GENERATED --
              */
          