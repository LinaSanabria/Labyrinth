/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uptc.prg3.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class JFrameMain extends JFrame {
    private JMenuBarMain jMenuBarMain;
    private JToolBarMain jToolBarMain;
    private JPanelStatusBar jPanelStatusBar;
    private JPanelWorkArea jPanelWorkArea;
            
    public JFrameMain(){
        super(Constant.APP_NAME+" "+Constant.APP_VERSION );
        this.jMenuBarMain = new JMenuBarMain();
        this.jPanelStatusBar = new JPanelStatusBar();
        this.jToolBarMain = new JToolBarMain();
        this.jPanelWorkArea = new JPanelWorkArea();
       init();
    }
    private void init(){
      this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
      this.setLayout(new BorderLayout());
      this.add(jPanelStatusBar,BorderLayout.SOUTH);
      this.add(jPanelWorkArea,BorderLayout.CENTER);
      this.add(jToolBarMain,BorderLayout.NORTH);
      this.setJMenuBar(jMenuBarMain);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
