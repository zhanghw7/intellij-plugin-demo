package com.github.zhanghw7.intellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.zhanghw7.intellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
