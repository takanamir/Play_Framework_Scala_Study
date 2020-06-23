// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/TAKANAMI/play_trial/play-samples-scala/conf/routes
// @DATE:Tue Jun 23 12:44:15 JST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
