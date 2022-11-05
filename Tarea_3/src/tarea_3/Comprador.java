package tarea_3;

public class Comprador {

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

	public void comprar() {
            
            try{
                this.beber(exp.comprarBebida(m, numBebida));
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