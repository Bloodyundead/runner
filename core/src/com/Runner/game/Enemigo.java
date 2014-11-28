package com.Runner.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo extends Image {

	Stage stage2;
	ArrayList<Image>images;
	int dibujo_actual = 0;
	float tiempo_act = 0;
	Personaje p;
	int x = 0;
	
	public Enemigo(Personaje p){
		super();
		this.p=p;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("Pelota2.png")));
		this.setY(70);
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
		this.setX(this.getX()-10);
		
//		Rectangle r1=new Rectangle(this.getX(), this.getY(), 100, 100);
//		Rectangle r2=new Rectangle(p.getX(), p.getY(), 100, 100);
//		if(r1.overlaps(r2))
//			System.out.println("Colision!");
	
	if(Gdx.input.justTouched()){
		x++;
	}
		
		if(chocar()==true && x == 1)
		{
			Principal pa = new Principal();
			stage2 = new Stage();
			stage2.addActor(new Gameover());
			stage2.draw();
			stage2.act();			
		}
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setX(600);
		images.get(dibujo_actual).setY(this.getY());
		images.get(dibujo_actual).setX(this.getX());
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
	
	public boolean chocar(){
		
		if(this.getX()<p.getX()+50
				&& this.getX()+50>p.getX()
				&& this.getY()<p.getY()+50
				&& this.getY()+50>p.getY())
		return true;
		else
		return false;
		
	}
}
