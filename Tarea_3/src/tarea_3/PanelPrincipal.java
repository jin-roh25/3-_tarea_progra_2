package tarea_3;

import java.util.ArrayList;
import java.awt.*;

public class PanelPrincipal extends javax.swing.JLayeredPane {

    private ArrayList<Moneda_GUI> depositoMonedas;
    private Comprador compr;

    public PanelPrincipal() {
        depositoMonedas = new ArrayList<Moneda_GUI>();
        initComponents();
        compr = new Comprador(null, exp_GUI.getExpendedor(), 0);
        this.setLayer(moneda_GUI1, DEFAULT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        moneda_GUI2.setMoneda(new Moneda500());

        moneda_GUI3.setMoneda(new Moneda1000());

        moneda_GUI4.setMoneda(new Moneda1500());

        setLayer(exp_GUI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(moneda_GUI1, 2);
        setLayer(moneda_GUI2, 2);
        setLayer(moneda_GUI3, 2);
        setLayer(moneda_GUI4, 2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(exp_GUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda_GUI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneda_GUI2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda_GUI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneda_GUI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda_GUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneda_GUI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneda_GUI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneda_GUI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(exp_GUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        Moneda_GUI m;

        if (evt.getSource().getClass() == Moneda_GUI.class) {
            m = (Moneda_GUI) evt.getSource();

            if (exp_GUI.isInCoinSlot(m.getCenter()) && compr.getMoneda() == null) {

                compr.setMoneda(m.getMoneda());
                this.remove(m);
                this.repaint();
                System.out.println("removido ");
            }
        }
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tarea_3.Expendedor_GUI exp_GUI;
    private tarea_3.Moneda_GUI moneda_GUI1;
    private tarea_3.Moneda_GUI moneda_GUI2;
    private tarea_3.Moneda_GUI moneda_GUI3;
    private tarea_3.Moneda_GUI moneda_GUI4;
    // End of variables declaration//GEN-END:variables
}
