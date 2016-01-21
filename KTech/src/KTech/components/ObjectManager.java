package KTech.components;

import java.util.ArrayList;

import KTech.core.KTech;
import KTech.core.Renderer;

public class ObjectManager {

	private ArrayList<Entity> objects = new ArrayList<Entity>();
	
	public void updateEntities(KTech kt, float time) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).update(kt, time);
			
			if(objects.get(i).isDead())
				objects.remove(i);
		}
	}
	
	public void renderEntities(KTech kt, Renderer r) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).render(kt, r);
		}
	}
	
	public void disposeEntities() {
		for (Entity go : objects) {
			go.dispose();
		}
	}
	
	public void addEntity(Entity object) {
		objects.add(object);
	}
	
	public Entity findEntity(String name) {
		for(Entity go : objects) {
			if(go.getName().equalsIgnoreCase(name)) {
				return go;
			}
		}
		
		return null;
	}
}
