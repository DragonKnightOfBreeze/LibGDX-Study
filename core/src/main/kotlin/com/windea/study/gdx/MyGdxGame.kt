package com.windea.study.gdx

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.*
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.*
import com.badlogic.gdx.utils.ScreenUtils

class MyGdxGame : ApplicationAdapter() {
	private lateinit var batch: SpriteBatch //Batch必须是唯一的单例！
	private lateinit var img: Texture
	private lateinit var shape: ShapeRenderer
	
	//创建
	override fun create() {
		batch = SpriteBatch()
		img = Texture("badlogic.jpg")
		shape = ShapeRenderer()
	}
	
	//渲染
	override fun render() {
		//清屏
		ScreenUtils.clear(1f, 0f, 0f, 1f)
		
		//渲染图片
		batch.begin()
		batch.draw(img, 0f, 0f)
		batch.end()
		
		//渲染圆形
		shape.begin(ShapeRenderer.ShapeType.Filled)
		shape.circle(50f, 50f, 50f)
		shape.end()
	}
	
	//释放
	override fun dispose() {
		batch.dispose()
		img.dispose()
	}
}