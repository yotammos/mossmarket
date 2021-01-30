plugins {
    id("java")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.amazonaws:aws-lambda-java-core:1.2.1")
    implementation("com.amazonaws:aws-lambda-java-events:3.6.0")
    implementation("com.amazonaws:aws-java-sdk-dynamodb:1.11.938")

    implementation("com.google.dagger:dagger:2.16")
    implementation("org.immutables:value:2.8.2")

    implementation("com.google.code.gson:gson:2.8.6")

    annotationProcessor("com.google.dagger:dagger-compiler:2.16")
    annotationProcessor("org.immutables:value:2.8.2")

    testImplementation("junit:junit:4.13.1")
}
