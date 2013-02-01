package models

import play.api.Application

import scala.slick.session.Database

object AppDB {

  def db(implicit app: Application) = Database.forURL(
    app.configuration.getString("db.default.url").getOrElse(sys.error("Missing key: db.default.url")),
    app.configuration.getString("db.default.user").getOrElse(""),
    driver = app.configuration.getString("slick.driver").getOrElse(sys.error("Slick: missing configuration key slick.driver"))
  )

}

