ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.rowanbeach"
ThisBuild / organizationName := "rowanbeach"

lazy val root = (project in file("."))
  .settings(
    name := "Simple HTTP Endpoint Descriptions"
  )

