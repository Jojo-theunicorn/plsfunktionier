/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das.spiel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Sergio
 */
public class Spielfenster extends JFrame{
    
    int x1 , y1;
    int hx, hy;
    int f;
    int hyf;
    
     private Image dbImage;
     private Graphics dbg;
        Image Fuchs;
        Image Hase;
        Font font = new Font("Arial", Font.BOLD, 20);
        public class Al extends KeyAdapter {
    


public void keyPressed(KeyEvent t) {
        int KeyCode = t.getKeyCode();
       
        //Rand
        
        if(KeyCode == t.VK_LEFT){
            //Rand
           if( x1<=0 ) 
             x1 -= 0;
           
        else  
            x1-=8;

} 
        
        if(KeyCode == t.VK_RIGHT){
            //Rand
       if( x1+500>=800)
            x1 +=0 ;
            else 
          x1 +=8 ;
      // x2 +=8 ;
       //x3 +=8 ;
     
}

}



        }
        //Spieproperties
            public Spielfenster() {


 ImageIcon i = new ImageIcon ("D://Users/Sergio/Desktop/Netbeans/Fuchsgame/src/bilder/swiper.png");
          Fuchs = i.getImage();
          ImageIcon ih = new ImageIcon ("D://Users/Sergio/Desktop/Netbeans/Fuchsgame/src/bilder/Hasenbild.png");
          Hase = ih.getImage();
              
          
          //Fenster
                
        addKeyListener(new Al());
        setLayout(null);
        setVisible(true);
        setTitle("Das BESTE Fuchsgame");
        setSize(1000, 800);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(Color.GREEN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
        x1 = 150;
        y1 = 650;
       hx = 200;
       hy = 50;
       
      // for (int hy = 0; hy<700; hy++);
}
            public void paint(Graphics g) {
         dbImage = createImage(getWidth(), getHeight());
         dbg = dbImage.getGraphics();
         paintComponent (dbg);
         g.drawImage(dbImage, 0, 0, this);
        
     }   

    
    public void paintComponent (Graphics g){
     
       

//Hasen
    //  for(f=0; f<700; f+=5) {
	
 
      g.drawImage(Hase, hx, hy , this);
     

 //Fuchsskin
      g.drawImage(Fuchs, x1, y1, this);
      g.drawImage(Fuchs, x1+300, y1, this); 
      g.drawImage(Fuchs, x1+600, y1, this);
//Anzeige
   g.setFont(font);
   g.drawString("Gefressene Hasen:", 50, 780);
   g.drawString("Übrige Leben:", 600, 780);
      
repaint();
    

}



}
  


