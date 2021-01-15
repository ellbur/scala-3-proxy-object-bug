
val scala3Version = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .settings(
    scalaVersion := "3.0.0-M3",
    scalaSource in Compile := baseDirectory.value / "src",
  )

