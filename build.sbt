name                  := "genetic-algorithm"

organization          := "io.neilord"

version               := "0.1.0-SNAPSHOT"

scalaVersion          := "2.11.5"

scalacOptions         ++= Seq("-deprecation", "-feature", "-encoding", "utf8")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.mockito" % "mockito-core" % "1.10.8",
  "org.scodec" %% "scodec-core" % "1.7.0",
  "org.scodec" %% "scodec-scalaz" % "1.0.0"
)
