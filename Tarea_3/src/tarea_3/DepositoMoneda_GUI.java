/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tarea_3;

public class DepositoMoneda_GUI extends javax.swing.JLayeredPane {
    
    int numMonedas;
    
    public DepositoMoneda_GUI() {
        
        numMonedas = 0;
        initComponents();
        this.setSize(jLabel1.getSize());
    }
    
    public void setCantMonedas(int num){
        numMonedas = num;
        jLabel1.setIcon(this.CantidadMonedas());
    }
    
    public javax.swing.ImageIcon CantidadMonedas() {
        if(this.numMonedas>=3){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 3 + ".jpg"));
        }else if(this.numMonedas==2){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 2 + ".jpg"));
        }else if(this.numMonedas==1){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 1 + ".jpg"));
        }else if(this.numMonedas<=0){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMoneda.jpg"));
        }else{
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMoneda.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 45, 45);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.getParent().dispatchEvent(evt);
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
