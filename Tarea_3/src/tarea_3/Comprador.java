package tarea_3;

public class Comprador{

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
                this.beber(exp.getBebida());
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