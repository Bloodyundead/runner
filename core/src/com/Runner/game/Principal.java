package com.Runner.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Principal extends ApplicationAdapter implements InputProcessor{
	SpriteBatch batch;
	Stage stage;
	Texture img1;
	Texture img;
	Personaje personaje;
	Image image1;
	Image image2;
	int frame;
	Music musica;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		image2 = new Image();
		image1 = new Image();
		img1 = new Texture("Fondito.png");		
		personaje = new Personaje();
		stage = new Stage();
		Texture texture_image2 = new Texture("Fondito.png");
		Fondo f1 = new Fondo(texture_image2);
		stage.addActor(f1);
		f1.setX((int)(0));
		stage.addActor(personaje);
		stage.addActor(new Plataforma());
		stage.addActor(new Plataforma2());
		stage.addActor(new Enemigo(personaje));
		Gdx.input.setInputProcessor(this);
		musica = Gdx.audio.newMusic(Gdx.files.internal("01 A Night Of Dizzy Spells.mp3"));
	}
	
	void agregarEnemigo(){
		Enemigo ene = new Enemigo(personaje);
		stage.addActor(ene);
		ene.setX(450);
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
		stage.act();
		
		if(frame%200==0)
			agregarEnemigo();
			
		frame++;
		
		//Enemigo e = new Enemigo(personaje);
		//if(e.chocar()== true){
		//	System.out.println("Gane");
	//	}
		
		musica.play();
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		personaje.saltar();
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
