package com.uptc.prg3.gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class JToolBarMain extends JToolBar{
    public JToolBarMain(){
        super();
        init();
    }
    private void init(){
      this.add(new JButton(Command.LOAD.getCommand()));
      this.add(new JButton(Command.SAVE.getCommand()));
      this.addSeparator();
      this.add(new JButton(Command.CLEAN.getCommand()));
      this.add(new JButton(Command.SEARCH_VERTEX.getCommand()));
      this.add(new JButton(Command.SEARCH_EDGES.getCommand()));
      this.addSeparator();
      this.add(new JButton(Command.SOLUTION_BFS.getCommand()));
      this.add(new JButton(Command.SOLUTION_BORUVKA.getCommand()));
      this.add(new JButton(Command.SOLUTION_DFS.getCommand()));
      this.add(new JButton(Command.SOLUTION_DIJKSTRA.getCommand()));
      this.add(new JButton(Command.SOLUTION_HEURISTIC.getCommand()));
      this.add(new JButton(Command.SOLUTION_KRUSKAL.getCommand()));
      this.add(new JButton(Command.SOLUTION_PRIM.getCommand()));
      this.addSeparator();
      this.add(new JButton(Command.HELP.getCommand()));
    }
}
