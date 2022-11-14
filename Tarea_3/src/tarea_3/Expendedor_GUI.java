package tarea_3;

import java.awt.*;
import java.util.ArrayList;

public class Expendedor_GUI extends javax.swing.JLayeredPane {

    private Expendedor exp;
    private ArrayList<Bebida_GUI>[] depositoBebidas;
    private DepositoMoneda_GUI depMonedas;
    private DepositoBebida_GUI depBebida;

    public Expendedor_GUI() {
        this.exp = new Expendedor(4, 200);
        initComponents();
        depositoBebidas = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            depositoBebidas[i] = new ArrayList();
        }
        depMonedas = null;
        depBebida = null;
        jButton1.setOpaque(false);
    }

    public void setExpendedor(Expendedor exp) {
        this.exp = exp;
    }

    public Expendedor getExpendedor() {
        return exp;
    }

    public boolean isInCoinSlot(Point p) {
        return (p.x > this.getX() + 113
                && p.x < this.getX() + 125
                && p.y > this.getY() + 164
                && p.y < this.getY() + 183);

    }
    
    public void createDepBebida(){
        if(depBebida==null){
            depBebida = new DepositoBebida_GUI();
            this.setLayer(depBebida, 1);
            this.add(depBebida);
            depBebida.setBounds(13, 223, 159, 39);
            
        }
    }
    
    public void createDepMoneda(){
        if(depMonedas==null){
            depMonedas = new DepositoMoneda_GUI();
            this.setLayer(depMonedas, 2);
            this.add(depMonedas);
            depMonedas.setBounds(140, 170, 45, 45);
        }
    }
    public void entregarBebida(){
    
        this.createDepBebida();
        depBebida.setBebida(exp.getBebida());
    }
    
    public void entregarVuelto(){
    
        this.createDepMoneda();
        System.out.println(exp.getCantMonedas());
        depMonedas.setCantMonedas(exp.getCantMonedas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vending_Machine.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 194, 292);

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setLayer(jButton1, javax.swing.JLayeredPane.PALETTE_LAYER);
        add(jButton1);
        jButton1.setBounds(10, 10, 120, 140);

        jButton2.setText("jButton2");
        add(jButton2);
        jButton2.setBounds(140, 170, 45, 45);

        jButton3.setText("jButton3");
        add(jButton3);
        jButton3.setBounds(20, 230, 150, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(this.exp.getCantDeptBebidas(1)==0){
            this.exp.rellenarDepBebidas(1);
        }
        if(this.exp.getCantDeptBebidas(2)==0){
            this.exp.rellenarDepBebidas(2);
        }
        if(this.exp.getCantDeptBebidas(3)==0){
            this.exp.rellenarDepBebidas(3);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
