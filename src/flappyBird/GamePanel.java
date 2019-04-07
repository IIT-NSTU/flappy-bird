package flappyBird;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	
	
	public static final int WIDTH =600;
	public static final int HEIGHT =800;
	
	public static boolean Gameover = false;
	public static int score = 0;
	
	private int xCoor=0;
	private BufferedImage img,img2;
	
	BirdImage bi = new BirdImage();
	WallImage wi = new WallImage(GamePanel.WIDTH);
	WallImage wi2 = new WallImage(GamePanel.WIDTH+(GamePanel.WIDTH/2));
	
	public GamePanel() {
		LoadImage();
		this.addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent e) {
        	   super.mousePressed(e);
        	   bi.goUpwards();
           }
		});
	}

	private void LoadImage() {
		try {
			img = ImageIO.read(new File("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\background.png"));
			img2 = ImageIO.read(new File("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\3ce108acea3d06fddbf96e9682f5ea25.jpg"));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, xCoor, 0,null);
		g.drawImage(img2, xCoor+1600, 0,null);
		bi.drawBird(g);
		wi.drawWall(g);
		wi2.drawWall(g);
		
		g.setFont(new Font("Tahoma",Font.BOLD,40));

		g.drawString("Score "+score, WIDTH/2, 100);
	}
	
	public void Move() {
		bi.birdMovement();
		wi.wallMovement();
		wi2.wallMovement();
		
		if(Gameover) {
			wi.X=GamePanel.WIDTH;
			wi2.X=GamePanel.WIDTH+(GamePanel.WIDTH/2);
			Gameover = false;
		}
		
		 xCoor+=-6;
		 
		 if(xCoor==-2400) {
			 xCoor=0;
		 }
		 
		 System.out.println(wi.X+"->"+BirdImage.x +"    :    "+ wi2.X+"->"+BirdImage.x);
		 if(wi.X==BirdImage.x || wi2.X==BirdImage.x) {
			 score+=1;
			 System.out.println(score);
		 }
	}
	
	public static boolean popUpMessage()
	{
		int result = JOptionPane.showConfirmDialog(null, "Game Over,Your score is"+score+"\n Do you want To restart the game","Game Over",JOptionPane.YES_NO_OPTION);
	
	   if(result==JOptionPane.YES_OPTION)
	   {
		   return true;
	   }
	   else {
		   return false;
		   
	   }
	
	
	}
	
}
