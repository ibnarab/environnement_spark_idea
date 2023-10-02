name := "hello3"

version := "0.1"

scalaVersion := "2.11.12"


val sparkVersion = "2.3.2"

libraryDependencies ++= Seq(
  "org.scala-lang"    % "scala-compiler" % scalaVersion.value,
  "org.apache.spark" %% "spark-core"     % sparkVersion,
  "org.apache.spark" %% "spark-sql"      % sparkVersion,
  "org.apache.spark" %% "spark-hive"     % sparkVersion,
  "com.typesafe"      % "config"         % "1.2.1"
)
