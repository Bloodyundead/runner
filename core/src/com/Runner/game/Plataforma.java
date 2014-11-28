package com.Runner.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Plataforma extends Image{
	int velocidad = 70;
	public Plataforma()
	{
		super(new Texture("tierra.png"));
		this.setX(500);
		this.setY(-200);
	}

	public void act(float delta) {
		super.act(delta);
		this.setX(this.getX()-delta*velocidad);
		if(this.getX()<400){
			this.setX(500);
		}
	}
}
