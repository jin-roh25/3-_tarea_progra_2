package tarea_3;

import java.awt.*;
import static java.awt.event.InputEvent.*;

public class Monedero_GUI extends javax.swing.JPanel {

    private int saldo;
    private int monedaPorSacar;

    public Monedero_GUI() {
        saldo = 2300;
        monedaPorSacar = 0;
        initComponents();
    }

    public boolean isInMonedero(Point p) {
        return (p.x > this.getX()
                && p.x < this.getX() + this.getWidth()
                && p.y > this.getY()
                && p.y < this.getY() + this.getHeight());
    }

    public void meterMoneda(Moneda_GUI m) {
        saldo += m.getMoneda().getValor();
    }

    public Moneda_GUI sacarMoneda() {
        Moneda_GUI m = new Moneda_GUI();
        if (monedaPorSacar <= saldo) {
            switch (monedaPorSacar) {
                case 100 -> {
                    saldo -= 100;
                    return m;
                }

                case 500 -> {
                    saldo -= 500;
                    m.setMoneda(new Moneda500());
                    return m;
                }

                case 1000 -> {
                    saldo -= 1000;
                    m.setMoneda(new Moneda1000());
                    return m;
                }

                case 1500 -> {
                    saldo -= 1500;
                    m.setMoneda(new Moneda1500());
                    return m;
                }
            }
        }
        return null;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Monedero.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("$" + String.valueOf(saldo));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        System.out.println(Integer.toBinaryString(evt.getModifiersEx()) + "  " + Integer.toBinaryString(BUTTON1_MASK));

        this.getParent().dispatchEvent(evt);

        if (evt.getX() < this.getWidth()) {
            if (evt.getY() < this.getHeight()) {
                monedaPorSacar = 100;
            } else {
                monedaPorSacar = 500;
            }
        } else {
            if (evt.getY() < this.getHeight()) {
                monedaPorSacar = 1000;
            } else {
                monedaPorSacar = 1500;
            }
        }
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
