package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public interface State {

	public void update(KTech kt, float time);
	public void render(KTech kt, Renderer r);
	public void dispose();
	
}
