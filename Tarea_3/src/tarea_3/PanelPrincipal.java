package tarea_3;

import java.util.ArrayList;
import java.awt.*;

public class PanelPrincipal extends javax.swing.JLayeredPane {

    private Comprador compr;
    private Moneda_GUI ultimaMoneda;

    public PanelPrincipal() {
        ultimaMoneda = null;
        initComponents();
        compr = new Comprador(null, expendedor.getExpendedor(), 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expendedor = new tarea_3.Expendedor_GUI();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        monedero = new tarea_3.Monedero_GUI();
        moneda_GUI10 = new tarea_3.Moneda_GUI();
        moneda_GUI1 = new tarea_3.Moneda_GUI();
        bebida_GUI2 = new tarea_3.Bebida_GUI();
        bebida_GUI3 = new tarea_3.Bebida_GUI();
        bebida_GUI1 = new tarea_3.Bebida_GUI();

        setPreferredSize(new java.awt.Dimension(500, 500));
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
        add(expendedor);
        expendedor.setBounds(0, 0, 320, 292);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CanadaDry.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        setLayer(jButton1, 1);
        add(jButton1);
        jButton1.setBounds(243, 354, 15, 22);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CocaCola.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        setLayer(jButton2, 1);
        add(jButton2);
        jButton2.setBounds(280, 330, 15, 22);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pap.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        setLayer(jButton3, 1);
        add(jButton3);
        jButton3.setBounds(310, 350, 15, 22);
        add(monedero);
        monedero.setBounds(350, 260, 80, 100);
        setLayer(moneda_GUI10, 2);
        add(moneda_GUI10);
        moneda_GUI10.setBounds(460, 460, 30, 30);

        moneda_GUI1.setMoneda(new Moneda1500());
        setLayer(moneda_GUI1, 2);
        add(moneda_GUI1);
        moneda_GUI1.setBounds(270, 250, 30, 30);
        setLayer(bebida_GUI2, 2);
        add(bebida_GUI2);
        bebida_GUI2.setBounds(130, 390, 21, 34);

        bebida_GUI3.setBebida(new CocaCola(5));
        setLayer(bebida_GUI3, 2);
        add(bebida_GUI3);
        bebida_GUI3.setBounds(400, 160, 21, 34);
        setLayer(bebida_GUI1, 2);
        add(bebida_GUI1);
        bebida_GUI1.setBounds(60, 330, 20, 34);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.getSource().getClass() == Moneda_GUI.class || ultimaMoneda != null) {
            Moneda_GUI m = null;

            if (evt.getSource().getClass() == Moneda_GUI.class) {
                m = (Moneda_GUI) evt.getSource();
            }
            if (ultimaMoneda != null) {
                m = ultimaMoneda;
            }

            if (expendedor.isInCoinSlot(m.getCenter()) && compr.getMoneda() == null) {

                compr.setMoneda(m.getMoneda());
                this.remove(m);
                this.revalidate();
                this.repaint();
            }

            if (monedero.isInMonedero(m.getCenter())) {
                monedero.meterMoneda(m);
                this.remove(m);
                this.revalidate();
                this.repaint();
            }

            ultimaMoneda = null;
        }
    }//GEN-LAST:event_formMouseReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        compr.setNumBebida(1);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        compr.setNumBebida(2);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        compr.setNumBebida(3);
    }//GEN-LAST:event_jButton3MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getSource().getClass() == Monedero_GUI.class) {
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
        }else{
            System.out.println(evt.getPoint());
        }
        
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (ultimaMoneda != null) {
            ultimaMoneda.dispatchEvent(evt);
            ultimaMoneda.setGrb(evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tarea_3.Bebida_GUI bebida_GUI1;
    private tarea_3.Bebida_GUI bebida_GUI2;
    private tarea_3.Bebida_GUI bebida_GUI3;
    private tarea_3.Expendedor_GUI expendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private tarea_3.Moneda_GUI moneda_GUI1;
    private tarea_3.Moneda_GUI moneda_GUI10;
    private tarea_3.Monedero_GUI monedero;
    // End of variables declaration//GEN-END:variables
}
