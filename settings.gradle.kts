rootProject.name = "MultiProject Test"
include("core")
include("api")

dependencyResolutionManagement {
    includeBuild("build-logic")
    repositories.gradlePluginPortal()
}

//TODO: CONTINUE https://docs.gradle.org/current/userguide/multi_project_builds.html