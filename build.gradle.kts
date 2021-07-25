plugins {
	id("org.jetbrains.kotlin.jvm") version ("1.5.0")
}

val appName = "gdx-study"
val gdxVersion = "1.10.0"
val roboVMVersion = "2.3.12"
val box2DLightsVersion = "1.5"
val ashleyVersion = "1.7.3"
val aiVersion = "1.8.2"
val gdxControllersVersion = "2.1.0"
val kotlinVersion = "1.5.0"

allprojects {
	apply {
		plugin("org.jetbrains.kotlin.jvm")
	}
	
	version = "1.0"
	
	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven("https://oss.sonatype.org/content/repositories/snapshots/")
		maven("https://oss.sonatype.org/content/repositories/releases/")
	}
	
	sourceSets.main {
		java.srcDirs("src/main/java","src/main/kotlin")
		resources.srcDirs("src/main/assets")
	}
	
	tasks {
		compileJava {
			sourceCompatibility = "11"
			targetCompatibility = "11"
		}
		compileTestJava {
			sourceCompatibility = "11"
			targetCompatibility = "11"
		}
		compileKotlin {
			kotlinOptions.jvmTarget = "11"
		}
		compileTestKotlin {
			kotlinOptions.jvmTarget = "11"
		}
	}
}

project(":desktop") {
	dependencies {
		implementation(project(":core"))
		api("com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion")
		api("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
		api("com.badlogicgames.gdx:gdx-bullet-platform:$gdxVersion:natives-desktop")
		api("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-desktop")
		api("com.badlogicgames.gdx:gdx-tools:$gdxVersion")
		api("com.badlogicgames.gdx-controllers:gdx-controllers-desktop:$gdxControllersVersion")
		api("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-desktop")
		api("de.tomgrill.gdxdialogs:gdx-dialogs-desktop:1.2.5")
	}
}

project(":core") {
	dependencies {
		api("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
		api("com.badlogicgames.gdx:gdx:$gdxVersion")
		api("com.badlogicgames.gdx:gdx-bullet:$gdxVersion")
		api("com.badlogicgames.gdx:gdx-freetype:$gdxVersion")
		api("com.badlogicgames.ashley:ashley:$ashleyVersion")
		api("com.badlogicgames.box2dlights:box2dlights:$box2DLightsVersion")
		api("com.badlogicgames.gdx:gdx-ai:$aiVersion")
		api("com.badlogicgames.gdx-controllers:gdx-controllers-core:$gdxControllersVersion")
		api("com.badlogicgames.gdx:gdx-box2d:$gdxVersion")
		api("com.underwaterapps.overlap2druntime:overlap2d-runtime-libgdx:0.1.0")
		api("com.esotericsoftware.spine:spine-libgdx:3.6.53.1")
		api("com.kotcrab.vis:vis-ui:1.3.0")
		api("net.dermetfan.libgdx-utils:libgdx-utils:0.13.4")
		api("net.dermetfan.libgdx-utils:libgdx-utils-box2d:0.13.4")
		api("de.tomgrill.gdxdialogs:gdx-dialogs-core:1.2.5")
		api("io.github.libktx:ktx-actors:1.10.0-b1")
		api("io.github.libktx:ktx-app:1.10.0-b1")
		api("io.github.libktx:ktx-ashley:1.10.0-b1")
		api("io.github.libktx:ktx-assets:1.10.0-b1")
		api("io.github.libktx:ktx-assets-async:1.10.0-b1")
		api("io.github.libktx:ktx-async:1.10.0-b1")
		api("io.github.libktx:ktx-box2d:1.10.0-b1")
		api("io.github.libktx:ktx-collections:1.10.0-b1")
		api("io.github.libktx:ktx-freetype:1.10.0-b1")
		api("io.github.libktx:ktx-freetype-async:1.10.0-b1")
		api("io.github.libktx:ktx-graphics:1.10.0-b1")
		api("io.github.libktx:ktx-i18n:1.10.0-b1")
		api("io.github.libktx:ktx-inject:1.10.0-b1")
		api("io.github.libktx:ktx-json:1.10.0-b1")
		api("io.github.libktx:ktx-log:1.10.0-b1")
		api("io.github.libktx:ktx-math:1.10.0-b1")
		api("io.github.libktx:ktx-preferences:1.10.0-b1")
		api("io.github.libktx:ktx-scene2d:1.10.0-b1")
		api("io.github.libktx:ktx-style:1.10.0-b1")
		api("io.github.libktx:ktx-tiled:1.10.0-b1")
		api("io.github.libktx:ktx-vis:1.10.0-b1")
		api("io.github.libktx:ktx-vis-style:1.10.0-b1")
	}
}