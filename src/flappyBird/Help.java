package flappyBird;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help {

	
	
	public Help()
	{
		
		JFrame frame = new JFrame();
		 JLabel HelpBar = new JLabel("Tap the screen again to allow your bird to fly and to start the game. Stay in the middle of screen until the first set of pipes appears. Measure your tap heights to go between the two pipes. The faster you tap, the higher you go. ");
		 HelpBar.setBounds(100,0,200,50);
		  Font textFont = new Font("Arial",Font.BOLD,20);
		 HelpBar.setFont(textFont);
		  
		frame.add(HelpBar);
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
		  frame.setTitle("Settings");
		  frame.setSize(600, 800);
		  frame.setResizable(true);
		  frame.setLocationRelativeTo(null);
		
		
	}
}
