
name := "checkout-counter"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.spire-math" %% "spire" % "0.13.0",
  "org.typelevel" %% "cats" % "0.9.0",
  "org.typelevel"  %% "squants"  % "1.2.0",
  "com.chuusai" %% "shapeless" % "2.3.2"
)
