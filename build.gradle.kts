plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.l237even.bookkeeping"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.l237even.bookkeeping"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
