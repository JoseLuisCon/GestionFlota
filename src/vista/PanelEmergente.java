
package vista;

import java.awt.Point;

/**
 *
 * @author conde
 */
public class PanelEmergente extends javax.swing.JPanel {

   private String mensaje="";
   private int sentido=0;
   private Point posicion;

    
    
    public PanelEmergente() {
       
        lbl_mensaje.setText(mensaje);
        setLocation(posicion);
    }

    public PanelEmergente(Point posicion, String mensaje) {
         initComponents();
        this.posicion = posicion;
        this.mensaje=mensaje;
        lbl_mensaje.setText(this.mensaje);
        setSize(this.mensaje.length()*8, 15);
    }
    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_mensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 69, 76));
        setForeground(new java.awt.Color(206, 249, 34));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        lbl_mensaje.setBackground(new java.awt.Color(36, 69, 76));
        lbl_mensaje.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_mensaje.setForeground(new java.awt.Color(206, 249, 34));
        lbl_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mensaje.setText("jLabel1");
        lbl_mensaje.setMaximumSize(getMaximumSize());
        lbl_mensaje.setMinimumSize(getMinimumSize());
        lbl_mensaje.setPreferredSize(getPreferredSize());
        add(lbl_mensaje);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel lbl_mensaje;
    // End of variables declaration//GEN-END:variables
}
