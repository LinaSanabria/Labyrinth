/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uptc.prg3.model;

import com.uptc.prg3.gui.Constant;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class LaberintImage {
    File file;
    BufferedImage bfImage;
    public LaberintImage(){
        try {
            file=new File("src/resource/image/"+Constant.SPLASH_PATH_NAME);
            bfImage=ImageIO.read(file);
            } catch (IOException ex) {
        }
    }
    public void testRGB(){
        Color color=null;
         int[] colorRGB=new int[3];
        for (int i = 0; i < 70; i++) {
            color=new Color(bfImage.getRGB(bfImage.getWidth()/2,i));
             colorRGB[0]=color.getRed();
             colorRGB[1]=color.getGreen();
             colorRGB[2]=color.getBlue();
             System.out.println(colorRGB[0]+" "+colorRGB[1]+" "+colorRGB[2]);
        }
    }

//    public void changeToGrayScale(){}
//    public void changeToGrayscale(){
//        int[] colorWall=new int[3];
//        int[] colorBg=new int[3];
//        for (int i = 0; i < bfImage.getHeight()-50; i++) {
//            Color col=new Color(bfImage.getRGB(50, i));
//            colorWall[0]=col.getRed();
//            colorWall[1]=col.getGreen();
//            colorWall[2]=col.getBlue();
//        }
//    }
 /**
  * Este metodo busca el ancho de la pared del laberinto recorriendo la imagen por la mitad
    basandose en que si la suma de RGB es menor a 200 es sufientemente oscuro para ser una pared
    y si es mayor se considera como fondo.
  * @return El ancho de la pared en pixeles
  */
    public int getWidthWalls(){
         Color color=null;
         int[] colorRGB=new int[3];
         int width=0;
         int position=0;
         boolean end=false;
         while(!end){
             color=new Color(bfImage.getRGB(bfImage.getWidth()/2,position));
             colorRGB[0]=color.getRed();
             colorRGB[1]=color.getGreen();
             colorRGB[2]=color.getBlue();
             if((colorRGB[0]+colorRGB[1]+colorRGB[2])>200){
                 position++;
             }else{
                 end=true;
             }
         }
         end=false;
         while(!end){
             color=new Color(bfImage.getRGB(bfImage.getWidth()/2,position));
             colorRGB[0]=color.getRed();
             colorRGB[1]=color.getGreen();
             colorRGB[2]=color.getBlue();
              if((colorRGB[0]+colorRGB[1]+colorRGB[2])<=200){
                 position++;
                 width++;
             }else{
                 end=true;
             }
         }
        return width;
    }
    
    public int[][] searchCorners(){
        ArrayList<Position> vertexs =new ArrayList<Position>();
        //to do
        return null;
    }
    /**
     * Busca la siguiente esquina hacia la derecha desde una posicion dada
     * @param position Posicion desde la que parte a buscar
     * @return Retorna un objeto Position con las coordenadas de la siguiente esquina hacia la derecha
     *         o retorna nulo si no hay camino hacia la derecha
     */
    public Position searchNextCornerRight(Position position){
        int coordenateX=(int)position.getX();
        int coordenateY=(int)position.getY();
        boolean end=false;
        Color color=new Color(bfImage.getRGB(coordenateX+2, coordenateY));
        int[] colorRGB=new int[3];
        colorRGB[0]=color.getRed();
        colorRGB[1]=color.getGreen();
        colorRGB[2]=color.getBlue();
        if((colorRGB[0]+colorRGB[1]+colorRGB[2])<=200){
            return null;
        }else{
            while(!end){
                color=new Color(bfImage.getRGB(coordenateX, coordenateY));
                colorRGB[0]=color.getRed();
                colorRGB[1]=color.getGreen();
                colorRGB[2]=color.getBlue();
                if((colorRGB[0]+colorRGB[1]+colorRGB[2])>200){
                    coordenateX++;
                }else{
                    end=true;
                }
            }
        }
        return new Position((double)coordenateX-1,(double)coordenateY);
    }
    /**
     * Busca la primera esquina del grafo (superior izquierda)
     * @return Un objeto Position con las coordenadas de la primera esquina
     */
    public Position findFirstCorner(){
        int coordenateX=0;
        int coordenateY=0;
        boolean end=false;
        Color color=null;
        int widthWall=getWidthWalls();
        int[] colorRGB=new int[3];
        while(!end){
            color=new Color(bfImage.getRGB(bfImage.getWidth()/2,coordenateY));
            colorRGB[0]=color.getRed();
            colorRGB[1]=color.getGreen();
            colorRGB[2]=color.getBlue();
            if((colorRGB[0]+colorRGB[1]+colorRGB[2])>200){
                coordenateY++;
            }else{
                end=true;
            }
        }
        end=false;
        while(!end){
            color=new Color(bfImage.getRGB(coordenateX,coordenateY));
            colorRGB[0]=color.getRed();
            colorRGB[1]=color.getGreen();
            colorRGB[2]=color.getBlue();
            if((colorRGB[0]+colorRGB[1]+colorRGB[2])>200){
                coordenateX++;
            }else{
                end=true;
            }
        }
        return new Position((double)coordenateX+widthWall,(double)coordenateY+widthWall);
    }
}
