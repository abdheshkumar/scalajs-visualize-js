package chs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("visualize")
object visualize extends js.Object {
  def apply(props: JRSProps,
            callback: js.UndefOr[js.Function1[JRSClient, Unit]] = js.undefined,
            errorBack: js.UndefOr[js.Function1[JRSClient, Unit]] = js.undefined,
            always: js.UndefOr[js.Function1[JRSClient, Unit]] = js.undefined): Unit = js.native
}