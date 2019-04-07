package flappyBird;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WallImage {
	
	private Random r = new Random();
	public int X;
	public int Y = r.nextInt(GamePanel.HEIGHT-400)+200;//max=600,min=200
	private int width_wall = 60;
	private int height = GamePanel.HEIGHT-Y;//800-600=200;
	private int gap = 200;
	public int speed = -6;
	
	private BufferedImage img = null;
	
	public WallImage(int X){
		this.X=X;
		LoadImage();
	}

	private void LoadImage() {
		try {
			img = ImageIO.read(new File("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\Wall.png"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void drawWall(Graphics g) {
		g.drawImage(img, X, Y, null);//bottom
		g.drawImage(img, X, (-GamePanel.HEIGHT)+(Y-gap), null);//top = -800+(600-150)=-350
		//g.drawImage(img, X+100, (-GamePanel.HEIGHT)+(Y-gap), null);
	}
	
	public void wallMovement() {
		X+=speed; //600-6,600-6-6......0,-1,-2....-60
		          //900-6,900-6-6..........-60
		if(X<=-width_wall-70) {
			X=GamePanel.WIDTH;
			Y=r.nextInt(GamePanel.HEIGHT-400)+200;
			height = GamePanel.HEIGHT-Y;
		}
	
	Rectangle lowerRect = new Rectangle(X,Y,width_wall,height);
	Rectangle upperRect = new Rectangle(X,0,width_wall,GamePanel.HEIGHT-(height+gap));
	if(lowerRect.intersects(BirdImage.getBirdRect())||upperRect.intersects(BirdImage.getBirdRect())) {
		boolean option = GamePanel.popUpMessage();
		if(option) {
			try {
				Thread.sleep(500);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
			
			BirdImage.reset();
			wall_reset();
		}	
		else {
			JFrame frame = MainBird.getWindow();
			frame.dispose();
			MainBird.timer.stop();
		}
	}
		
		
}

	private void wall_reset() {
		Y = r.nextInt(GamePanel.HEIGHT-400)+200;
		height = GamePanel.HEIGHT-Y;
		GamePanel.Gameover=true;
	}

}
	


