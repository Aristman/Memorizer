import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.testBaseDependencies() {
    addTestImplementation(Dependencies.Test.junit)
    addAndroidTestImplementation(Dependencies.Test.extJunitKtx)
    addAndroidTestImplementation(Dependencies.Test.espresso)
    addAndroidTestImplementation(Dependencies.Test.monitor)
}

fun DependencyHandler.composeBomUiToolingDependencies() {
    addImplementation(Dependencies.Jetpack.Compose.bomUiToolingPreview)
    addDebugImplementation(Dependencies.Jetpack.Compose.bomUiTooling)
}

fun DependencyHandler.composeBomTestsDependencies() {
    addAndroidTestImplementation(Dependencies.Jetpack.Compose.Test.bomJunit)
    addDebugImplementation(Dependencies.Jetpack.Compose.Test.bomManifest)
}

fun DependencyHandler.addImplementation(dependency: String) {
    add("implementation", dependency)
}

fun DependencyHandler.addTestImplementation(dependency: String) {
    add("testImplementation", dependency)
}

fun DependencyHandler.addAndroidTestImplementation(dependency: String) {
    add("androidTestImplementation", dependency)
}

fun DependencyHandler.addDebugImplementation(dependency: String) {
    add("debugImplementation", dependency)
}

fun DependencyHandler.addKapt(dependency: String) {
    add("kapt", dependency)
}
