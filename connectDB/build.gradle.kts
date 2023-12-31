plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.postgresql:postgresql:42.6.0")
    implementation(project(":models"))
    implementation(project(":deserialization"))
    implementation("org.flywaydb:flyway-core:7.15.0")
}

tasks.test {
    useJUnitPlatform()
}