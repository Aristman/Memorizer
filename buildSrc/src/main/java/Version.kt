import java.io.FileInputStream
import java.util.Properties

// Формат номера версии
// develop version name 1.2.3.35(123)
// reseale version name 1.2.3

private const val VERSION_PROPERTIES_FILE = "./version.properties"
private const val MAJOR = "major"
private const val MINOR = "minor"
private const val PATCH = "patch"
private const val DEVELOP = "develop"
private const val BUILD_NUMBER = "build"

object Version {
    private val versionProperties = Properties().apply {
        load(FileInputStream(VERSION_PROPERTIES_FILE))
    }
    private val major: Int by lazy { versionProperties[MAJOR].toString().toInt() }
    private val minor: Int by lazy { versionProperties[MINOR].toString().toInt() }
    private val patch: Int by lazy { versionProperties[PATCH].toString().toInt() }
    private val developCode: Int
        get() = versionProperties[DEVELOP].toString().toInt()
    val versionCode: Int
        get() = versionProperties[BUILD_NUMBER].toString().toInt()
    val versionName: String
        get() = "$major.$minor.$patch"

    val debugSuffix: String
        get() = ".$developCode-($versionCode)"
}
