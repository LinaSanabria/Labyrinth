package test.model;

import com.uptc.prg3.model.Position;

public class TestPosition {
    public static void main(String[] args) {
        Position position = new Position(100, 100);
        System.out.println("distancia "+position.distance(new Position(200,100)));
        System.out.println("move  "+position.move(100,Math.toRadians(0)).getX()+", "+
                position.move(100,Math.toRadians(0)).getY());    
        System.out.println("angulo   "+Math.toDegrees(position.getAngle(new Position(100,200))));    
    }
}
