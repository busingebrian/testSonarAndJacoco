plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.docker.compose)
    alias(libs.plugins.sonarqube)
}
apply(from = "${project.rootDir}/tools/jacoco.gradle")
android {
    namespace = "com.businge.testsonarandjacoco"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.businge.testsonarandjacoco"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

sonarqube {
    properties {
        property ("sonar.projectKey", "testSonarAndJacoco")
        property ("sonar.projectName", "testSonarAndJacoco")
        property ("sonar.host.url", "http://localhost:9000")
        property ("sonar.sourceEncoding", "UTF-8")
        property("sonar.coverage.jacoco.xmlReportPaths", "${buildDir}/reports/jacoco/testDebugUnitTest/testDebugUnitTestCoverage.xml")
        property("sonar.junit.reportPaths", "${buildDir}/test-results/testDebugUnitTest")
    }
}
