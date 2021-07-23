package com.windea.desktop

import kotlin.jvm.JvmStatic
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.windea.MyGdxGame

//游戏启动类
object DesktopLauncher {
	@JvmStatic fun main(arg: Array<String>) {
		//启动OpenGL程序
		val config = LwjglApplicationConfiguration()
		LwjglApplication(MyGdxGame(), config)
	}
}