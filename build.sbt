name := "relationship_graph"

version := "0.1"

scalaVersion := "2.12.8"
organization := "org.stodge"
homepage := Some(url("https://github.com/salimfadhley/relationship_graph"))
scmInfo := Some(ScmInfo(url("https://github.com/salimfadhley/relationship_graph"), "git@github.com:salimfadhley/relationship_graph.git"))
developers := List(Developer("salimfadhley",
  "Salim Fadhley",
  "salimfadhley@gmail.com",
  url("https://github.com/salimfadhley")))
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
publishMavenStyle := true

// Add sonatype repository settings
publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)


libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
