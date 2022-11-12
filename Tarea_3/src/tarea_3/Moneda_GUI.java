package tarea_3;

import java.awt.*;

public class Moneda_GUI extends javax.swing.JPanel {

    private Moneda m;
    private int grbX, grbY;

    public Moneda_GUI() {
        m = new Moneda100();
        initComponents();
        this.setSize(jLabel1.getSize());
    }

    public void setGrb(int x, int y) {
        grbX = x;
        grbY = y;
    }

    public void setMoneda(Moneda m) {
        this.m = m;
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Moneda" + m.getValor() + ".png")));
    }

    public Moneda getMoneda() {
        return m;
    }

    public Point getCenter() {
        return new java.awt.Point(this.getX() + this.getWidth() / 2, this.getY() + this.getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(30, 30));
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
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Moneda100.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getX() + evt.getX() - grbX, this.getY() + evt.getY() - grbY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        grbX = evt.getX();
        grbY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
