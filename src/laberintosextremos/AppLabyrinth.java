package laberintosextremos;

import com.uptc.prg3.gui.JFrameMain;
import com.uptc.prg3.gui.JWindowSplash;

public class AppLabyrinth {
    private JWindowSplash jWindowSplash;
    private JFrameMain jFrameMain;
    public AppLabyrinth(){
        jWindowSplash=new JWindowSplash();
        jFrameMain=new JFrameMain();
        init();
    }
    private void init(){
        jWindowSplash.dispose();
        jFrameMain.setVisible(true);
    }
}
