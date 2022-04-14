// https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins
// https://docs.gradle.org/current/samples/sample_convention_plugins.html

plugins {
    id("default-module-config")
}

dependencies {
    // compileOnly because we don't want the core being included into the runtime classpath twice

    compileOnly(project(":core"))
}

application {
    mainClass.set("com.example.api.Api")
}