package com.Runner.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class FondoInput extends InputListener{

	Fondo fondo;
	Music musica;
	
	FondoInput(Fondo fondo){
		super();
		this.fondo = fondo;
	}
	

	@Override
public boolean touchDown(InputEvent event, float x, float y, int pointer,
		int button) {

	return super.touchDown(event, x, y, pointer, button);
}



}