package com.uptc.prg3.gui;
import com.uptc.prg3.model.Position;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Muestra en una animacion los trazos camino 
 * @author ACWIN7C140
 */
public class Path {
   private static final int STEP = 1;
           
   private Position[] positions;
   
    public Path(Position[] positions) {
        this.positions = positions;
    }
   
    public void show(Graphics2D graphics2D, double speed){
        graphics2D.setColor(Color.BLACK);
        for (int i = 0; i < positions.length; i++) {
            graphics2D.drawString(""+i,(int)positions[i].getX(), (int)positions[i].getY());
        }
        graphics2D.setColor(Color.RED);
        for (int i = 0; i < positions.length-1; i++) { // dibujar arista 
            Position position1 = positions[i];
            double distance =  position1.distance(positions[i+1]);
            double angle = Math.PI + position1.getAngle(positions[i+1]);
            for (double j = 0; j < distance; j += STEP) { // segmento
                Position position2 = position1.move(STEP, angle);
                graphics2D.drawLine((int) position1.getX(), (int) position1.getY(),
                        (int) position2.getX(), (int) position2.getY());
                position1 = position2;
                try {
                    Thread.sleep((long) ((STEP / speed) * 1000));
                } catch (InterruptedException ex) {
                }
            }
        }
    }    
   
   
   
}
