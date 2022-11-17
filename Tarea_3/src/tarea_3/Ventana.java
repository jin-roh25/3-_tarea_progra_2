package tarea_3;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    private PanelPrincipal p;

    public Ventana() {
        this.setLayout(new BorderLayout());
        this.setTitle("Deposito de Bebidas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(515, 538); //contrarresta el achicamiento
        this.setResizable(false);

        p = new PanelPrincipal();
        p.setSize(500, 500);
        this.add(p, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
