package com.Runner.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Fondo extends Image{

		
	
	Fondo(Texture texture){
		super(texture);
		addListener(new FondoInput(this));
	}
	public void act(float delta){
		super.act(delta);
		this.setX(this.getX()-2);
		
		if(this.getX()<-625){
			this.setX(0);
		}
	}
}