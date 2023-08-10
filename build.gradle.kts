plugins {
    alias(libs.plugins.multiplatform).apply(false)
    alias(libs.plugins.compose).apply(false)
    alias(libs.plugins.cocoapods).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.libres).apply(false)
    alias(libs.plugins.buildConfig).apply(false)
    alias(libs.plugins.kotlinx.serialization).apply(false)
//    alias(libs.plugins.realm).apply(false)
}
// TODO Change to commented alias when Realm support for backlinks is stable
buildscript {
    dependencies {
        classpath(libs.realm.gradle)
    }
}
