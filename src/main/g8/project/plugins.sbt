addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.5")
$if(DataflowFlexTemplate.truthy) $
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
$endif$
