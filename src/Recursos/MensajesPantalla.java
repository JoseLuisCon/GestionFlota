
package Recursos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MensajesPantalla implements Runnable {
    private JTextField txtMensaje;
    private String mensaje;
    private int cadencia;
    private int repeticiones;
    private Thread hilo;

    public MensajesPantalla(JTextField txtMensaje, String mensaje,int pausa, int repeticiones) {
        this.txtMensaje = txtMensaje;
        this.mensaje=mensaje;
        this.cadencia=pausa;
        this.txtMensaje.setText(mensaje);
        this.repeticiones=repeticiones;
        
//        hilo=new Thread(this);
//        hilo.start();
//        try {
//            hilo.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MensajesPantalla.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
    @Override
    public void run() {
        boolean pas=true;
        int cont=0;
        while (true) {
           
            try {
                
                if (pas){
                    SwingUtilities.invokeLater(()->{
                        txtMensaje.setVisible(true);
                    });
                    
                    pas=false;
                }
                else{
                     SwingUtilities.invokeLater(()->{
                        txtMensaje.setVisible(false);
                    });
                     
                     pas=true;
                }
                 if (cont == repeticiones) {
                       
                        break;
                    }
                 cont++;
                 
                Thread.sleep(cadencia);
            } catch (InterruptedException e) {
            }

        }
    }
    
    
    
    
}
