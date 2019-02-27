package flappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BirdImage {
	private BufferedImage img = null;
	private static int bird_dia = 34; //bird accurate width
	public static int x = (GamePanel.WIDTH/2)-(bird_dia/2);
	public static int y = (GamePanel.HEIGHT)/2;
	
	private static int speed = 2;
	private int accelaration = 1;
	
	public BirdImage() {
		LoadImage();
	}

	private void LoadImage() {
		try {
			 img = ImageIO.read(new File("C:\\Users\\Hp\\Desktop\\java\\Flappy Bird\\Images\\Bird.png"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void drawBird(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public void birdMovement() {
		if(y>=0 && y<=GamePanel.HEIGHT) {
			speed+=accelaration;//3,4,5
			y+=speed;//400+3,400+3+4,400+3+4+5
		}
		else {
			reset();
		}
	}

	private void reset() {
		// TODO Auto-generated method stub
		speed = 2;
		y = GamePanel.HEIGHT/2;
	}

}
