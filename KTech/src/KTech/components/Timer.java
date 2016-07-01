package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;

public class Timer extends Entity {

	private int seconds;

	static boolean shouldRun = false;
	boolean start = false;
	public static boolean complete = false;

	public void set (int seconds) {
		this.seconds = seconds;
	}
	
	public void reset() {
		complete = false;
		start = false;
		shouldRun = false;
	}
	
	@Override
	public void update(KTech kt, float time) {

		if (kt.getFramerate() != 0) {
			start = true;
		}

		if (start) {

			if (!shouldRun) {
				seconds = seconds * kt.getFramerate();

				shouldRun = true;
			}

			if (shouldRun) {
				if (seconds > 0) {
					seconds--;
				} else if (seconds == 0) {
					complete = true;
					shouldRun = false;
				} else if (seconds < 0) {
					seconds = 0;
				}
			}
		}
	}

	@Override
	public void render(KTech kt, Renderer r) {

	}

	@Override
	public void componentEvent(String name, Entity object) {

	}

	@Override
	public void dispose() {

	}

	public boolean isComplete() {
		return complete;
	}
}
