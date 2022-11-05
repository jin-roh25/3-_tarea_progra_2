package tarea_3;

public abstract class Bebida {
    
    private int numSerie;
    
    public Bebida(int NumSerie){
        numSerie = NumSerie;
    }

	 public int getNumSerie(){
		return numSerie;
	 }

    public abstract String tomarBebida();
    
}
