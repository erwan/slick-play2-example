package models

import slick.session.Database
import play.api.db.DB
import play.api.Application
import slick.driver.ExtendedProfile

trait DBeable {

  def getDb(implicit app : Application) = {
    Database.forDataSource(DB.getDataSource())
  }

}
