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
                this.setResizable(true);

		Panel p = new Panel();
                Ok_I_Pull_Up ok = new Ok_I_Pull_Up();
		this.add(ok, BorderLayout.CENTER);
	}

}
