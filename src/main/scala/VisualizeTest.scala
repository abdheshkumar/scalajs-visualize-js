import chs._
import org.scalajs.jquery.jQuery

import scala.scalajs.js
import js.Dynamic.{global => g}

object VisualizeTest {

  val success: js.Function0[Unit] = () => {
    g.console.log("Loaded")
  }

  def render: js.Function1[JRSClient, Unit] = (v: JRSClient) => {
    v.report(ReportProps("http://localhost:8080/jasperserver-pro",
      "/public/Samples/Reports/Call_Handling_Account_Details_Report",
      "#container1", success))

    v("#container2").report(ReportProps("http://localhost:8080/jasperserver-pro",
      "/public/Samples/Reports/Call_Handling_Account_Details_Report", success = success))

  }

  def main(args: Array[String]): Unit = {
    jQuery(() => {
      visualize(JRSProps("http://localhost:8080/jasperserver-pro", LoginWithPlainText("superuser", "superuser")), render)
    })

  }
}
