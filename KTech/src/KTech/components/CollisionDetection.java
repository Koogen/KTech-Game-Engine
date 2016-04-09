package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public class CollisionDetection extends Entity {

	public int x, y, sizex, sizey, st = 0;
	public boolean Detected = false, Visable = true;
	public boolean p1, p2, p3, p4;
	public CollisionDetection DetectName;
	float scale = 1;

	public CollisionDetection(int x, int y, int sizex, int sizey, boolean Visable) {
		this.x = x;
		this.y = y;
		this.sizex = sizex;
		this.sizey = sizey;
		this.Visable = Visable;
	}

	@Override
	public void update(KTech kt, float time) {
		// TODO Auto-generated method stub
		if (st == 0) {
			scale = kt.getScale();
			System.out.println(scale);
			st++;
		}
	}

	@Override
	public void render(KTech kt, Renderer r) {
		// TODO Auto-generated method stub
		if(Visable == true){
			r.drawRectangle(x, y, sizex, sizey, 0xD1365A);
		}
	}

	@Override
	public void componentEvent(String name, Entity object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Boolean Detect(CollisionDetection DetectName) {
		/*
		  p1_____p2
		   |     |
		   |     | 
		  p3_____p4*/
		 
		this.DetectName = DetectName;
		if ((x * scale >= DetectName.x * scale)
				&& (x * scale <= (DetectName.x * scale)
						+ (DetectName.sizex * scale))
				&& (y * scale >= DetectName.y * scale)
				&& (y * scale <= ((DetectName.y * scale) + (DetectName.sizey * scale)))) {
			p1 = true;
		}
		if ((((x * scale) + (sizex * scale)) >= DetectName.x * scale)
				&& (((x * scale) + (sizex * scale)) <= ((DetectName.x * scale) + (DetectName.sizex * scale)))
				&& (y * scale >= DetectName.y * scale)
				&& (y * scale <= ((DetectName.y * scale) + (DetectName.sizey * scale)))) {
			p2 = true;
		}
		if ((x * scale >= DetectName.x * scale)
				&& (x * scale <= (DetectName.x * scale)
						+ (DetectName.sizex * scale))
				&& (((y * scale) + (sizey * scale)) >= DetectName.y * scale)
				&& (((y * scale) + (sizey * scale)) <= ((DetectName.y * scale) + (DetectName.sizey * scale)))) {
			p3 = true;
		}
		if ((((x * scale) + (sizex * scale)) >= DetectName.x * scale)
				&& (((x * scale) + (sizex * scale)) <= ((DetectName.x * scale) + (DetectName.sizex * scale)))
				&& (((y * scale) + (sizey * scale)) >= DetectName.y * scale)
				&& ((y * scale) + (sizey * scale)) <= ((DetectName.y * scale) + (DetectName.sizey * scale))) {
			p4 = true;
		}
		if (p1 == true || p2 == true || p3 == true || p4 == true) {
			p1 = false;
			p2 = false;
			p3 = false;
			p4 = false;
			return true;
		}

		return false;

	}

}
