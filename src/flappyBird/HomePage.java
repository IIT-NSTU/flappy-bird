
package birdimage;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;


public class HomePage extends JFrame {
    private Container c;
    private JButton play, settings, about, exit;
    private Font f;
    
    HomePage()
    {
       body();
    }
    
    public void body()
    {
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.PINK);
    
    f = new Font("Arial", Font.BOLD, 22);
    
    play = new JButton("Play");
    play.setBounds(240, 170, 100, 50);
    play.setFont(f);
    play.setBackground(Color.blue);
    play.setForeground(Color.WHITE);
    c.add(play);
    
    
    settings = new JButton("Settings");
    settings.setBounds(70, 650, 130, 50);
    settings.setFont(f);
    settings.setBackground(Color.GRAY);
    settings.setForeground(Color.WHITE);
    c.add(settings);
    
    about = new JButton("About");
    about.setBounds(250, 650, 100, 50);
    about.setFont(f);
    about.setBackground(Color.GRAY);
    about.setForeground(Color.WHITE);
    c.add(about);
    
    
    exit = new JButton("Exit");
    exit.setBounds(400, 650, 100, 50);
    exit.setFont(f);
    exit.setBackground(Color.GRAY);
    exit.setForeground(Color.WHITE);
    c.add(exit);
    
   
   
    
    play.addActionListener(new ActionListener(){
          
         public void actionPerformed(ActionEvent arg0)
          {
          // GameFrame gp = new GameFrame();
           //gp.setVisible(true);
           //GamePanel gp = new GamePanel();
          // gp.setVisible(true);
           
           MainBird mb = new MainBird();
           mb.rendering();
           
           //mb.setVisible(true);
          }
          });
    
     exit.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent arg0)
         {
         //HomePage hp = new HomePage();
        // hp.setVisible(false);
        // hp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         System.exit(0);
         
         }
     
     });
     
    about.addActionListener(new ActionListener(){
          
         public void actionPerformed(ActionEvent arg0)
          {
           Options o = new Options();
           o.setVisible(true);
           o.body();
          }
         
          });
    
    
    
    settings.addActionListener(new ActionListener(){
          
         public void actionPerformed(ActionEvent arg0)
          {
           Settings s = new Settings();
           s.setLayout(null);
           s.setVisible(true);
          }
         
          });
    
    }
            
             
        
    
    
     public static void main(String[] args) {
          HomePage f = new HomePage();
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          f.setSize(600,800);
          f.setLocationRelativeTo(null);
          f.setTitle("Home");
          
          
          
    }
}
