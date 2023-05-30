@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Module.common.getNameSpace()
    compileSdk = AppConfig.completeSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.javaVersion
        targetCompatibility = AppConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Jetpack.Compose.compilerVersion
    }
}

dependencies {
    implementation(Dependencies.Jetpack.fragment)
    implementation(Dependencies.Jetpack.viewModel)
    implementation(platform(Dependencies.Jetpack.Compose.bom))
    implementation(Dependencies.Jetpack.Compose.bomMaterial)
    implementation(Dependencies.Dagger.hilt)
    kapt(Dependencies.Dagger.hiltCompiler)
    implementation(Dependencies.Timber.core)
    implementation(Dependencies.Cicerone.core)
    composeBomUiToolingDependencies()
    testUiBaseDependencies()
    composeBomTestsDependencies()
}
