package com.github.francoisminaud.mayopycharmplugin.services

import com.github.francoisminaud.mayopycharmplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
