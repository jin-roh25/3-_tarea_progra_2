package tarea_3;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Expendedor extends JPanel{

    private ArrayList<Bebida>[] depBebida;
    private int precioBebidas;
    private int depositoMonedas;

    public Expendedor(int cantidadPorDep, int precio) {
        depBebida = new ArrayList[3];
        depositoMonedas = 0;
        for (int i = 0; i < 3; i++) {
            depBebida[i] = new ArrayList<Bebida>();
            for(int j=0;j<cantidadPorDep;j++){
                if(i==0){
                    depBebida[i].add(new CanadaDry(j+1));
                }else if(i==1){
                    depBebida[i].add(new Pap(j+1));
                }else if(i==2){
                    depBebida[i].add(new CocaCola(j+1));
                }
            }
        }
        precioBebidas = precio;
    }
    
    @Override
        public void paint(Graphics g){
            super.paint(g);
        
            g.drawRect(200,200, 50, 50);
    }
    
    public int getPrecioBebidas() {
        return precioBebidas;
    }

    public void comprarBebida(Moneda moneda,int numBebida) {
        try{
            moneda.toString();
        }catch(Exception e){
            System.out.println("Error,PagoIncorrectoException");
            this.getBebida(null);
        }
        try{
            if(numBebida<1||numBebida>3){
                int x = 1/0;
            }
        }catch(Exception e){
            depositoMonedas += moneda.getValor();
            System.out.println("Error,DepositoInexistenteException");
            this.getBebida(null);
        }
        try{
            if(moneda.getValor()>this.precioBebidas){
                        depositoMonedas = moneda.getValor() - this.precioBebidas;
                        this.getBebida(depBebida[numBebida-1].remove(0));

            }else if(moneda.getValor()<this.precioBebidas){
                    depositoMonedas += moneda.getValor();
                    System.out.println("Error,PagoInsuficienteException");
                    this.getBebida(null);
            }else{
                    this.getBebida(depBebida[numBebida-1].remove(0));
            }
        }catch(Exception e){
            depositoMonedas = 0;
            depositoMonedas += moneda.getValor();
            System.out.println("Error,NoHayBebidaException");
            this.getBebida(null);
        }
    }
    
    public Bebida getBebida(Bebida bebida){
        return bebida;
    }

    public Moneda getVuelto() {
        if(depositoMonedas >= 100){
            depositoMonedas -= 100;
            return new Moneda100();
        }else{
            return null;
        }
    }
}
