// @SOURCE:/Users/tituschirchir/E-Karo/E-Karo/conf/routes
// @HASH:78ec85c8bb3d52bb1392b616ab38aba9f31d4969
// @DATE:Sun May 11 18:15:27 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Projects_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_changePassword3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("changePassword"))))
        

// @LINE:13
private[this] lazy val controllers_Application_authenticateChangePassword4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("changePassword"))))
        

// @LINE:16
private[this] lazy val controllers_Application_users5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:18
private[this] lazy val controllers_Application_signup6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:19
private[this] lazy val controllers_Application_authenticateSignUp7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:20
private[this] lazy val controllers_Application_moreinfo8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("moreinfo"))))
        

// @LINE:21
private[this] lazy val controllers_Application_moreInformation9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("moreinfo"))))
        

// @LINE:22
private[this] lazy val controllers_Application_logout10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:25
private[this] lazy val controllers_Projects_add11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects"))))
        

// @LINE:27
private[this] lazy val controllers_Projects_addGroup12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:28
private[this] lazy val controllers_Projects_deleteGroup13 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:29
private[this] lazy val controllers_Projects_renameGroup14 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:31
private[this] lazy val controllers_Projects_delete15 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Projects_rename16 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true))))
        

// @LINE:34
private[this] lazy val controllers_Projects_addUser17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/team"))))
        

// @LINE:35
private[this] lazy val controllers_Projects_removeUser18 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/team"))))
        

// @LINE:38
private[this] lazy val controllers_Tasks_index19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks"))))
        

// @LINE:39
private[this] lazy val controllers_Tasks_add20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks"))))
        

// @LINE:40
private[this] lazy val controllers_Tasks_update21 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("task", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_Tasks_delete22 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("task", """[^/]+""",true))))
        

// @LINE:43
private[this] lazy val controllers_Tasks_addFolder23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/folder"))))
        

// @LINE:44
private[this] lazy val controllers_Tasks_deleteFolder24 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks/folder"))))
        

// @LINE:45
private[this] lazy val controllers_Tasks_renameFolder25 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("project/"),DynamicPart("project", """[^/]+""",true),StaticPart("/tasks/folder"))))
        

// @LINE:48
private[this] lazy val controllers_Application_javascriptRoutes26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascripts/routes"))))
        

