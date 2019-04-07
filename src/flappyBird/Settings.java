package flappyBird;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Settings extends BirdSet{
	public  String BirdURL ;
public Settings() {
	      BirdURL = "";
	      setBird("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\1.png");
	      //setBird("file:///C:/Users/aladn/eclipse-workspace/Flappy_Birds/src/flappyBird/gold.png")
		  JFrame frame = new JFrame();
		  JLabel birdIcon = new JLabel("Change Your Bird Icon ?");
		  birdIcon.setBounds(100,0,2000,50);
		  Font textFont = new Font("Arial",Font.BOLD,20);
		  birdIcon.setFont(textFont);
	  ImageIcon icon = new ImageIcon("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\background.png");
		  JLabel label = new JLabel(icon);
		  label.add(birdIcon);
		  frame.add(label);
		  frame.setDefaultCloseOperation
		         (JFrame.DISPOSE_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
		  frame.setTitle("Settings");
		  frame.setSize(600, 800);
		  frame.setResizable(true);
		  frame.setLocationRelativeTo(null);
		  ImageIcon icon3 = new ImageIcon("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\bird 4.png");
		  ImageIcon iconDown = new ImageIcon("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\bird3.png");
		  ImageIcon iconRight = new ImageIcon("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\flappy_bird1.png");
		  ImageIcon iconRightDown = new ImageIcon("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\images2.png");
	      JRadioButton r1=new JRadioButton();
	     
	     
		  JRadioButton r2=new JRadioButton(); 
		  
		  JRadioButton r3=new JRadioButton();
		  
          JRadioButton r4=new JRadioButton();  
      
		//  Component icon1 = new ImageIcon("C:\\Users\\aladn\\eclipse-workspace\\Flappy_Birds\\Images\\gamePanel.jpg");
		  JLabel l1  = new JLabel(icon3);
		  l1.setBounds(120, 40, 100, 60);
		  label.add(l1);
		  
		  JLabel l2 = new JLabel(iconDown);
		  l2.setBounds(120, 260, 100, 60);
		  label.add(l2);
		  JLabel l3 = new JLabel(iconRight);
		  l3.setBounds(400, 40, 100, 60);
		  label.add(l3);
		  JLabel l4= new JLabel(iconRightDown);
		  l4.setBounds(400, 270, 100, 60);
		  label.add(l4);
	     //   r1.add(icon1);
		  r1.setBounds(75,50,30,30);    
		  r2.setBounds(75,300,30,30);    
		  r3.setBounds(330, 50, 30, 30);
		  r4.setBounds(330, 300, 30, 30);
		  ButtonGroup bg=new ButtonGroup();    
		  bg.add(r1);bg.add(r2);
		  bg.add(r3);
		  bg.add(r4);
		  r1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					setBird("G:\\\\Project\\\\Flappy Bird\\\\flappy-bird2\\\\Images\\\\bird 4.png");
					
				}
		    	  
		      });
		  r2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					// TODO Auto-generated method stub
					System.out.println("Hello");
					setBird("G:\\\\Project\\\\Flappy Bird\\\\flappy-bird2\\\\Images\\\\bird3.png");
				}
		    	  
		      });
		  r3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					setBird("G:\\\\Project\\\\Flappy Bird\\\\flappy-bird2\\\\Images\\\\flappy_bird1.png");
				}
		    	  
		      });
		    r4.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							setBird("G:\\\\Project\\\\Flappy Bird\\\\flappy-bird2\\\\Images\\\\images2.png");
						    no = 4;
						    frame.dispose();
						}
				    	  
				      });
		  label.add(r1);label.add(r2);
		  label.add(r3);
		  label.add(r4);
		  Image icon1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\aladn\\eclipse-workspace\\Flappy_Birds\\Images\\right.png");
		  frame.setIconImage(icon1);
		  //URL location = (URL)icon;
	}
	

	public void setBird(String i) {
		BirdURL = i ;
	}
	public  String GetBird() {
		return BirdURL ;
	}
}
