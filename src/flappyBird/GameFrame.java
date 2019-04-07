package flappyBird;

import java.awt.Container;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

//import swing.NewFrame;

public class GameFrame extends JFrame{
	private Container c;
	
	public GameFrame() {
		c = this.getContentPane();
		c.setLayout(new FlowLayout());
		GamePanel gamePanel = new GamePanel();
		gamePanel.setPreferredSize(new Dimension(600,800));
		//BirdImage bi = new BirdImage();
		//gamePanel.add(bi);
		
		c.add(gamePanel);
	}
	
	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(600,800);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Game Panel");
		//GamePanel gamePanel = new GamePanel();
		//frame.add(gamePanel);
		
	}
}
