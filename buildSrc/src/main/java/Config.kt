import org.gradle.api.JavaVersion

object AppConfig {
    const val applicationId = "ru.marslab.memorizer"
    const val minSdk = 28
    const val completeSdk = 33
    const val targetSdk = 33
    const val jvmTarget = "11"
    val javaVersion = JavaVersion.VERSION_11

    object LogEnabled {
        const val debug = true
        const val release = true
    }
}

enum class Module {
    app,
    presentation,
    domain,
    data,
    common,
}

fun Module.getNameSpace(): String = "${AppConfig.applicationId}.$name"
fun Module.moduleName(): String = ":$name"
