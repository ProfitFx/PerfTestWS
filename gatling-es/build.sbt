name := "gatling-es"

version := "0.1"

scalaVersion := "2.13.7"

enablePlugins(GatlingPlugin)

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.7.3" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "3.7.3" % "test"
libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.4.2"
