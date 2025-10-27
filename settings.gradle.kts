pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application", "com.android.library" ->
                    useModule("com.android.tools.build:gradle:8.4.1")
                "org.jetbrains.kotlin.android", "org.jetbrains.kotlin.jvm", "org.jetbrains.kotlin.kapt", "org.jetbrains.kotlin.multiplatform" ->
                    useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
            }
        }
    }
}
rootProject.name = "WebLabs-MobIDE"
include(":app")
