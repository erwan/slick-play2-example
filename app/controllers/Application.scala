package controllers

import play.api._
import play.api.mvc._
import play.api.Play.current


import models._
import AppDB.simple._

import Database.threadLocalSession

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
