import scala.language.postfixOps

name := """$name$"""
organization := """$organization$"""

mainClass in (Compile, run) := Some("$mainClass$")
mainClass in (Compile, packageBin) := Some("$mainClass$")

version := "0.1"

scalaVersion := "2.11.8"
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-explaintypes", "-encoding", "UTF8",
    "-Xlint", "-Xfatal-warnings")


libraryDependencies ++=  Seq(
  "com.mysterria.lioqu" %% "lioqu-core" % "0.1-SNAPSHOT"
)

enablePlugins(RpmPlugin)
enablePlugins(JavaServerAppPackaging)
enablePlugins(LauncherJarPlugin)
rpmRelease := "1"
rpmVendor := "$organization$"
rpmUrl := Some("$organizationUrl$")
rpmLicense := Some("$license$")
sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false