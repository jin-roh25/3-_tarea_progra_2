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
        jButton4 = new javax.swing.JButton();
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

        expendedor.setBackground(java.awt.Color.white);
        add(expendedor);
        expendedor.setBounds(-1, -1, 200, 300);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CanadaDry.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        setLayer(jButton1, 1);
        add(jButton1);
        jButton1.setBounds(170, 50, 15, 22);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CocaCola.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setLayer(jButton2, 1);
        add(jButton2);
        jButton2.setBounds(140, 50, 15, 22);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pap.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        setLayer(jButton3, 1);
        add(jButton3);
        jButton3.setBounds(170, 80, 15, 22);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bilz.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setPreferredSize(new java.awt.Dimension(25, 40));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        setLayer(jButton4, 1);
        add(jButton4);
        jButton4.setBounds(140, 80, 15, 22);
        add(monedero);
        monedero.setBounds(350, 260, 80, 100);
        setLayer(moneda_GUI10, 2);
        add(moneda_GUI10);
        moneda_GUI10.setBounds(460, 460, 30, 30);

        moneda_GUI1.setMoneda(new Moneda1500());
        setLayer(moneda_GUI1, 2);
        add(moneda_GUI1);
        moneda_GUI1.setBounds(290, 90, 30, 30);

        bebida_GUI2.setBebida(new Bilz(5));
        setLayer(bebida_GUI2, 2);
        add(bebida_GUI2);
        bebida_GUI2.setBounds(130, 390, 20, 34);

        bebida_GUI3.setBebida(new CocaCola(5));
        setLayer(bebida_GUI3, 2);
        add(bebida_GUI3);
        bebida_GUI3.setBounds(400, 160, 20, 34);
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
        compr.comprar();
        expendedor.sincronizarDeposito();
        expendedor.entregarBebida(true);
        expendedor.entregarVuelto();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        compr.setNumBebida(2);
        compr.comprar();
        expendedor.sincronizarDeposito();
        expendedor.entregarBebida(true);
        expendedor.entregarVuelto();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        compr.setNumBebida(3);
        compr.comprar();
        expendedor.sincronizarDeposito();
        expendedor.entregarBebida(true);
        expendedor.entregarVuelto();
    }//GEN-LAST:event_jButton3MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getSource().getClass() == Monedero_GUI.class) {
            Moneda_GUI m = monedero.sacarMoneda();
            ultimaMoneda = m;
            if (m != null) {
                this.setLayer(m, 2);
                this.add(m);
                m.setLocation(monedero.getX() + evt.getX() - m.getWidth() / 2,
                        monedero.getY() + evt.getY() - m.getHeight() / 2);
                //m.getWidth(), m.getHeight());

                m.dispatchEvent(evt);

                this.revalidate();
                this.repaint();
            }
        }
        if (evt.getSource().getClass() == DepositoBebida_GUI.class) {
            Bebida_GUI b = new Bebida_GUI();
            b.setBebida(expendedor.getBebida());
            this.setLayer(b, 2);
            this.add(b);
            b.setBounds(expendedor.getX() + evt.getX() - b.getWidth() / 2,
                    expendedor.getY() + evt.getY() - b.getHeight() / 2,
                    b.getWidth(), b.getHeight());

            b.dispatchEvent(evt);

            this.revalidate();
            this.repaint();
            
            expendedor.entregarBebida(false);
        }
        if (evt.getSource().getClass() == DepositoMoneda_GUI.class) {
            Moneda_GUI m = new Moneda_GUI();
            m.setMoneda(expendedor.getVuelto());
            ultimaMoneda = m;
            if (m != null) {
                this.setLayer(m, 2);
                this.add(m);
                m.setBounds(expendedor.getX() + evt.getX() - m.getWidth() / 2,
                        expendedor.getY() + evt.getY() - m.getHeight() / 2,
                        m.getWidth(), m.getHeight());

                m.dispatchEvent(evt);
                
                this.revalidate();
                this.repaint();
                
                expendedor.entregarVuelto();
            }

        }
        System.out.println("Comp en Layer 2: "+this.getComponentCountInLayer(2));
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        if (ultimaMoneda != null) {
            ultimaMoneda.dispatchEvent(evt);
            ultimaMoneda.setGrb(evt.getX(), evt.getY());
        }
        
    }//GEN-LAST:event_formMouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        compr.setNumBebida(4);
        compr.comprar();
        expendedor.sincronizarDeposito();
        expendedor.entregarBebida(true);
        expendedor.entregarVuelto();
    }//GEN-LAST:event_jButton4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tarea_3.Bebida_GUI bebida_GUI1;
    private tarea_3.Bebida_GUI bebida_GUI2;
    private tarea_3.Bebida_GUI bebida_GUI3;
    private tarea_3.Expendedor_GUI expendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private tarea_3.Moneda_GUI moneda_GUI1;
    private tarea_3.Moneda_GUI moneda_GUI10;
    private tarea_3.Monedero_GUI monedero;
    // End of variables declaration//GEN-END:variables
}
