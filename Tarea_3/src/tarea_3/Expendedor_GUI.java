package tarea_3;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Expendedor_GUI extends javax.swing.JLayeredPane {

    private Expendedor exp;
    private ArrayList<Bebida_GUI>[] depositoBebidas;
    private DepositoMoneda_GUI depMonedas;
    private DepositoBebida_GUI depBebida;

    public Expendedor_GUI() {
        this.exp = new Expendedor(2, 200);
        initComponents();
        depositoBebidas = new ArrayList[4];
        for (int i = 0; i < depositoBebidas.length; i++) {
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

    private void mostrarBebidas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < depositoBebidas[i].size(); j++) {
                Bebida_GUI b = depositoBebidas[i].get(j);
                this.setLayer(b, 1);
                this.add(b);
                b.setLocation(almacen.getX() + (almacen.getWidth() / 4) * i,
                        almacen.getY() + (almacen.getHeight() / 3) * (2 - j));
            }
        }
        this.revalidate();
        this.repaint();
    }

    public void sincronizarDeposito() {
        for (int i = 0; i < 4; i++) {
            int n = Integer.min(exp.getDepBebida(i).size(), 3);

            for (Bebida_GUI j : depositoBebidas[i]) {
                this.remove(j);
            }
            depositoBebidas[i].removeAll(depositoBebidas[i]);

            for (int j = 0; j < n; j++) {
                Bebida_GUI b = new Bebida_GUI();
                b.setBebida(exp.getDepBebida(i).get(j));
                depositoBebidas[i].add(b);
            }
        }
        this.mostrarBebidas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        almacen = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vending_Machine.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(0, 0, 194, 292);

        almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Glass.png"))); // NOI18N
        almacen.setContentAreaFilled(false);
        almacen.setPreferredSize(new java.awt.Dimension(124, 145));
        almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenActionPerformed(evt);
            }
        });
        setLayer(almacen, javax.swing.JLayeredPane.PALETTE_LAYER);
        add(almacen);
        almacen.setBounds(6, 9, 124, 145);
    }// </editor-fold>//GEN-END:initComponents

    private void almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenActionPerformed
        if (this.exp.getDepBebida(0).isEmpty()) {
            this.exp.rellenarDepBebidas(0);
        }
        if (this.exp.getDepBebida(1).isEmpty()) {
            this.exp.rellenarDepBebidas(1);
        }
        if (this.exp.getDepBebida(2).isEmpty()) {
            this.exp.rellenarDepBebidas(2);
        }
        if (this.exp.getDepBebida(3).isEmpty()) {
            this.exp.rellenarDepBebidas(3);
        }
        this.sincronizarDeposito();
    }//GEN-LAST:event_almacenActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        if (evt.getSource() == depBebida || evt.getSource() == depMonedas) {
            JPanel deposito = (JPanel) evt.getSource();
            evt.translatePoint(deposito.getX(), deposito.getY());
        }
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almacen;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
