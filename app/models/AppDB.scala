package models
import play.api.Play.current

import scala.slick.driver.MySQLDriver.simple._

object AppDB {

  lazy val db = Database.forURL("jdbc:mysql://127.0.0.1:3306/slick", "root", driver = "scala.slick.driver.MySQLDriver")

}
