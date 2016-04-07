package example.objects;

import java.awt.event.KeyEvent;

import example.states.ExampleState;

import KTech.components.*;
import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.graphics.Image;




public class Player extends Entity {

	int x, y; //Players x and y coordinates
	
	int mousex = 0, mousey = 0;
	
	Image guy = new Image("/enemy.png");
	Button button;// you need one of these for every button that you want to have   
	TextBox textbox; //you need one of these for every text box you want to have
	Timer timer;
	
	public Player(int x, int y) { // Constructor takes in values of coordinates to spawn at
		this.x = x;
		this.y = y;
		
		//button = new Button(x , y ,length of button, height of button , text , position of text x, position of text y , color of button, color of text);
		button = new Button(100, 100, 50, 50, "this is a button ", 15, 25, 0xfffffff, 0x24E040);
		ExampleState.manager.addEntity(button);// this is needed to allow the button to function 
		
		timer = new Timer(10);
		ExampleState.manager.addEntity(timer);
		
		// textbox =new TextBox(x, y, size x ,size y ,outside color ,inside color , text color, amount of letters shown);
		textbox = new TextBox(30, 30, 60, 28, 0xE3091F, 0x09E31B, 0xffffff, 10);
		ExampleState.manager.addEntity(textbox);// this is needed for the textbox to work
		// to open and edit the text in the textbox click on it 
		// to exit the textbox  press the ' key  caution this exits out of all textboxes

	}
	
	@Override
	public void update(KTech kt, float time) { 
		if (button.isPressed()) {
			//Insert what you want the button to do here
			kt.debugOutput("test");
		}
		if (kt.getInput().isKeyHeld(KeyEvent.VK_UP)) {// press the up arrow key to make the guy move up 
			y--;
		}
		if (timer.isComplete()){
			kt.debugOutput("it has been 10 seconds since you launched the game");
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
