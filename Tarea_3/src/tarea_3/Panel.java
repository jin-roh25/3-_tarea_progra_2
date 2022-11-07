package tarea_3;

import java.awt.*;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public Panel(){
        this.setBackground(Color.ORANGE);
    }
    
    public void paint(Graphics g){
        //g = super.getGraphics();
        super.paint(g);
        
        g.drawOval(100,100, 50, 50);
    }
}
