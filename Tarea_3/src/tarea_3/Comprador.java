package tarea_3;
import java.awt.*;
import javax.swing.*;

public class Comprador extends JPanel{

	private Moneda m;
	private Expendedor exp;
	private int numBebida, vuelto;
	private String sabor;

	public Comprador(Moneda m, Expendedor exp, int numBebida) {
		this.m = m;
		this.exp = exp;
		this.numBebida = numBebida;
		vuelto = 0;
		sabor = "";
	}

        public void setMoneda(Moneda moneda){
            this.m = moneda;
        }
        
        public void setNumBebida(int numBebida){
            this.numBebida = numBebida;
        }
        
        @Override
        public void paint(Graphics g){
            super.paint(g);
        
            g.drawRect(100,100, 50, 50);
        }
        
	public void comprar() {
            
            try{
                exp.comprarBebida(m, numBebida);
                this.beber(exp.getBebida());
            }catch(Exception e){
                System.out.print("");
            }
            
            while (true) {
                    m = exp.getVuelto();
                    if (m == null)
                            break;
                    
                    vuelto += m.getValor();
		}
	}

	public void beber(Bebida b) {
		sabor = b.tomarBebida();
	}

	public int getVuelto(){
		return vuelto;
	}

	public String getSabor(){
		return sabor;
	}
}