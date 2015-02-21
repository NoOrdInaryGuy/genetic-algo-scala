name                  := "genetic-algorithm"

organization          := "io.neilord"

version               := "0.1.0-SNAPSHOT"

scalaVersion          := "2.11.5"

scalacOptions         ++= Seq("-deprecation", "-feature", "-encoding", "utf8")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.mockito" % "mockito-core" % "1.10.8"
)
