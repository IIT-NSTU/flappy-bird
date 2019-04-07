package flappyBird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;



public class MainBird {
	
	private static JFrame frame;
	public static Timer timer,timer2;

	
	private MainBird(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(GamePanel.WIDTH, GamePanel.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Flappy Bird");
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	private void rendering() {
		MenuPanel mp = new MenuPanel();
	    mp.setLayout(new GridBagLayout());
	    JButton btn = new JButton("PLAY");
	    btn.setBackground(Color.blue);
	    btn.setForeground(Color.WHITE);
		mp.add(btn);
		 JButton stg = new JButton("Settings");
		 stg.setBackground(Color.blue);
		  stg.setForeground(Color.WHITE);
			mp.add(stg);
		GamePanel gp = new GamePanel();
		//Timer
		timer = new Timer(30,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gp.repaint();
				gp.Move();
			}
			
		});
				
		
		frame.add(mp);
		frame.setVisible(true);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//super.dispose();
				frame.remove(mp);
				frame.add(gp);
				gp.setVisible(true);
				frame.revalidate();
				//timer.start();
			}

		});
		
		stg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//frame.remove(mp);
				new Settings();
				
				
			}
		});
		timer.start();
		
		
	
		
	}
	
	public static JFrame getWindow() {
		return getWindow();
	}

	public static void main(String[] args) {
		MainBird mb = new MainBird();
		mb.rendering();
	}
}
