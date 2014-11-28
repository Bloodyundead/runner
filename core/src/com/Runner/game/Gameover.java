package com.Runner.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Gameover extends Image{
	public Gameover()
	{
		super(new Texture("Gameover.png"));
		
	}

	public void act(float delta) {
		super.act(delta);
		this.setX(this.getX(0));
			
	}
}