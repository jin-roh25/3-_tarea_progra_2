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

class Pap extends Bebida{
    
    public Pap(int serie){
        super(serie);
    }
    @Override
    public String tomarBebida(){
        
        return "Pap";        
    }
}

class CanadaDry extends Bebida {
    
    public CanadaDry(int serie){
        super(serie);
    }
    @Override
    public String tomarBebida(){
        
        return "CanadaDry";        
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String tomarBebida() {

        return "CocaCola";
    }
}
