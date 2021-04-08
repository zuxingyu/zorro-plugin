package com.github.zuxingyu.zorroplugin.services

import com.github.zuxingyu.zorroplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
