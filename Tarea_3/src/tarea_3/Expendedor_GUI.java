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
        this.exp = new Expendedor(3, 400);
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

    public Bebida getBebida() {
        return exp.removerBebida();
    }

    public Moneda getVuelto() {
        return exp.getVuelto();
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
        System.out.println("Monedas:" + exp.getCantMonedas());
        depMonedas.setCantMonedas(exp.getCantMonedas());
    }

    private void mostrarBebidas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < depositoBebidas[i].size(); j++) {
                Bebida_GUI b = depositoBebidas[i].get(j);
                this.setLayer(b, 1);
                this.add(b);
                b.setLocation(almacen.getX() + (almacen.getWidth() / 4) * i + 6,
                        almacen.getY() + (almacen.getHeight() / 3) * (2 - j) + 8);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vending_Machine.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 194, 292);

        almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Glass.png"))); // NOI18N
        almacen.setContentAreaFilled(false);
        almacen.setPreferredSize(new java.awt.Dimension(124, 145));
        almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                almacenMousePressed(evt);
            }
        });
        almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenActionPerformed(evt);
            }
        });
        setLayer(almacen, javax.swing.JLayeredPane.PALETTE_LAYER);
        add(almacen);
        almacen.setBounds(6, 9, 124, 145);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("$" + String.valueOf(exp.getPrecioBebidas()));
        setLayer(jLabel2, 1);
        add(jLabel2);
        jLabel2.setBounds(20, 190, 109, 25);

        jLabel3.setText("PRECIO:");
        setLayer(jLabel3, 1);
        add(jLabel3);
        jLabel3.setBounds(20, 170, 60, 16);
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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getSource() == depBebida) {
            DepositoBebida_GUI dep = (DepositoBebida_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }

        if (evt.getSource() == depMonedas) {
            DepositoMoneda_GUI dep = (DepositoMoneda_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (evt.getSource() == depBebida) {
            DepositoBebida_GUI dep = (DepositoBebida_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }

        if (evt.getSource() == depMonedas) {
            DepositoMoneda_GUI dep = (DepositoMoneda_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.getSource() == depBebida) {
            DepositoBebida_GUI dep = (DepositoBebida_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }

        if (evt.getSource() == depMonedas) {
            DepositoMoneda_GUI dep = (DepositoMoneda_GUI) evt.getSource();
            evt.translatePoint(dep.getX(), dep.getY());
        }
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseReleased

    private void almacenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almacenMousePressed
        System.out.println(evt.getX()+ "  " + evt.getY());
    }//GEN-LAST:event_almacenMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
