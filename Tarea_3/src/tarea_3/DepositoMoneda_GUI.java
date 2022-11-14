/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tarea_3;

public class DepositoMoneda_GUI extends javax.swing.JPanel {
    
    int numMonedas;
    
    public DepositoMoneda_GUI() {
        
        numMonedas = 0;
        initComponents();
        this.setLocation(WIDTH, WIDTH);
        this.setSize(jLabel1.getSize());
    }
    
    public void setCantMonedas(int num){
        numMonedas = num;
        jLabel1.setIcon(this.CantidadMonedas());
    }
    
    public javax.swing.ImageIcon CantidadMonedas() {
        if(this.numMonedas>=3){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 3 + ".png"));
        }else if(this.numMonedas==2){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 2 + ".png"));
        }else if(this.numMonedas==1){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMonedas" + 1 + ".png"));
        }else if(this.numMonedas<=0){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMoneda.png"));
        }else{
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DepositoMoneda.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel1.setMinimumSize(new java.awt.Dimension(45, 45));
        jLabel1.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
