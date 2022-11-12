/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tarea_3;

public class DepositoBebida_GUI extends javax.swing.JPanel {

    Bebida bebida;
    
    public DepositoBebida_GUI() {
        
        bebida = null;
        initComponents();
    }
    
    public void setBebida(Bebida b){
        bebida = b;
        jLabel1.setIcon(this.inicioBebida());
    }
    
    public javax.swing.ImageIcon inicioBebida(){
        
        if(bebida!=null){
            return new javax.swing.ImageIcon(getClass().getResource("/Images/Expendedor" + this.bebida.tomarBebida() + ".jpg"));
        }else{
            return new javax.swing.ImageIcon(getClass().getResource("/Images/ExpendedorBebidas.jpg"));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(159, 39));
        setPreferredSize(new java.awt.Dimension(159, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExpendedorBebidas.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(159, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
