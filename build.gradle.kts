plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.omar.callervoice"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.omar.callervoice"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
