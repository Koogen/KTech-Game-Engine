package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public class Collider extends Component {

	private Entity object;
	private float x, y, hW, hH;
	
	public Collider() {
		setName("collider");
	}
	
	@Override
	public void update(KTech kt, Entity object, float time) {
		
		if (object == null) 
			this.object = object;
		
		hW = object.getWidth() / 2;
		hH = object.getHeight() / 2;
		x = object.getX() + hW;
		y = object.getY() + hH;
		kt.getPhysics().addCollider(this);
	}

	@Override
	public void render(KTech kt, Renderer r) {
		
	}
	
	public void collision(Entity object) {
		System.out.println("noot");
		this.object.componentEvent(name, object);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float gethW() {
		return hW;
	}

	public void sethW(float hW) {
		this.hW = hW;
	}

	public float gethH() {
		return hH;
	}

	public void sethH(float hH) {
		this.hH = hH;
	}

	public Entity getObject() {
		return object;
	}

	public void setObject(Entity object) {
		this.object = object;
	}
	
}
