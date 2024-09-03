// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
<<<<<<< Updated upstream
        mavenCentral()
        // Add other repositories here
    }
    dependencies {
        classpath("com.chaquo.python:gradle:15.0.1")
        // Add other classpaths here
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
=======
        google()
        mavenCentral()
        maven { url "https://chaquo.com/maven" }  // Correct URL syntax
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:7.0.4'
        classpath "com.chaquo.python:gradle:12.1.0"
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
>>>>>>> Stashed changes
}