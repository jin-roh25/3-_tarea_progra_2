package tarea_3;

import java.awt.*;

public class Expendedor_GUI extends javax.swing.JPanel {

    private Expendedor exp;
    private DepositoMoneda_GUI depMonedas;
    private DepositoBebida_GUI depBebida;

    public Expendedor_GUI() {
        this.exp = new Expendedor(4, 200);
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vending_Machine.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
