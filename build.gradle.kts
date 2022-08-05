plugins {
    groovy
}

group = "com.wukong.nexus"
version = "1.0-SNAPSHOT"
description = "Fake project meant to be imported in an IDE (IntelliJ) to edit groovy scripts with classpath-aware completion"

sourceSets {
    main {
        java {
            srcDir("files/groovy")
        }
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.12")
    implementation("org.sonatype.nexus:nexus-core:3.40.1-01")
    implementation("org.sonatype.nexus:nexus-script:3.40.1-01")
    implementation("org.sonatype.nexus:nexus-security:3.40.1-01")
    implementation("org.sonatype.nexus.plugins:nexus-script-plugin:3.40.1-01")

    implementation("org.sonatype.nexus:nexus-repository:3.40.1-01")
    implementation("org.sonatype.nexus.plugins:nexus-repository-maven:3.40.1-01")
    implementation("org.sonatype.nexus.plugins:nexus-repository-raw:3.40.1-01")
}