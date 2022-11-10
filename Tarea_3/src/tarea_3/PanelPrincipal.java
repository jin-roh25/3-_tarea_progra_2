package tarea_3;

import java.util.ArrayList;
import java.awt.*;

public class PanelPrincipal extends javax.swing.JPanel {

    private ArrayList<Moneda_GUI> depositoMonedas;
    private Comprador compr;

    public PanelPrincipal() {
        depositoMonedas = new ArrayList<Moneda_GUI>();
        initComponents();
        compr = new Comprador(null, exp_GUI.getExpendedor(), 0);
    }

    @Override
    protected void processEvent(AWTEvent e) {
        super.processEvent(e);
        System.out.println("process event");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerdPane = new javax.swing.JLayeredPane();
        exp_GUI = new tarea_3.Expendedor_GUI();
        moneda_GUI1 = new tarea_3.Moneda_GUI();
        moneda_GUI2 = new tarea_3.Moneda_GUI();
        moneda_GUI3 = new tarea_3.Moneda_GUI();
        moneda_GUI4 = new tarea_3.Moneda_GUI();

        setPreferredSize(new java.awt.Dimension(500, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        layerdPane.setBackground(new java.awt.Color(242, 69, 242));
        layerdPane.setPreferredSize(new java.awt.Dimension(500, 500));
        layerdPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layerdPaneMouseClicked(evt);
            }
        });

        moneda_GUI2.setMoneda(new Moneda500());

        moneda_GUI3.setMoneda(new Moneda1000());

        moneda_GUI4.setMoneda(new Moneda1500());

        layerdPane.setLayer(exp_GUI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerdPane.setLayer(moneda_GUI1, 2);
        layerdPane.setLayer(moneda_GUI2, 2);
        layerdPane.setLayer(moneda_GUI3, 2);
        layerdPane.setLayer(moneda_GUI4, 2);

        javax.swing.GroupLayout layerdPaneLayout = new javax.swing.GroupLayout(layerdPane);
        layerdPane.setLayout(layerdPaneLayout);
        layerdPaneLayout.setHorizontalGroup(
            layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerdPaneLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(exp_GUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerdPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moneda_GUI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layerdPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(moneda_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda_GUI3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneda_GUI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layerdPaneLayout.setVerticalGroup(
            layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerdPaneLayout.createSequentialGroup()
                .addGap(123, 132, Short.MAX_VALUE)
                .addGroup(layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exp_GUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layerdPaneLayout.createSequentialGroup()
                        .addGroup(layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(moneda_GUI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layerdPaneLayout.createSequentialGroup()
                                .addGroup(layerdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(moneda_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(moneda_GUI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moneda_GUI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114)))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerdPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerdPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void layerdPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerdPaneMouseClicked
        System.out.println(evt.getX() + "  " + evt.getY());
    }//GEN-LAST:event_layerdPaneMouseClicked

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        Moneda_GUI m;

        if (evt.getSource().getClass() == Moneda_GUI.class) {
            m = (Moneda_GUI) evt.getSource();

            if (exp_GUI.isInCoinSlot(m.getCenter()) && compr.getMoneda() == null) {

                compr.setMoneda(m.getMoneda());
                layerdPane.remove(m);
                this.repaint();
                System.out.println("removido ");
            }
        }
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tarea_3.Expendedor_GUI exp_GUI;
    private javax.swing.JLayeredPane layerdPane;
    private tarea_3.Moneda_GUI moneda_GUI1;
    private tarea_3.Moneda_GUI moneda_GUI2;
    private tarea_3.Moneda_GUI moneda_GUI3;
    private tarea_3.Moneda_GUI moneda_GUI4;
    // End of variables declaration//GEN-END:variables
}
