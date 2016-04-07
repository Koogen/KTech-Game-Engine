package example.states;

import KTech.components.ObjectManager;
import KTech.components.State;
import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.graphics.Image;
import example.objects.Player;

public class ExampleState implements State {
	
	Image door = new Image("/door.png"); // Making an image and loading it from the res folder
	
	public static ObjectManager manager = new ObjectManager(); // Making new object manager
	
	public ExampleState() {
		
		manager.addEntity(new Player(70, 70)); // Adding player object at 50,50
	
		//You could add more entities here, each one being rendered underneath another.
		//So after adding a new one, it would be rendered underneath what was created first
	}

	@Override
	public void update(KTech kt, float time) {
		manager.updateEntities(kt, time); // Do not edit or remove this line
		
	}

	@Override
	public void render(KTech kt, Renderer r) {
		manager.renderEntities(kt, r); // Do not edit or remove this line
		
		
		r.drawImage(door, 50, 50); // Rendering the image, will be rendered on top of the player because it existed first
		
	}

	@Override
	public void dispose() {
		
	}

}
