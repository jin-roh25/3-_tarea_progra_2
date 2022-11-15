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
        this.setPreferredSize(jLabel1.getSize());
        this.setSize(jLabel1.getSize());
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

    public void createDepBebida() {
        if (depBebida == null) {
            depBebida = new DepositoBebida_GUI();
            this.setLayer(depBebida, 1);
            this.add(depBebida);
            depBebida.setBounds(13, 223, 159, 39);

        }
    }

    public void createDepMoneda() {
        if (depMonedas == null) {
            depMonedas = new DepositoMoneda_GUI();
            this.setLayer(depMonedas, 2);
            this.add(depMonedas);
            depMonedas.setBounds(140, 170, 45, 45);
        }
    }

    public void entregarBebida() {

        this.createDepBebida();
        depBebida.setBebida(exp.getBebida());
    }

    public void entregarVuelto() {

        this.createDepMoneda();
        System.out.println(exp.getCantMonedas());
        depMonedas.setCantMonedas(exp.getCantMonedas());
    }
    
    private Bebida selecBebida(int i){
        switch (i)
    }

    private void mostrarBebidas() {
        for (int i = 0; i < 4; i++) {
            while (depositoBebidas[i].size() < exp.getCantDeptBebidas(i)
                    && depositoBebidas[i].size() < 3) {
                Bebida_GUI b = new Bebida_GUI();
                b.setBebida(exp.);
                depositoBebidas[i].add();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bebida_GUI1 = new tarea_3.Bebida_GUI();
        bebida_GUI2 = new tarea_3.Bebida_GUI();
        bebida_GUI3 = new tarea_3.Bebida_GUI();
        bebida_GUI4 = new tarea_3.Bebida_GUI();
        bebida_GUI5 = new tarea_3.Bebida_GUI();
        bebida_GUI6 = new tarea_3.Bebida_GUI();
        bebida_GUI7 = new tarea_3.Bebida_GUI();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vending_Machine.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(0, 0, 194, 292);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Glass.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(124, 145));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setLayer(jButton1, javax.swing.JLayeredPane.PALETTE_LAYER);
        add(jButton1);
        jButton1.setBounds(6, 9, 124, 145);
        setLayer(bebida_GUI1, 1);
        add(bebida_GUI1);
        bebida_GUI1.setBounds(10, 150, 20, 34);
        setLayer(bebida_GUI2, 1);
        add(bebida_GUI2);
        bebida_GUI2.setBounds(40, 150, 20, 34);
        setLayer(bebida_GUI3, 1);
        add(bebida_GUI3);
        bebida_GUI3.setBounds(70, 150, 20, 34);
        setLayer(bebida_GUI4, 1);
        add(bebida_GUI4);
        bebida_GUI4.setBounds(100, 150, 20, 34);
        setLayer(bebida_GUI5, 1);
        add(bebida_GUI5);
        bebida_GUI5.setBounds(140, 110, 20, 34);
        setLayer(bebida_GUI6, 1);
        add(bebida_GUI6);
        bebida_GUI6.setBounds(140, 70, 20, 34);
        setLayer(bebida_GUI7, 1);
        add(bebida_GUI7);
        bebida_GUI7.setBounds(140, 30, 20, 34);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.exp.getCantDeptBebidas(1) == 0) {
            this.exp.rellenarDepBebidas(1);
        }
        if (this.exp.getCantDeptBebidas(2) == 0) {
            this.exp.rellenarDepBebidas(2);
        }
        if (this.exp.getCantDeptBebidas(3) == 0) {
            this.exp.rellenarDepBebidas(3);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        if (evt.getSource().getClass() == DepositoBebida_GUI.class) {
            Moneda_GUI m = monedero.sacarMoneda();
            ultimaMoneda = m;
            if (m != null) {
                this.setLayer(m, 2);
                this.add(m);
                m.setBounds(monedero.getX() + evt.getX() - m.getWidth() / 2,
                        monedero.getY() + evt.getY() - m.getHeight() / 2,
                        m.getWidth(), m.getHeight());

                m.dispatchEvent(evt);

                this.revalidate();
                this.repaint();
            }
        }
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tarea_3.Bebida_GUI bebida_GUI1;
    private tarea_3.Bebida_GUI bebida_GUI2;
    private tarea_3.Bebida_GUI bebida_GUI3;
    private tarea_3.Bebida_GUI bebida_GUI4;
    private tarea_3.Bebida_GUI bebida_GUI5;
    private tarea_3.Bebida_GUI bebida_GUI6;
    private tarea_3.Bebida_GUI bebida_GUI7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
