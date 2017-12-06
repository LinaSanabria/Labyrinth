package com.uptc.prg3.gui;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JPanelStatusBar extends JPanel{

    private JLabel jLabelMessage;
    
    public JPanelStatusBar(){
        super();
        this.jLabelMessage = new JLabel("");
        init();
    }
    
    private void init(){
      this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      this.add(jLabelMessage);
    }
    
    public void setMessage(String message){
       this.jLabelMessage.setText(message);
    }
            
    
}
