plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  namespace = "com.tuapp.webview"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.tuapp.webview"
    minSdk = 24
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
  }

  buildTypes {
    getByName("debug") {
      isMinifyEnabled = false
    }
    getByName("release") {
      isMinifyEnabled = true
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
  kotlinOptions {
    jvmTarget = "17"
  }
  packaging {
    resources.excludes += setOf("META-INF/DEPENDENCIES", "META-INF/LICENSE", "META-INF/NOTICE")
  }
}

dependencies {
  implementation("androidx.activity:activity-ktx:1.9.2")
  implementation("androidx.appcompat:appcompat:1.7.0")
}
