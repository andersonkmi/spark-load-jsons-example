import Dependencies._

organization := "org.sharpsw.spark"

name := "spark-load-jsons-example"

val appVersion = "1.0.0.0"

val appName = "spark-load-jsons-example"

version := appVersion

scalaVersion := "2.11.8"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.3.1",
  "org.apache.spark" % "spark-sql_2.11" % "2.3.1",
  scalaTest % Test
)