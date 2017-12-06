package com.uptc.prg3.gui;

import com.uptc.prg3.model.Position;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JWindow;

public class JWindowSplash extends JWindow {
    private static final int SPLASH_HEIGHT = 300;
    private static final int SPLASH_WIDTH  = 400;
    
    private Image image;
    private boolean  isImageLoaded;
            
    public JWindowSplash(){
        super();
        this.isImageLoaded = false;
        init();
    }

    private void init(){
       this.setVisible(true);
       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(dimension.width/2-SPLASH_WIDTH/2,dimension.height/2-SPLASH_HEIGHT/2);
       this.setSize(SPLASH_WIDTH,SPLASH_HEIGHT);
       // load imagen ...
       File file = new File(JWindowSplash.class.getResource(Constant.SPLASH_PATH_NAME).getPath());
       if (file.exists()){        
          ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(Constant.SPLASH_PATH_NAME).getPath());
          this.image = imageIcon.getImage(); 
          this.isImageLoaded=true;
       }
       else {
           System.out.println("Error load image");
       }
       repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        if (this.isImageLoaded) {
            Graphics2D graphics = (Graphics2D) g;
            super.paint(graphics);
            graphics.drawImage(this.image, 0, 0, 400, 300, this);
            graphics.setColor(Color.BLACK);
            
            graphics.setFont(new Font("Arial bold", Font.BOLD, 14));
            graphics.drawString(Constant.APP_NAME+" "+Constant.APP_VERSION,100,10);
            graphics.setFont(new Font("Arial bold", Font.ITALIC,8));
            graphics.drawString(Constant.APP_COMPANY+" "+Constant.APP_DEPENDENCY+
                    Constant.APP_AUTHOR+" "+Constant.APP_COPY_RIGHT+Constant.APP_DATE,
                    5,290);
            graphics.setColor(Color.RED);
            graphics.setStroke(new BasicStroke(8));
            Position[] positions = {
                new Position(35, 135),
                new Position(57, 135),
                new Position(57, 195),
                new Position(100,195),
                new Position(100, 101),
                new Position(49, 101),
                new Position(49, 75),
                new Position(178, 75),
                new Position(178, 44),
                new Position(219, 44),
                new Position(219, 100),
                new Position(134, 100),
                new Position(134, 135),
                new Position(215, 135),
                new Position(215, 165),
                new Position(180, 165),
                new Position(180, 193),
                new Position(135, 193),
                new Position(135, 224),
                new Position(50, 224),
                new Position(50, 257),
                new Position(260, 257),
                new Position(260, 221),
                new Position(345, 221),
                new Position(345, 160),
                new Position(295, 160),
                new Position(295, 135),
                new Position(260, 135),
                new Position(260, 65),
                new Position(305, 65),
                new Position(305, 43),
                new Position(360, 43)};
            Path path = new Path(positions);
            path.show(graphics, 200.0);
        } else {
            super.paint(g);
            g.setColor(Color.BLACK);
            g.drawString("WAIT", 180, 150);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
}
