plugins {
    id("com.android.library")
}

android {
    namespace = "io.github.libxposed.helper"
    compileSdk = 33
    buildToolsVersion = "33.0.1"

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    buildFeatures {
        resValues = false
        buildConfig = false
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles("proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.5.0")
    compileOnly("io.github.libxposed:api:100")
}
