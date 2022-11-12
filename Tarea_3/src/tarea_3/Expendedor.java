package tarea_3;

import java.util.ArrayList;

public class Expendedor {

    private final ArrayList<Bebida>[] depBebida;
    private final ArrayList<Moneda> depositoMonedas;;
    private Bebida bebida;
    private int precioBebidas;
    private int cantidadPorDept;

    public Expendedor(int cantidadPorDep, int precio) {
        bebida = null;
        cantidadPorDept = cantidadPorDep;
        depBebida = new ArrayList[3];
        depositoMonedas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            depBebida[i] = new ArrayList();
        }
        precioBebidas = precio;
    }

    public void setPrecioBebida(int precio) {
        precioBebidas = precio;
    }

    public int getPrecioBebidas() {
        return precioBebidas;
    }
    public int getCantDeptBebidas(int deposito){
        return depBebida[deposito-1].size();
    }
    public int getCantMonedas(){
        return depositoMonedas.size();
    }

    public void comprarBebida(Moneda moneda, int numBebida) {
        try {
            moneda.toString();
        } catch (Exception e) {
            System.out.println("Error,PagoIncorrectoException");
            this.bebida = null;
        }
        try {
            if (numBebida < 1 || numBebida > 3) {
                int x = 1 / 0;
            }
        } catch (Exception e) {
            depositoMonedas.add(moneda);
            System.out.println("Error,DepositoInexistenteException");
            this.bebida = null;
        }
        try {
            if (moneda.getValor() > this.precioBebidas) {
                for (int i = moneda.getValor() - this.precioBebidas; i > 0; i -= 100) {
                    depositoMonedas.add(new Moneda100());
                }
                this.bebida = depBebida[numBebida - 1].remove(0);

            } else if (moneda.getValor() < this.precioBebidas) {
                depositoMonedas.add(moneda);
                System.out.println("Error,PagoInsuficienteException");
                this.bebida = null;
            } else {
                this.bebida = depBebida[numBebida - 1].remove(0);
            }
        } catch (Exception e) {
            depositoMonedas.removeAll(depositoMonedas);
            depositoMonedas.add(moneda);
            System.out.println("Error,NoHayBebidaException");
            this.bebida = null;
        }
    }

    public Bebida getBebida() {
        return this.bebida;
    }
    
    public void rellenarDepBebidas(int dep){
        
        if(dep == 1){
            for (int j = 0; j < cantidadPorDept; j++) {
                depBebida[0].add(new CanadaDry(j + 1));
            }
        }
        if(dep == 2){
            for (int j = 0; j < cantidadPorDept; j++) {
                depBebida[1].add(new CocaCola(j + 1));
            }
        }
        if(dep == 3){
            for (int j = 0; j < cantidadPorDept; j++) {
                depBebida[2].add(new Pap(j + 1));
            }
        }
    }

    public Moneda getVuelto() {
        if(depositoMonedas.isEmpty()){
            return null;
        }else{
            return depositoMonedas.remove(0);
        }
    }
}
