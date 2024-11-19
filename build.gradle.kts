// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {

//    id("com.android.application") version "8.7.2" apply false
//    id("com.android.library") version "8.7.2" apply false
//    id("org.jetbrains.kotlin.android") version "2.0.20" apply false

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin) apply false


}