package tarea_3;

public class Bebida_GUI extends javax.swing.JPanel {

    private Bebida b;
    private int grbX, grbY;

    public Bebida_GUI() {
        b = new CanadaDry(-1);
        initComponents();
        this.setPreferredSize(jLabel1.getSize());
        this.setSize(jLabel1.getSize());
    }

    public void setBebida(Bebida b) {
        this.b = b;
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + b.tomarBebida() + ".png")));
    }
    
    public void setGrb(int x,int y){
        grbX = x;
        grbY = y;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CanadaDry.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 20, 34);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getX() + evt.getX() - grbX, this.getY() + evt.getY() - grbY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        grbX = evt.getX();
        grbY = evt.getY();
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
