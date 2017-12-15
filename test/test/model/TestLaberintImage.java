/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import com.uptc.prg3.model.LaberintImage;
import com.uptc.prg3.model.Position;

/**
 *
 * @author user
 */
public class TestLaberintImage {
    public static void main(String[] args) {
        LaberintImage laberintImage=new LaberintImage();
        //Ancho de Muros
        System.out.println("El ancho de los muros es de: \n"+laberintImage.getWidthWalls()+" pixels");
        //Primera esquina
        System.out.println("Las coordenadas de la primera esquina del laberinto son: \n"+
                laberintImage.findFirstCorner().getX()+"-"+laberintImage.findFirstCorner().getY());
        //Buscar siguiente esquina derecha
        System.out.println("La siguiente esquina hacia la derecha a partir de la coordenada 50 - 50 es:\n "+
                laberintImage.searchNextCornerRight(new Position(50.0,50.0)).getX()+"-"+laberintImage.searchNextCornerRight(new Position(50.0,50.0)).getY());
        
        
    }
}
