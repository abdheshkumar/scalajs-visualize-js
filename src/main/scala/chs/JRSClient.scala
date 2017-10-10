package chs

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@js.native
trait JRSClient extends js.Object {
  /**
    * Perform authentication with provided auth object
    *
    * @param authType {object} - auth properties
    */
  def login(authType: AuthType): Unit = js.native

  /**
    * Destroy current auth session
    */
  def logout(): Unit = js.native

  /**
    * Create and run report component with provided properties
    *
    * @param props {object} - report properties
    * @return {Report} report - instance of Report
    */
  def report(props: ReportProps): Report = js.native

  /**
    * CSS selector for container to render report to.
    *
    * @param container : String
    * @return JRSClient
    */
  def apply(container: String): JRSClient = js.native
}

/**
  *
  * @param server : String
  * @param auth   : AuthType
  */
class JRSProps private(server: String, auth: AuthType) extends js.Object

object JRSProps {
  def apply(server0: String,
            authType0: AuthType): JRSProps =
    new JRSProps(server0, authType0)
}
