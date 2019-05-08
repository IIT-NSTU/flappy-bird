package flappyBird;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPage extends JFrame{
	
	private Container c;
	private JButton b1,b2,b3,b4;
	private Font f;
	private Cursor cursor1;
	private ImageIcon img;
	
	public MenuPage() {
        initComponents();
    }

	private void initComponents() {
		c = this.getContentPane();
		c.setLayout(null);
		//c.setBackground(Color.LIGHT_GRAY);
		
		f = new Font("Arial", Font.BOLD, 25);
		cursor1 = new Cursor(Cursor.HAND_CURSOR);
		
		ImageIcon img = new ImageIcon("E:\\Falguni Mam\\3rd semester\\Project\\Flappy Bird\\flappy-bird\\Images\\backward.jpg");
	    JLabel l = new JLabel(img);
	    c.add(l);
	    l.setBounds(0,0,600,800);
	    c.add(l);
		
		b1 = new JButton("Settings");
	    b1.setBounds(220,250,150,70);
	    b1.setBackground(Color.blue);
	    b1.setForeground(Color.WHITE);
	    b1.setFont(f);
	    b1.setCursor(cursor1);
	    c.add(b1);
	    
	    b2 = new JButton("About");
	    b2.setBounds(220,360,150,70);
	    b2.setBackground(Color.blue);
	    b2.setForeground(Color.WHITE);
	    b2.setFont(f);
	    b2.setCursor(cursor1);
	    c.add(b2);
	    
	    b3 = new JButton("Help");
	    b3.setBounds(220,470,150,70);
	    b3.setBackground(Color.blue);
	    b3.setForeground(Color.WHITE);
	    b3.setFont(f);
	    b3.setCursor(cursor1);
	    c.add(b3);
	    
	    img = new ImageIcon("Images/Menu Backarrow.png");
	    b4 = new JButton(img);
	    b4.setBounds(500,20,40,40);
	    b4.setBackground(Color.blue);
	    b4.setForeground(Color.WHITE);
	    b4.setFont(f);
	    b4.setCursor(cursor1);
	    c.add(b4);
		
	    b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Settings frame2 = new Settings();
				dispose();
				
				
			}
	    	
	    });
	    
	    b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Settings frame2 = new Settings();
				About frame = new About();   
				dispose();
				
				
			}
	    	
	    });
	    
	    b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Settings frame2 = new Settings();
				//About frame = new About(); 
				Help frame = new Help();        
				dispose();
				
				
			}
	    	
	    });
	    
	    b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Settings frame2 = new Settings();
				HomePage frame = new HomePage();
				dispose();
				
				
			}
	    	
	    });
		setVisible(true);
		setSize(600,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Menu Selected Page");
		
	}
	
	public static void main(String[] args)
	{
	    MenuPage frame = new MenuPage();
	    
	}
	

}
