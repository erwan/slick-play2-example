package controllers

import play.api._
import play.api.mvc._
import play.api.Play.current

import scala.slick.driver.MySQLDriver.simple._
import Database.threadLocalSession

import models._

object Application extends Controller {

  def index = Action {
    AppDB.db.withSession {
      Query(UserTable).foreach { u =>
        Logger.info("u = " + u)
      }
    }
    Ok(views.html.index("hola"))
  }
  
}
