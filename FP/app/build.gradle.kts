plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.fp"
    compileSdk = 35  // Turunkan dari 36 ke 35

    defaultConfig {
        applicationId = "com.example.fp"
        minSdk = 24  // Turunkan dari 35 ke 24 (lebih kompatibel)
        targetSdk = 35  // Turunkan dari 36 ke 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // AndroidX Core
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity:1.9.3")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.12.0")

    // Google Sign-In & Calendar API
    implementation("com.google.android.gms:play-services-auth:21.2.0")
    implementation("com.google.api-client:google-api-client-android:2.2.0")
    implementation("com.google.api-client:google-api-client-gson:2.2.0")
    implementation("com.google.apis:google-api-services-calendar:v3-rev20230815-2.0.0")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}