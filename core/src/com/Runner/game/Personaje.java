package com.Runner.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Personaje extends Actor{

	ArrayList<Image>images;
	int dibujo_actual = 0;
	float tiempo_act = 0;
	float velocidad_y = 0;
	float acceleracion_y = 0.01f;
	
	public Personaje(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("run01.png")));
		images.add(new Image(new Texture("run02.png")));
		images.add(new Image(new Texture("run03.png")));
		images.add(new Image(new Texture("run04.png")));
	}

	@Override
	public void act(float delta) {
		super.act(delta);
		tiempo_act+= delta;
		if(tiempo_act>0.1f){
		dibujo_actual++;
		tiempo_act = 0;
		}
		
		if(dibujo_actual >= images.size()){
			dibujo_actual = 0;
		}
		
		velocidad_y+=acceleracion_y;
		this.setY(this.getY()+velocidad_y);
		//Gravedad
		acceleracion_y -= 0.17;
		if(this.getY()<=70)
		{
			velocidad_y = 0;
			acceleracion_y = 0;
			this.setY(70);
		}
	}
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setY(70);
		images.get(dibujo_actual).setX(0);
		images.get(dibujo_actual).getX();
		images.get(dibujo_actual).setY(this.getY());
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
	void saltar()
	{
		acceleracion_y = 2;
	}
}
