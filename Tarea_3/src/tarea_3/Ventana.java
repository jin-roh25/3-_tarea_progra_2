package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        this.setSize(500, 500);
        this.setLayout(new BorderLayout());
        this.setTitle("Deposito de Bebidas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(new JButton("sur"),BorderLayout.SOUTH);
        this.add(new JButton("centro"),BorderLayout.CENTER);
        this.add(new JButton("norte"),BorderLayout.NORTH);
        this.add(new JButton("este"),BorderLayout.EAST);
        this.add(new JButton("oeste"),BorderLayout.WEST);
        
        PanelPrincipal p = new PanelPrincipal();
        this.add(p,BorderLayout.LINE_START);
    }

}
