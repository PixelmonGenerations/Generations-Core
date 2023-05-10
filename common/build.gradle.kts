
loom.silentMojangMappingsLicense()

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://jitpack.io") // BinarySMD

    maven("https://nexus.resourcefulbees.com/repository/maven-public/")

    maven("https://maven.thepokecraftmod.com/releases")
    maven("https://maven.parchmentmc.org")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

sourceSets {
    main {
        resources.srcDir("src/main/generated/resources")
    }
}

dependencies {
    minecraft("com.mojang:minecraft:${rootProject.properties["minecraft_version"]}")
    mappings(loom.officialMojangMappings())
    // We depend on fabric loader here to use the fabric @Environment annotations and get the mixin dependencies
    // Do NOT use other classes from fabric loader
    modImplementation("net.fabricmc:fabric-loader:${rootProject.properties["fabric_loader_version"]}")
    // Remove the next line if you don't want to depend on the API
    modApi("dev.architectury:architectury:${rootProject.properties["architectury_version"]}")
    modImplementation("earth.terrarium:botarium-common-${rootProject.properties["minecraft_version"]}:${rootProject.properties["botarium_version"]}")

    implementation("com.thepokecraftmod:modelLoader:1.2.4")
    implementation("com.thepokecraftmod:renderer:1.2.4")
    implementation("org.tukaani:xz:1.9")
    implementation("com.thebombzen:jxlatte:1.1.0")

    compileOnly("org.lwjgl:lwjgl-assimp:3.3.2")
}

architectury {
    common("forge", "fabric")
    platformSetupLoomIde()
}

loom.accessWidenerPath.set(file("src/main/resources/generationscore.accesswidener"))