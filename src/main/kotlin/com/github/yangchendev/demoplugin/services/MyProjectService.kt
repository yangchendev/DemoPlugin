package com.github.yangchendev.demoplugin.services

import com.github.yangchendev.demoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
