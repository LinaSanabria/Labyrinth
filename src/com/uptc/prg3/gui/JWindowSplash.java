package com.uptc.prg3.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JWindow;

public class JWindowSplash extends JWindow {
    private static final int SPLASH_HEIGHT = 768;
    private static final int SPLASH_WIDTH = 1024;
    
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
       System.out.println(">>"+JWindowSplash.class.getResource(Constant.SPLASH_PATH_NAME).getPath());
       File file = new File(JWindowSplash.class.getResource(Constant.SPLASH_PATH_NAME).getPath());
       if (file.exists()){        
          ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(Constant.SPLASH_PATH_NAME).getPath());
//               image = ImageIO.read(JWindowSplash.class.getResource(Constant.SPLASH_PATH_NAME));
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
           // System.out.println("" + (graphics.drawImage(this.image, 0, 0,400,300, this) ? "OK" : "NO"));
            graphics.setColor(Color.BLUE);
            graphics.drawString(Constant.APP_NAME, 50, 50);
            graphics.setColor(Color.RED);
            graphics.setStroke(new BasicStroke(10));
            Random random = new Random();
            int x = random.nextInt(SPLASH_WIDTH);
            int y = random.nextInt(SPLASH_HEIGHT);
            int x1, y1;
            for (int i = 0; i < 50; i++) {
                x1 = x;
                y1 = y;
                if (random.nextBoolean()) {
                    x1 = random.nextInt(35) + 10;
                } else {
                    y1 = random.nextInt(35) + 10;
                }
                graphics.drawLine(x, y, x1, y1);
                x = x1;
                y = y1;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        }
        else {
           super.paint(g);
           g.setColor(Color.BLACK);
           g.drawString("WAIT", 180, 150);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
