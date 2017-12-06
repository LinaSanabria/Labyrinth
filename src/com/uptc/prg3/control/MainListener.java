package com.uptc.prg3.control;

import com.uptc.prg3.gui.Command;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainListener implements ActionListener{
    
    private static MainListener mainListener=null;
    
    private MainListener(){
    
    } 
    
    public static MainListener getStance(){
       if(mainListener==null) {
          mainListener = new MainListener();
       }
       return mainListener;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Command.valueOf(e.getActionCommand())) {
            case LOAD :
                System.out.println("Comando "+e.getActionCommand()+"en construccion");               
                break;
            case SAVE :
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case ABOUT:
                break;
            case CLEAN :
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case HELP :
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case MARK_INPUT :
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case MARK_OUTPUT :
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SEARCH_EDGES:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_BFS:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SEARCH_VERTEX:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_BORUVKA:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_DFS:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_DIJKSTRA:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_HEURISTIC:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_KRUSKAL:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case SOLUTION_PRIM:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            case EXIT:
                System.out.println("Comando "+e.getActionCommand()+"e n construccion");               
                break;
            default:
                System.out.println("Error..");
        }
    }
    
}
