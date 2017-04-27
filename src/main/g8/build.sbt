import scala.language.postfixOps

name := """$name$"""

version := "0.1"

scalaVersion := "2.11.8"
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-explaintypes", "-encoding", "UTF8",
    "-Xlint", "-Xfatal-warnings")

val akkaVersion = "$akkaVersion$"
val akkaHttpVersion = "10.0.5"
val slickVersion = "3.2.0"
val slickPgVersion = "0.15.0-RC"
val logBackVersion = "1.2.3"
val playJsonVersion = "2.6.0-M7"
val guiceVersion = "4.1.0"

libraryDependencies ++=  Seq(
  // Akka
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,

  // JSON
  "com.typesafe.play" % "play-json_2.11" % playJsonVersion,

  // DB: drivers + Slick core
  "com.typesafe.slick" % "slick_2.11" % slickVersion,
  "com.typesafe.slick" % "slick-hikaricp_2.11" % slickVersion,
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",

  // DB: Slick extensions
  "com.github.tminglei" % "slick-pg_2.11" % slickPgVersion,
  "com.github.tminglei" % "slick-pg_play-json_2.11" % slickPgVersion,
  "com.github.tminglei" % "slick-pg_joda-time_2.11" % slickPgVersion,

  // Logging
  "ch.qos.logback" % "logback-classic" % logBackVersion,
  "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.5.0",

  // DI
  "net.codingwell" % "scala-guice_2.11" % guiceVersion,

  // Time and Date
  "org.joda" % "joda-convert" % "1.8.1",

  // Config
  "com.github.racc" % "typesafeconfig-guice" % "0.0.3",

  // Local libs
  "com.mysterria.lioqu" %% "lioqu-core" % "1.0-SNAPSHOT"
)

enablePlugins(RpmPlugin)
enablePlugins(JavaServerAppPackaging)
enablePlugins(LauncherJarPlugin)
rpmRelease := "1"
rpmVendor := "$company$"
rpmUrl := Some("$companyUrl$")
rpmLicense := Some("$license$")
sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false