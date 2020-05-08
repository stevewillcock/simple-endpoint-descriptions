ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.rowanbeach"
ThisBuild / organizationName := "rowanbeach"

lazy val root = crossProject(JSPlatform, JVMPlatform)
  .settings(
    name := "Simple HTTP Endpoint Descriptions",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "upickle" % "1.1.0"
    )
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.11",
      "com.typesafe.akka" %% "akka-stream" % "2.6.5",
    )
  )

