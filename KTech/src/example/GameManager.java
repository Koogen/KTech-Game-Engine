package example;

import java.awt.event.KeyEvent;

import KTech.core.Game;
import KTech.core.KTech;
import KTech.core.Renderer;
import example.states.ExampleState;

public class GameManager extends Game {

	static KTech game;
	
	public GameManager() {
		push(new ExampleState()); // Making a state, basically a screen for the game. If you want to make another, just use the setState method
	}
	
	public static void main(String[] args) {
		
		// Making a new game. Pretty self explanitory
		
		game = new KTech(new GameManager());
		
		game.setTitle("Example Project");
		
		game.setWidth(500 / 2);
		game.setHeight(400 / 2);
		
		game.setScale(2); // This is 2 by default, it upscales the coordinates and window by whatever is provided
		
		game.start();
	}
	
	@Override
	public void update(KTech kt, float time) { //This method is run every frame, used for AI, getting input, ect
		state().update(kt, time); //This line is required for the game to run
		
		if (kt.getInput().isKeyPressed(KeyEvent.VK_ESCAPE)) 
			game.stop();
		
	}

	@Override
	public void render(KTech kt, Renderer r) { // Used to draw to the screen
		state().render(kt, r); //This line is required for the game to run
		
	}

}
