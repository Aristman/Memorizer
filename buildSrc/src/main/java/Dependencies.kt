object Dependencies {
    const val gradleVersion = "8.0.0-rc01"
    const val ktLintVersion = "10.3.0"
    const val dependenciesUpdateVersion = "0.42.0"

    object Kotlin {
        const val version = "1.8.0"
        private const val serializationVersion = "1.4.0"
        private const val coroutinesVersion = "1.6.4"

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        const val serialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion"
        const val serializationJson =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"
    }

    object Jetpack {
        private const val coreVersion = "1.10.0"
        private const val fragmentVersion = "1.5.6"
        private const val lifeCycleVersion = "2.6.1"
        private const val pagingVersion = "3.1.1"
        private const val constraintLayoutVersion = "2.1.4"
        private const val appcompatVersion = "1.6.1"
        private const val browserVersion = "1.5.0"

        const val core = "androidx.core:core-ktx:$coreVersion"
        const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleVersion"
        const val lifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycleVersion"
        const val paging = "androidx.paging:paging-runtime:$pagingVersion"
        const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        const val browser = "androidx.browser:browser:$browserVersion"

        object WorkManager {
            private const val version = "2.8.1"

            const val core = "androidx.work:work-runtime-ktx:$version"
            const val test = "androidx.work:work-testing:$version"
        }

        object Compose {
            const val compilerVersion = "1.4.0-alpha01"

            private const val bomVersion = "2023.04.00"
            private const val activityVersion = "1.7.0"

            const val bom = "androidx.compose:compose-bom:$bomVersion"
            const val bomMaterial = "androidx.compose.material:material"
            const val bomFoundation = "androidx.compose.foundation:foundation"
            const val bomUiTooling = "androidx.compose.ui:ui-tooling"
            const val bomUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
            const val bomRxJava2 = "androidx.compose.runtime:runtime-rxjava2"
            const val activity = "androidx.activity:activity-compose:$activityVersion"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifeCycleVersion"

            object Accompanist {
                private const val version = "0.30.0"

                const val permissions = "com.google.accompanist:accompanist-permissions:$version"
            }

            object Test {
                const val bomJunit = "androidx.compose.ui:ui-test-junit4"
                const val bomManifest = "androidx.compose.ui:ui-test-manifest"
            }
        }
    }

    object Google {
        private const val materialVersion = "1.6.1"
        private const val gsonVersion = "2.10.1"

        const val materialDesign = "com.google.android.material:material:$materialVersion"
        const val gson = "com.google.code.gson:gson:$gsonVersion"
    }

    object FireBase {
        const val pluginVersion = "2.0.0"
        const val crashliticsGradleVersion = "2.9.0"
        private const val bomVersion = "31.4.0"

        const val bom = "com.google.firebase:firebase-bom:$bomVersion"
        const val messagingBom = "com.google.firebase:firebase-messaging-ktx"
        const val storageBom = "com.google.firebase:firebase-storage-ktx"
        const val firestoreBom = "com.google.firebase:firebase-firestore-ktx"
        const val databaseBom = "com.google.firebase:firebase-database-ktx"
        const val analyticsBom = "com.google.firebase:firebase-analytics-ktx"
        const val crashlyticsBom = "com.google.firebase:firebase-crashlytics-ktx"
        const val appMessagingBom = "com.google.firebase:firebase-inappmessaging-display"
        const val dynamicLinksBom = "com.google.firebase:firebase-dynamic-links"
    }

    object Test {
        private const val junitVersion = "4.13.2"
        private const val extJunitVersion = "1.1.5"
        private const val espressoVersion = "3.5.1"
        private const val monitorVersion = "1.6.0"
        private const val rulesVersion = "1.5.0"
        private const val runnerVersion = "1.5.2"

        const val junit = "junit:junit:$junitVersion"
        const val extJunitKtx = "androidx.test.ext:junit-ktx:$extJunitVersion"
        const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"

        const val monitor = "androidx.test:monitor:$monitorVersion"
        const val rules = "androidx.test:rules:$rulesVersion"
        const val runner = "androidx.test:runner:$runnerVersion"
    }

    object Cicerone {
        private const val version = "7.1"

        const val core = "com.github.terrakok:cicerone:$version"
    }

    object Dagger {
        const val daggerVersion = "2.22.1" // 2.42
        const val hiltVersion = "2.42"

        private const val javaxAnnotationVersion = "1.3.2"
        private const val javaxInjectVersion = "1"
        private const val glassFishVersion = "10.0-b28"

        const val hiltPlugin = "com.google.dagger.hilt.android"
        const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
        const val daggerAndroid = "com.google.dagger:dagger-android:$daggerVersion"
        const val daggerAndroidProcessor =
            "com.google.dagger:dagger-android-processor:$daggerVersion"
        const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
        const val javaxAnnotation =
            "javax.annotation:javax.annotation-api:$javaxAnnotationVersion"
        const val javaxInject = "javax.inject:javax.inject:$javaxInjectVersion"
        const val glassFish = "org.glassfish:javax.annotation:$glassFishVersion"
    }

    object Timber {
        private const val version = "5.0.1"

        const val core = "com.jakewharton.timber:timber:$version"
    }

    object Retrofit {
        private const val version = "2.9.0" // 2.9.0

        const val core = "com.squareup.retrofit2:retrofit:$version"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$version"
        const val rxJava2Adapter = "com.squareup.retrofit2:adapter-rxjava2:$version"
    }

    object OkHttp {
        private const val version = "5.0.0-alpha.10"

        const val core = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Coil {
        private const val version = "2.1.0"

        const val core = "io.coil-kt:coil:$version"
        const val compose = "io.coil-kt:coil-compose:$version"
    }

    object DataStore {
        private const val version = "1.0.0"

        const val proto = "androidx.datastore:datastore:$version"
        const val preferences = "androidx.datastore:datastore-preferences:$version"
    }
}
