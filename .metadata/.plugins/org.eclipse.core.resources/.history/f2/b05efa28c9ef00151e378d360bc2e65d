package KTech.core;

import KTech.components.*;

public class KTech implements Runnable {

	private Thread thread;
	protected Game game;
	private Window window;
	private Renderer renderer;
	private Input input;
	private Physics physics;
	boolean limitFramerate = true;
	boolean render;

	private int width = 800 / 2, height = 600 / 2;
	private static float scale = 2.0f;
	private String title = "KTech Game Engine";
	private double frameCap = 1.0 / 60.0;
	private boolean isRunning = false;
	
	private boolean debug = false;

	public KTech(Game game) {
		this.game = game;
	}

	public void start() {
		if (isRunning)
			return;
		System.out.println("Booting Successful!\nBeginning initialization...\n");
		// Initialize engine
		window = new Window(this);
		renderer = new Renderer(this);
		input = new Input(this);
		physics = new Physics();
		
		thread = new Thread(this);
		System.out.println("Engine Initialization Successful!\n");
		thread.run();
	}

	public void stop() {
		if (!isRunning)
			return;

		isRunning = false;
		System.out.println("Shutting down game");
	}

	public void run() {
		isRunning = true;

		double firstTime = 0;
		double lastTime = System.nanoTime() / 1000000000.0;
		double passedTime = 0;
		double unprocessedTime = 0;
		double frameTime = 0;
		int frames = 0;

		while (isRunning) {
			if (limitFramerate)
				render = false;
			else 
				render = true;

			firstTime = System.nanoTime() / 1000000000.0;
			passedTime = firstTime - lastTime;
			lastTime = firstTime;

			unprocessedTime += passedTime;
			frameTime += passedTime;

			while (unprocessedTime >= frameCap) {
				game.update(this, (float) frameCap);
				physics.update();
				input.update();
				unprocessedTime -= frameCap;
				render = true;
			}

			if (frameTime >= 1) {

				frameTime = 0;
			
				if (debug)
					System.out.println("FPS: " + frames);

				frames = 0;
			}

			if (render) { //TODO RENDERING
				renderer.clear();
				
				game.render(this, renderer);
				
				window.update();
				
				frames++;
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		cleanUp();
	}

	private void cleanUp() {
		window.cleanUp();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Window getWindow() {
		return window;
	}
	
	public void debugFPS(boolean debug) {
		this.debug = debug;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public Physics getPhysics() {
		return physics;
	}

	public void setPhysics(Physics physics) {
		this.physics = physics;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	
	public void debugOutput(String output) {
		System.out.println("[DEBUG] " + output);
	}
	
	public void limitFramerate(boolean limit) {
		limitFramerate = limit;
	}
}
