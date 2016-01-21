package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public abstract class Component {

	protected String name = null;
	public abstract void update(KTech kt, Entity object, float time);
	public abstract void render(KTech kt, Renderer r);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
