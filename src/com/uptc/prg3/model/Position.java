package com.uptc.prg3.model;

import java.awt.Point;

public class Position {
   private double x;
   private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(Position position){
       return Math.sqrt(Math.pow(this.x-position.x, 2)+Math.pow(this.y-position.y, 2));
    }
    
    public Position move(double distance,double angle){
      return new Position(x + distance*Math.cos(angle),
                y + distance*Math.sin(angle));
    } 
   
    public double getAngle(Position position) {
      return Math.atan2((this.y-position.y),(this.x-position.x));
    }
}
