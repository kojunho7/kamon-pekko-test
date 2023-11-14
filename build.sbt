ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "kamon-test",
    libraryDependencies ++= Seq(
      "org.apache.pekko" %% "pekko-actor-typed" % "1.0.1",
      "io.kamon" % "kamon-bundle_2.13" % "2.6.6",
      "io.kamon" % "kamon-core_2.13" % "2.6.6",
    )
  )
