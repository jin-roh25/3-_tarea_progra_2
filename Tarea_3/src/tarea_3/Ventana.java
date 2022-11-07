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

        Panel p = new Panel();
        this.add(p,BorderLayout.CENTER);
    }

}
