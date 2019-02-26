package flappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH =600;
	public static final int HEIGHT =800;
	
	private int xCoor=0;
	private BufferedImage img;
	
	BirdImage bi = new BirdImage();
	WallImage wi = new WallImage(GamePanel.WIDTH);
	
	public GamePanel() {
		LoadImage();
		
	}

	private void LoadImage() {
		try {
			img = ImageIO.read(new File("C:\\Users\\Hp\\Desktop\\java\\Flappy Bird\\Images\\gamePanel.jpg"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, xCoor, 0,null);
		bi.drawBird(g);
		wi.drawWall(g);
	}
	
}
