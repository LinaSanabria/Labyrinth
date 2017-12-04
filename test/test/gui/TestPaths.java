package test.gui;

import com.uptc.prg3.gui.Path;
import com.uptc.prg3.model.Position;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TestPaths {
    public static void main(String[] args) {
        Position[] positions = {
           new Position(100,100),
           new Position(200,100),
           new Position(200,150),
           new Position(300,150),
           new Position(300,400),
           new Position(10,400),
           new Position(10,100),
           new Position(500,100),
           new Position(500,600),
           new Position(50,600),
           new Position(500,350),
           new Position(850,350),
           new Position(250,600)
        };
        Path path = new Path(positions);
        
        JFrame jFrame = new JFrame("Test clase Path");
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setVisible(true);
        Graphics2D graphics2D = (Graphics2D) jFrame.getGraphics();
        graphics2D.drawString("Caminos ....", 400,400);
        graphics2D.setColor(Color.RED);
        graphics2D.setStroke(new BasicStroke(10));
        path.show(graphics2D, 50.0); // speed = pixel / seg
    }
}
