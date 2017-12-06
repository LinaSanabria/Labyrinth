package com.uptc.prg3.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class JMenuBarMain extends JMenuBar {
    public JMenuBarMain(){
        super();
        init();
    }
    
    private void init(){
        JMenu jMenu = new JMenu("Laberinto");
        jMenu.add(new JMenuItem(Command.LOAD.getTitle()));
        jMenu.add(new JMenuItem(Command.SAVE.getTitle()));
        this.add(jMenu);
        jMenu = new JMenu("Procesamiento Imagen");
        jMenu.add(new JMenuItem(Command.CLEAN.getTitle()));
        jMenu.add(new JMenuItem(Command.SEARCH_VERTEX.getTitle()));
        jMenu.add(new JMenuItem(Command.SEARCH_EDGES.getTitle()));
        this.add(jMenu);
        jMenu = new JMenu("Entrada/salida");
        jMenu.add(new JMenuItem(Command.MARK_INPUT.getTitle()));
        jMenu.add(new JMenuItem(Command.MARK_OUTPUT.getTitle()));
        this.add(jMenu);
        jMenu = new JMenu("Solucion");
        jMenu.add(new JMenuItem(Command.SOLUTION_DIJKSTRA.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_BFS.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_BORUVKA.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_DFS.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_HEURISTIC.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_KRUSKAL.getTitle()));
        jMenu.add(new JMenuItem(Command.SOLUTION_PRIM.getTitle()));
        this.add(jMenu);
        jMenu = new JMenu("Opciones");
        this.add(jMenu);
        jMenu = new JMenu("Ayuda");
        jMenu.add(new JMenuItem(Command.HELP.getTitle()));
        jMenu.add(new JMenuItem(Command.ABOUT.getTitle()));
        this.add(jMenu);
    }
}
