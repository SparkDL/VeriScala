lazy val lib = ProjectRef(file("../newhdl"), "lib")

lazy val examples = project
  .in(file("."))
  .dependsOn(lib)
  .settings(name := "NewHDL Examples",
    organization := "com.liyaos",
    scalaVersion := "2.11.0",
    version := "0.0.1",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.1" % "test"))
