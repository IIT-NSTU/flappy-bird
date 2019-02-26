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
	
	private JFrame frame;
	private Timer timer;

	
	private MainBird(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(GamePanel.WIDTH, GamePanel.HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Flappy Bird");
		frame.setVisible(true);
		frame.setResizable(true);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	private void rendering() {
		MenuPanel mp = new MenuPanel();
	    mp.setLayout(new GridBagLayout());
	    JButton btn = new JButton("PLAY");
	    btn.setBackground(Color.blue);
	    btn.setForeground(Color.WHITE);
		mp.add(btn);
		GamePanel gp = new GamePanel();
		//Timer
		timer = new Timer(20,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gp.repaint();
				
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
		timer.start();
		
		
		/*while(mp.StartingPoint==false) {
			try {
				Thread.sleep(10);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}*/
		//frame.remove(mp);
		//frame.add(gp);
		//gp.setVisible(true);
		//frame.revalidate();
		//timer.start();
		
		
	}
	
	public static void main(String[] args) {
		MainBird mb = new MainBird();
		mb.rendering();
	}
}