// @LINE:51
private[this] lazy val controllers_Assets_at27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Projects.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """changePassword""","""controllers.Application.changePassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """changePassword""","""controllers.Application.authenticateChangePassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.users()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.authenticateSignUp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """moreinfo""","""controllers.Application.moreinfo(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """moreinfo""","""controllers.Application.moreInformation(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects""","""controllers.Projects.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.addGroup()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.deleteGroup(group:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.renameGroup(group:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.delete(project:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.rename(project:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/team""","""controllers.Projects.addUser(project:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/team""","""controllers.Projects.removeUser(project:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks""","""controllers.Tasks.index(project:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks""","""controllers.Tasks.add(project:Long, folder:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$task<[^/]+>""","""controllers.Tasks.update(task:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$task<[^/]+>""","""controllers.Tasks.delete(task:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/folder""","""controllers.Tasks.addFolder()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>/tasks/folder""","""controllers.Tasks.deleteFolder(project:Long, folder:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """project/$project<[^/]+>/tasks/folder""","""controllers.Tasks.renameFolder(project:Long, folder:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascripts/routes""","""controllers.Application.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Projects_index0(params) => {
   call { 
        invokeHandler(controllers.Projects.index(), HandlerDef(this, "controllers.Projects", "index", Nil,"GET", """ The home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_changePassword3(params) => {
   call { 
        invokeHandler(controllers.Application.changePassword(), HandlerDef(this, "controllers.Application", "changePassword", Nil,"GET", """""", Routes.prefix + """changePassword"""))
   }
}
        

// @LINE:13
case controllers_Application_authenticateChangePassword4(params) => {
   call { 
        invokeHandler(controllers.Application.authenticateChangePassword(), HandlerDef(this, "controllers.Application", "authenticateChangePassword", Nil,"POST", """""", Routes.prefix + """changePassword"""))
   }
}
        

// @LINE:16
case controllers_Application_users5(params) => {
   call { 
        invokeHandler(controllers.Application.users(), HandlerDef(this, "controllers.Application", "users", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:18
case controllers_Application_signup6(params) => {
   call { 
        invokeHandler(controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:19
case controllers_Application_authenticateSignUp7(params) => {
   call { 
        invokeHandler(controllers.Application.authenticateSignUp(), HandlerDef(this, "controllers.Application", "authenticateSignUp", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:20
case controllers_Application_moreinfo8(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.moreinfo(username), HandlerDef(this, "controllers.Application", "moreinfo", Seq(classOf[String]),"GET", """""", Routes.prefix + """moreinfo"""))
   }
}
        

// @LINE:21
case controllers_Application_moreInformation9(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.moreInformation(username), HandlerDef(this, "controllers.Application", "moreInformation", Seq(classOf[String]),"POST", """""", Routes.prefix + """moreinfo"""))
   }
}
        

// @LINE:22
case controllers_Application_logout10(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:25
case controllers_Projects_add11(params) => {
   call { 
        invokeHandler(controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Nil,"POST", """ Projects""", Routes.prefix + """projects"""))
   }
}
        

// @LINE:27
case controllers_Projects_addGroup12(params) => {
   call { 
        invokeHandler(controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Nil,"POST", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:28
case controllers_Projects_deleteGroup13(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(controllers.Projects.deleteGroup(group), HandlerDef(this, "controllers.Projects", "deleteGroup", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:29
case controllers_Projects_renameGroup14(params) => {
   call(params.fromQuery[String]("group", None)) { (group) =>
        invokeHandler(controllers.Projects.renameGroup(group), HandlerDef(this, "controllers.Projects", "renameGroup", Seq(classOf[String]),"PUT", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:31
case controllers_Projects_delete15(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Projects_rename16(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:34
case controllers_Projects_addUser17(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.addUser(project), HandlerDef(this, "controllers.Projects", "addUser", Seq(classOf[Long]),"POST", """""", Routes.prefix + """projects/$project<[^/]+>/team"""))
   }
}
        

// @LINE:35
case controllers_Projects_removeUser18(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.removeUser(project), HandlerDef(this, "controllers.Projects", "removeUser", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>/team"""))
   }
}
        

// @LINE:38
case controllers_Tasks_index19(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Tasks.index(project), HandlerDef(this, "controllers.Tasks", "index", Seq(classOf[Long]),"GET", """ Tasks""", Routes.prefix + """projects/$project<[^/]+>/tasks"""))
   }
}
        

// @LINE:39
case controllers_Tasks_add20(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.add(project, folder), HandlerDef(this, "controllers.Tasks", "add", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """projects/$project<[^/]+>/tasks"""))
   }
}
        

// @LINE:40
case controllers_Tasks_update21(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(controllers.Tasks.update(task), HandlerDef(this, "controllers.Tasks", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """tasks/$task<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_Tasks_delete22(params) => {
   call(params.fromPath[Long]("task", None)) { (task) =>
        invokeHandler(controllers.Tasks.delete(task), HandlerDef(this, "controllers.Tasks", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """tasks/$task<[^/]+>"""))
   }
}
        

// @LINE:43
case controllers_Tasks_addFolder23(params) => {
   call { 
        invokeHandler(controllers.Tasks.addFolder(), HandlerDef(this, "controllers.Tasks", "addFolder", Nil,"POST", """""", Routes.prefix + """tasks/folder"""))
   }
}
        

// @LINE:44
case controllers_Tasks_deleteFolder24(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.deleteFolder(project, folder), HandlerDef(this, "controllers.Tasks", "deleteFolder", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>/tasks/folder"""))
   }
}
        

// @LINE:45
case controllers_Tasks_renameFolder25(params) => {
   call(params.fromPath[Long]("project", None), params.fromQuery[String]("folder", None)) { (project, folder) =>
        invokeHandler(controllers.Tasks.renameFolder(project, folder), HandlerDef(this, "controllers.Tasks", "renameFolder", Seq(classOf[Long], classOf[String]),"PUT", """""", Routes.prefix + """project/$project<[^/]+>/tasks/folder"""))
   }
}
        

// @LINE:48
case controllers_Application_javascriptRoutes26(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """ Javascript routing""", Routes.prefix + """assets/javascripts/routes"""))
   }
}
        

// @LINE:51
case controllers_Assets_at27(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     