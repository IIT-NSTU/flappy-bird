package flappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class WallImage {
	
	private Random r = new Random();
	public int X;
	public int Y = r.nextInt(GamePanel.HEIGHT-400)+200;//max=600,min=200
	private int width_wall = 60;
	private int height = GamePanel.HEIGHT-Y;//800-600=200;
	private int gap = 150;
	public int speed = -6;
	
	private BufferedImage img = null;
	
	public WallImage(int X){
		this.X=X;
		LoadImage();
	}

	private void LoadImage() {
		try {
			img = ImageIO.read(new File("C:\\Users\\Hp\\Desktop\\java\\Flappy Bird\\Images\\Wall.png"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void drawWall(Graphics g) {
		g.drawImage(img, X+100, Y, null);//bottom
		g.drawImage(img, X+100, (-GamePanel.HEIGHT)+(Y-gap), null);//top = -800+(600-150)
		//g.drawImage(img, X+100, (-GamePanel.HEIGHT)+(Y-gap), null);
	}
	
	
	public void wallMovement() {
		X+=speed;
		if(X<=-width_wall) {
			X=GamePanel.WIDTH;
			Y=r.nextInt(GamePanel.HEIGHT-400)+200;
			height = GamePanel.HEIGHT-Y;
		}
	}
}

	


