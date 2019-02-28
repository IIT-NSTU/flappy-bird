package flappyBird;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	WallImage wi2 = new WallImage(GamePanel.WIDTH+(GamePanel.WIDTH/2));
	//WallImage wi3 = new WallImage(2*GamePanel.WIDTH);
	
	public GamePanel() {
		LoadImage();
		this.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e) {
        	   super.mousePressed(e);
        	   bi.goUpwards();
           }
			
			
		});
		
		/*this.addKeyListener(new KeyListener() {
			
		

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//super.keyPressed(e);
				bi.goUpwards();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
				
			});*/
		
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
		wi2.drawWall(g);
		//wi3.drawWall(g);
	}
	
	public void Move() {
		bi.birdMovement();
		wi.wallMovement();
		wi2.wallMovement();
		//wi3.wallMovement();
	}
	
}
