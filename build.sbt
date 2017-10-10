import sbt.Keys.version

lazy val library = new {

  /** Options for the scala compiler */
  val scalacOptions = Seq(
    "-Xlint",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-P:scalajs:sjsDefinedByDefault"
  )

  val `scalajs-jquery` = "0.9.2"
  val dependencies = Def.setting(Seq(
    "be.doeraene" %%% "scalajs-jquery" % `scalajs-jquery`
  ))

  val jsDependencies = Def.setting(Seq(
    "org.webjars" % "jquery" % "3.2.1" / "3.2.1/jquery.js"))
}



lazy val root = (project in file("."))
  .settings(
    name := "scalajs-visualizeJs",
    version := "0.1",
    scalaVersion := "2.12.3",
    scalacOptions ++= library.scalacOptions,
  ).settings(
  libraryDependencies ++= library.dependencies.value,
  jsDependencies ++= library.jsDependencies.value,
  scalaJSUseMainModuleInitializer := true
).enablePlugins(ScalaJSPlugin)

        