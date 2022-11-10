package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    
    private PanelPrincipal p;

    public Ventana() {
        this.setLayout(new BorderLayout());
        this.setTitle("Deposito de Bebidas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        p = new PanelPrincipal();
        this.add(p,BorderLayout.CENTER);
        this.setSize(500, 500);
        this.setResizable(false);
    }
}
