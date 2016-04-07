package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public class Button extends Entity {
	int mousex, mousey, x, y, xSize, ySize, texty, textx, bColor, tColor,st=0;
	float scale;
	String text;
	boolean isPressed = false;

	public Button(int x, int y, int xSize, int ySize, String text, int textx,
			int texty, int bColor, int tColor) {
		this.x = x;
		this.y = y;
		this.xSize = xSize;
		this.ySize = ySize;
		this.bColor = bColor;
		this.text = text;
		this.tColor = tColor;
		this.texty = texty;
		this.textx = textx;

	}
	@Override
	public void update(KTech kt, float time) {
		// TODO Auto-generated method stub
		
		if (st == 0) {
			scale = kt.getScale();
			System.out.println(scale);
			st++;
		}
		
		mousex = kt.getInput().getMouseX();
		mousey = kt.getInput().getMouseY();
		if (((mousex >= x*scale) && (mousex <= (x*scale) + (xSize*scale)))
				&& ((mousey >= y*scale) && (mousey <= (y*scale) + (ySize*scale)))
				&& kt.getInput().isMBPressed(1)) {
			isPressed = true;
		} else {
			isPressed = false;
		}
	}

	@Override
	public void render(KTech kt, Renderer r) {
		// TODO Auto-generated method stub
		r.drawRectangle(x, y, xSize, ySize, bColor);
		r.drawString(text, tColor, x + textx, y + texty);
	}

	@Override
	public void componentEvent(String name, Entity object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isPressed() {
		return isPressed;

	}
}
