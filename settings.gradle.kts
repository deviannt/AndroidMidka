pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.android.application") {
                useModule("com.android.tools.build:gradle:${extra["agp"]}")
            }
            if (requested.id.id == "org.jetbrains.kotlin.android") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin"]}")
            }
            if (requested.id.id == "org.jetbrains.kotlin.plugin.compose") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin"]}")
            }
            if (requested.id.id == "org.jetbrains.kotlin.kapt") {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin"]}")
            }
            if (requested.id.id == "com.google.dagger.hilt.android") {
                useModule("com.google.dagger:hilt-android-gradle-plugin:${extra["hilt"]}")
            }
            if (requested.id.id == "io.insert-koin.koin") {
                useModule("io.insert-koin:koin-gradle-plugin:${extra["koin"]}")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Определяем версии плагинов
extra["agp"] = "8.8.1"
extra["kotlin"] = "2.0.0"
extra["hilt"] = "2.50"
extra["koin"] = "3.4.0"

rootProject.name = "MidtermAndroid"
include(":app")
