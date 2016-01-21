package KTech.components;

import java.util.ArrayList;

import KTech.core.KTech;
import KTech.core.Renderer;

public abstract class Entity {

	protected int x, y, width, height;
	protected String name = "missingno";
	protected boolean dead = false;
	protected ArrayList<Component> components = new ArrayList<Component>();
	
	public abstract void update(KTech kt, float time);
	public abstract void render(KTech kt, Renderer r);
	
	public void updateComponents(KTech kt, float time) {
		for (Component c : components) {
			c.update(kt, this, time);
		}
	}
		
	public void renderComponents(KTech kt, Renderer r) {
		for (Component c : components) {
			c.render(kt, r);
		}
	}
	
	public abstract void componentEvent(String name, Entity object);
	public abstract void dispose();
	
	public void addComponent(Component c) {
		components.add(c);
	}
	
	public void removeComponent(String name) {
		for (int i = 0; i < components. size(); i++) {
			if (components.get(i).getName().equalsIgnoreCase(name)) {
				components.remove(i);
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDead() {
		return dead;
	}
	public void setActive(boolean dead) {
		this.dead = dead;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
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
}
