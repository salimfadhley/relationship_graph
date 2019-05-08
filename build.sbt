name := "relationship_graph"

version := "0.1"

scalaVersion := "2.12.8"

organization := "org.stodge"
homepage := Some(url("https://github.com/username/projectname"))
scmInfo := Some(ScmInfo(url("https://github.com/username/projectname")
"git@github.com:username/projectname.git"))
developers := List(Developer("username",
  "User Name",
  "mail@username.de",
  url("https://github.com/username")))
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
publishMavenStyle := true

// Add sonatype repository settings
publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)