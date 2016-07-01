package example.objects;

import java.awt.event.KeyEvent;

import KTech.components.Button;
import KTech.components.CollisionDetection;
import KTech.components.Entity;
import KTech.components.TextBox;
import KTech.components.Timer;
import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.graphics.Image;
import example.states.ExampleState;


// remember when using the y coordinate the smaller the number the higher it is on the screen    example: y = 40 is higher on the screen than y = 100   the x coordinate works as expected 

public class Player extends Entity {

	int x, y; //Players x and y coordinates
	int x2, y2;// Collision box test x and y coordinates 
	int mousex = 0, mousey = 0;
	
	Image guy = new Image("/enemy.png");
	Button button;// you need one of these for every button that you want to have   
	TextBox textbox; //you need one of these for every text box you want to have
	Timer timer = new Timer();
	static CollisionDetection Test, CD2;// this needs to be static so that other collision detection boxes can detect this one 
	
	public Player(int x, int y) { // Constructor takes in values of coordinates to spawn at
		this.x = x;
		this.y = y;
		
	
		ExampleState.manager.addEntity(timer);
		
		timer.set(10);
		
		// textbox =new TextBox(x, y, size x ,size y ,outside color ,inside color , text color, amount of letters shown);
		textbox = new TextBox(30, 30, 60, 28, 0xE3091F, 0x09E31B, 0xffffff, 10);
		ExampleState.manager.addEntity(textbox);// this is needed for the textbox to work
		// to open and edit the text in the textbox click on it 
		// to exit the textbox  press the ' key  caution this exits out of all textboxes
		
		
		//Test = new CollisionDetection(x, y, size x, size y, box is visible true or false);
		Test = new CollisionDetection(x2, y2, 10, 10,true);
		ExampleState.manager.addEntity(Test);
		
		// 2nd collision box 
		CD2 = new CollisionDetection(100, 50, 30, 30,true);
		ExampleState.manager.addEntity(CD2);
		
	}
	
	@Override
	public void update(KTech kt, float time) { 
		
		if (kt.getInput().isKeyHeld(KeyEvent.VK_UP)) {// press the up arrow key to make the guy move up 
			y--;
		}
		if (timer.isComplete()){
			kt.debugOutput("it has been 10 seconds since you launched the game");
			timer.reset();
		}
		
		x2 = kt.getInput().getMouseX();// get the x coordinate of the mouse
		y2 = kt.getInput().getMouseY();// get the y coordinate of the mouse 
		
		Test.x = x2;// change the x y of the collision boxes like this 
		Test.y = y2;
		
		if (Test.Detect(CD2) || CD2.Detect(Test)) {//this determines if the box test has collided with CD2 or CD2 has collided with test if the if statement is not set up like this the detection may not work properly 

			kt.debugOutput("detected a collision between CD2 and test");
		}
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(guy, x, y); // rendering image at x and y coordinates
		
		//example of how to get the text from the text box 
		r.drawString(textbox.getText(), 0xffffff, 30, 5);// REMOVABLE, this line is displaying the contents of the textbox TextBox
	}

	@Override
	public void componentEvent(String name, Entity object) {
		
	}

	@Override
	public void dispose() {
		
	}
}
