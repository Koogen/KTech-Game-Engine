package KTech.components;

import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.core.Game;

public class TextBox extends Entity {
	public boolean clicked = false;
	public static String textout = "";
	StringBuilder text;
	public static int mousex, mousey, i = 0, ii;
	public int limit;
	public int x, y, sizeX, sizeY, st=0;// size
	float scale = 1;
	public int outsideColor, insideColor, textColor;// color

	public TextBox(int x, int y, int sizeX, int sizeY, int outsideColor,
			int insideColor, int textColor, int limit) {
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.outsideColor = outsideColor;
		this.insideColor = insideColor;
		this.textColor = textColor;
		this.limit = limit;
	}

	@Override
	public void update(KTech kt, float time) {
		if (st == 0) {
			scale = kt.getScale();
			System.out.println(scale);
			st++;
		}
		// TODO Auto-generated method stub
		mousex = kt.getInput().getMouseX();
		mousey = kt.getInput().getMouseY();
		StringBuilder sb = new StringBuilder(textout);

		if ((((mousex >= x * scale) && (mousex <= (x * scale) + (sizeX * scale)))
				&& ((mousey >= y * scale) && (mousey <= (y * scale)
						+ (sizeY * scale))) && kt.getInput().isMBPressed(1))) {
			clicked = true;
			// kt.debugOutput("clicked");

		}

		else if (kt.getInput().isKeyPressed(222)) {
			clicked = false;
			System.out.println("test");
		} else if (clicked == true) {
			if (kt.getInput().isKeyPressed('A')) {
				// kt.debugOutput("a");
				textout += 'a';
				i++;
			}
			if (kt.getInput().isKeyPressed('B')) {
				// kt.debugOutput("b");
				textout += 'b';
				i++;
			}
			if (kt.getInput().isKeyPressed('C')) {
				// kt.debugOutput("c");
				textout += 'c';
				i++;
			}
			if (kt.getInput().isKeyPressed('D')) {
				// kt.debugOutput("d");
				textout += 'd';
				i++;
			}
			if (kt.getInput().isKeyPressed('E')) {
				// kt.debugOutput("e");
				textout += 'e';
				i++;
			}
			if (kt.getInput().isKeyPressed('F')) {
				// kt.debugOutput("f");
				textout += 'f';
				i++;
			}
			if (kt.getInput().isKeyPressed('G')) {
				// kt.debugOutput("g");
				textout += 'g';
				i++;
			}
			if (kt.getInput().isKeyPressed('H')) {
				// kt.debugOutput("h");
				textout += 'h';
				i++;
			}
			if (kt.getInput().isKeyPressed('I')) {
				// kt.debugOutput("i");
				textout += 'i';
				i++;
			}
			if (kt.getInput().isKeyPressed('J')) {
				// kt.debugOutput("j");
				textout += 'j';
				i++;
			}
			if (kt.getInput().isKeyPressed('K')) {
				// kt.debugOutput("k");
				textout += 'k';
				i++;
			}
			if (kt.getInput().isKeyPressed('L')) {
				// kt.debugOutput("l");
				textout += 'l';
				i++;
			}
			if (kt.getInput().isKeyPressed('M')) {
				// kt.debugOutput("m");
				textout += 'm';
				i++;
			}
			if (kt.getInput().isKeyPressed('N')) {
				// kt.debugOutput("n");
				textout += 'n';
				i++;
			}
			if (kt.getInput().isKeyPressed('O')) {
				// kt.debugOutput("o");
				textout += 'o';
				i++;
			}
			if (kt.getInput().isKeyPressed('P')) {
				// kt.debugOutput("p");
				textout += 'p';
				i++;
			}
			if (kt.getInput().isKeyPressed('Q')) {
				// kt.debugOutput("q");
				textout += 'q';
				i++;
			}
			if (kt.getInput().isKeyPressed('R')) {
				// kt.debugOutput("r");
				textout += 'r';
				i++;
			}
			if (kt.getInput().isKeyPressed('S')) {
				// kt.debugOutput("s");
				textout += 's';
				i++;
			}
			if (kt.getInput().isKeyPressed('T')) {
				// kt.debugOutput("t");
				textout += 't';
				i++;
			}
			if (kt.getInput().isKeyPressed('U')) {
				// kt.debugOutput("u");
				textout += 'u';
				i++;
			}
			if (kt.getInput().isKeyPressed('V')) {
				// kt.debugOutput("v");
				textout += 'v';
				i++;
			}
			if (kt.getInput().isKeyPressed('W')) {
				// kt.debugOutput("W");
				textout += 'W';
				i++;
			}
			if (kt.getInput().isKeyPressed('X')) {
				// kt.debugOutput("x");
				textout += 'x';
				i++;
			}
			if (kt.getInput().isKeyPressed('Y')) {
				// kt.debugOutput("y");
				textout += 'y';
				i++;
			}
			if (kt.getInput().isKeyPressed('Z')) {
				// kt.debugOutput("z");
				textout += 'z';
				i++;
			}
			if (kt.getInput().isKeyPressed(32)) {
				// kt.debugOutput("space");
				textout += ' ';
				i++;
			}
			if (kt.getInput().isKeyPressed('1')
					&& !(kt.getInput().isKeyHeld(16))) {
				// kt.debugOutput("1");
				textout += '1';
				i++;
			}
			if (kt.getInput().isKeyPressed('2')) {
				// kt.debugOutput("2");
				textout += '2';
				i++;
			}
			if (kt.getInput().isKeyPressed('3')) {
				// kt.debugOutput("3");
				textout += '3';
				i++;
			}
			if (kt.getInput().isKeyPressed('4')) {
				// kt.debugOutput("4");
				textout += '4';
				i++;
			}
			if (kt.getInput().isKeyPressed('5')) {
				// kt.debugOutput("5");
				textout += '5';
				i++;
			}
			if (kt.getInput().isKeyPressed('6')) {
				// kt.debugOutput("6");
				textout += '6';
				i++;
			}
			if (kt.getInput().isKeyPressed('7')) {
				// kt.debugOutput("7");
				textout += '7';
				i++;
			}
			if (kt.getInput().isKeyPressed('8')) {
				// kt.debugOutput("8");
				textout += '8';
				i++;
			}
			if (kt.getInput().isKeyPressed('9')) {
				// kt.debugOutput("9");
				textout += '9';
				i++;
			}
			if (kt.getInput().isKeyPressed('0')) {
				// kt.debugOutput("0");
				textout += '0';
				i++;
			}
			if (kt.getInput().isKeyPressed('1') && kt.getInput().isKeyHeld(16)) {
				// kt.debugOutput("!");
				textout += '!';
				i++;
			}
			if (kt.getInput().isKeyPressed('/') && kt.getInput().isKeyHeld(16)) {
				// kt.debugOutput("?");
				textout += '?';
				i++;
			}
			if (kt.getInput().isKeyPressed('.')) {
				// kt.debugOutput(".");
				textout += '.';
				i++;
			}
			if (kt.getInput().isKeyPressed('-')) {
				// kt.debugOutput("-");
				textout += '-';
				i++;
			}
			if (kt.getInput().isKeyPressed(',')) {
				// kt.debugOutput(",");
				textout += ',';
				i++;
			}
			if (kt.getInput().isKeyPressed(8)) {
				// kt.debugOutput("backspace");
				if (textout.length() > 0) {
					text = sb.deleteCharAt(textout.length() - 1);
					textout = text.toString();
					i--;
					ii--;
				}
			}
		}
		getText();
	}

	@Override
	public void render(KTech kt, Renderer r) {
		// TODO Auto-generated method stub
		r.drawRectangle(x, y, sizeX, sizeY, outsideColor);
		r.drawRectangle(x + 4, y + 4, sizeX - 8, sizeY - 8, insideColor);
		if ((i != limit) && (i <= limit)) {
			r.drawString(textout, textColor, x + 5, y + (((int) sizeY / 2) - 2));
		} else if (i >= limit) {
			// kt.debugOutput("limiting visable text");
			ii = i - limit;
			r.drawString(textout.substring(ii, i), textColor, x + 5, y
					+ (((int) sizeY / 2) - 2));
		}
	}

	public String getText() {
		return textout;
	}

	@Override
	public void componentEvent(String name, Entity object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
