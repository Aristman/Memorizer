@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id(Dependencies.Dagger.hiltPlugin)
}

android {
    namespace = Module.presentation.getNameSpace()
    compileSdk = AppConfig.completeSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    api(project(Module.domain.moduleName()))
    api(project(Module.common.moduleName()))
    implementation(Dependencies.Jetpack.core)
    implementation(Dependencies.Jetpack.viewModel)
    implementation(platform(Dependencies.Jetpack.Compose.bom))
    implementation(Dependencies.Jetpack.Compose.bomMaterial)
    implementation(Dependencies.Jetpack.Compose.activity)

    kapt(Dependencies.Dagger.hiltCompiler)
    implementation(Dependencies.Dagger.hilt)

    composeBomUiToolingDependencies()
    composeBomTestsDependencies()
    testUiBaseDependencies()
}
