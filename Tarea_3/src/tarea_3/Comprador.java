package tarea_3;

public class Comprador{

	private Moneda m;
	private final Expendedor exp;
	private int numBebida;
	private String sabor;

	public Comprador(Moneda m, Expendedor exp, int numBebida) {
		this.m = m;
		this.exp = exp;
		this.numBebida = numBebida;
		sabor = "";
	}

        public void setMoneda(Moneda moneda){
            this.m = moneda;
        }
        
        public Moneda getMoneda(){
            return m;
        }
        
        public void setNumBebida(int numBebida){
            this.numBebida = numBebida;
        }
        
	public void comprar() {
            
            try{
                exp.comprarBebida(m, numBebida);
                m = null;
            }catch(Exception e){
                System.out.print("");
            }
	}

	public void beber(Bebida b) {
            sabor = b.tomarBebida();
	}

	public String getSabor(){
            return sabor;
	}
}