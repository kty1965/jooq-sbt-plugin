sbtPlugin := true

version := "1.7"

organization := "jooq.sbt.plugin"

name := "jooq-sbt-plugin"

crossScalaVersions := Seq("2.9.3", "2.10.6", "2.11.7")

libraryDependencies += "com.floreysoft" % "jmte" % "3.2.0"
