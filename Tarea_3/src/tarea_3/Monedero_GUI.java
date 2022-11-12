package tarea_3;

import java.awt.*;

public class Monedero_GUI extends javax.swing.JPanel {

    private int saldo;
    private int monedaPorSacar;

    public Monedero_GUI() {
        saldo = 3600;
        monedaPorSacar = 0;
        initComponents();
        this.setSize(mond.getWidth(), mond.getHeight());
    }

    public boolean isInMonedero(Point p) {
        return (p.x > this.getX()
                && p.x < this.getX() + this.getWidth()
                && p.y > this.getY() + 28
                && p.y < this.getY() + this.getHeight());
    }

    public void meterMoneda(Moneda_GUI m) {
        saldo += m.getMoneda().getValor();
        mond.setText("$" + saldo);
    }

    public Moneda_GUI sacarMoneda() {
        if (monedaPorSacar <= saldo) {
            Moneda_GUI m = new Moneda_GUI();
            switch (monedaPorSacar) {
                case 100 -> {
                    saldo -= 100;
                }

                case 500 -> {
                    saldo -= 500;
                    m.setMoneda(new Moneda500());
                }

                case 1000 -> {
                    saldo -= 1000;
                    m.setMoneda(new Moneda1000());
                }

                case 1500 -> {
                    saldo -= 1500;
                    m.setMoneda(new Moneda1500());
                }
            }
            mond.setText("$" + saldo);
            return m;
        }
        return null;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mond = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(80, 100));
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

        mond.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        mond.setForeground(new java.awt.Color(0, 204, 0));
        mond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Monedero.png"))); // NOI18N
        mond.setText("$" + String.valueOf(saldo));
        mond.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mond.setMaximumSize(new java.awt.Dimension(80, 100));
        mond.setMinimumSize(new java.awt.Dimension(80, 100));
        mond.setPreferredSize(new java.awt.Dimension(80, 100));
        mond.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        if (evt.getY() > 28 + (mond.getHeight() - 28) / 2) {
            if (evt.getX() < mond.getWidth() / 2) {
                monedaPorSacar = 500;
            } else {
                monedaPorSacar = 1500;
            }
            this.getParent().dispatchEvent(evt);
        } else if (evt.getY() > 28) {
            if (evt.getX() < mond.getWidth() / 2) {
                monedaPorSacar = 100;
            } else {
                monedaPorSacar = 1000;
            }
            this.getParent().dispatchEvent(evt);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mond;
    // End of variables declaration//GEN-END:variables
}
