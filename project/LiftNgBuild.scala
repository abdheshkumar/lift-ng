import sbt._
import sbt.Keys._

object LiftNgBuild extends Build {

  val liftVersion = SettingKey[String]("liftVersion", "Full version number of the Lift Web Framework")

  val liftEdition = SettingKey[String]("liftEdition", "Lift Edition (short version number to append to artifact name)")
  
  lazy val project = Project(
    id = "lift-ng", 
    base = file("."),
    settings = Project.defaultSettings)
}
