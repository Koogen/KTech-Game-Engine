package KTech.graphics;

public class ImageTile extends Image {

	public int tileWidth, tileHeight;
	
	public ImageTile(String path, int tileWidth, int tileHeight) {
		super(path);
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
	}

}
