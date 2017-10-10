package chs

import scala.scalajs.js

trait ReportProps extends js.Object {
  val server: js.UndefOr[String]
  val resource: js.UndefOr[String]
  val container: js.UndefOr[String] = js.undefined

  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ReportProps {
  @inline
  def apply(server: js.UndefOr[String],
            resource: js.UndefOr[String],
            container: js.UndefOr[String] = js.undefined,
            success: js.UndefOr[js.Function0[Unit]] = js.undefined): ReportProps = {
    val result = js.Dynamic.literal()
    server.foreach(result.server = _)
    resource.foreach(result.resource = _)
    container.foreach(result.container = _)
    success.foreach(result.success = _)
    result.asInstanceOf[ReportProps]
    //new ReportProps(server, resource, container)
  }
}

@js.native
trait Report extends js.Object {
  def params(newParams: js.Object): Report = js.native

  def params(): js.Object = js.native

  //def run() = js.native
}