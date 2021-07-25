import org.jetbrains.kotlin.utils.addToStdlib.*

val mainClassName = "com.windea.study.gdx.desktop.DesktopLauncher"
val assetsDir = File("src/main/assets")

tasks.create<JavaExec>("run"){
	dependsOn(tasks["classes"])
	classpath = sourceSets.main.get().runtimeClasspath
	main = mainClassName
	standardInput = System.`in`
	workingDir = assetsDir
	isIgnoreExitValue = true
}

tasks.create<JavaExec>("debug"){
	dependsOn(tasks["classes"])
	classpath = sourceSets.main.get().runtimeClasspath
	main = mainClassName
	standardInput = System.`in`
	workingDir = assetsDir
	isIgnoreExitValue = true
	debug = true
}

tasks.create<Jar>("dist"){
	dependsOn(tasks["classes"])
	dependsOn(configurations["runtimeClasspath"])
}
