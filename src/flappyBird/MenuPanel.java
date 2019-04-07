package flappyBird;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public static final boolean StartingPoint = false;
    //public JButton b;
	//public boolean StartingPoint = false;
	//private ImageIcon img;
	//private JLabel imgLabel;
	//private JButton playButton;
	
   BufferedImage img=null;
	
	public MenuPanel() {
		LoadImage();
		//rendering();
		//handle a mouse click event
		/*this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				StartingPoint=true;
				
			}

	  });*/
				
	}

	public void LoadImage() {
		try {
			//img = new ImageIcon(getClass().getResource("Menupanel.jpg"));
			//this.setIconImage(img.getImage());
			
            img = ImageIO.read(new File("G:\\Project\\Flappy Bird\\flappy-bird2\\Images\\pic.png"));
			//imgLabel = new JLabel(img);
			//imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
          }
		catch(Exception ex) {
			ex.printStackTrace();
		}
		//rendering();
		
		
		
	}

	

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, 0, 0, GamePanel.WIDTH, GamePanel.HEIGHT, null);
	}

}
