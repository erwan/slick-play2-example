package models

import play.api.Application

import scala.slick.driver.MySQLDriver.simple._

object AppDB {

  def db(implicit app: Application) = Database.forURL(
    app.configuration.getString("db.default.url").getOrElse(sys.error("Missing key: db.default.url")),
    app.configuration.getString("db.default.user").getOrElse(""),
    driver = "scala.slick.driver.MySQLDriver")

}
