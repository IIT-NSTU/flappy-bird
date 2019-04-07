package flappyBird;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BirdImage extends BirdSet{
	private BufferedImage img = null;
	private static int bird_dia = 36; //bird accurate width
	public static int x = (GamePanel.WIDTH/2)-(bird_dia/2);
	public static int y = (GamePanel.HEIGHT)/2;
	
	private static int speed = 2;
	private int accelaration = 1;
	
	public BirdImage() {
		LoadImage();
	}

	private void LoadImage() {
		//Settings s = new Settings();
		try {
			 img = ImageIO.read(new File("G:\\\\Project\\\\Flappy Bird\\\\flappy-bird2\\\\Images\\\\1.png"));
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
			boolean option = GamePanel.popUpMessage();
			if(option) {
				try {
					Thread.sleep(500);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
				
				reset();
				
			}	
			else {
				
				JFrame frame = MainBird.getWindow();
				frame.dispose();
				MainBird.timer.stop();
			}
			
			
		}
	}
	
	public void goUpwards() {
		speed = -17;
	}

	public static void reset() {
		speed = 2;
		y = GamePanel.HEIGHT/2;
		GamePanel.score=0;
	}
	public static Rectangle getBirdRect() {
		Rectangle birdRect = new Rectangle(x,y,bird_dia,35);
		return birdRect;
	}

}
