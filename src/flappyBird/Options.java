
package birdimage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Options extends JFrame {
    
    private Container c;
    private JLabel pl, ex, set, about;
    private Font f;
    Options()
    {
        body();
    }
    
   public void body()
    {
    c= this.getContentPane();
    c.setBackground(Color.GRAY);
    c.setLayout(null);
    
    f = new Font("Arial", Font.BOLD, 18);
    
    pl = new JLabel();
    pl.setText("This Game developing By Akash, Moonmoon, Sami. They are students of IIT, NSTU.Its a Desktop application.");
    pl.setFont(f);
    pl.setBounds(20, 50, 400, 600);
    c.add(pl);
    
   /* ex = new JLabel();
    ex.setText("Exit");
    ex.setFont(f);
    ex.setBounds(400,400 ,200,300);
    c.add(ex);
    
    set = new JLabel();
    set.setText("Settings");
    set.setFont(f);
    set.setBounds(100,400,200,300);
    c.add(set);
    
    about = new JLabel();
    about.setText("About");
    about.setFont(f);
    about.setBounds(250,400,200,300);
    c.add(about);*/
    }
    
    
    
    public static void main(String[] args) {
          Options f = new Options();
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setSize(600,800);
          f.setLocationRelativeTo(null);
          f.setTitle("Home");
    }
}
