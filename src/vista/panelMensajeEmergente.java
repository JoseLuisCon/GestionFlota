package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class panelMensajeEmergente extends JPanel {

    Timer timerDisplay;

    JLabel lblMensaje;

    //controla si se muestra o no
    boolean panelAparece = true;

    //posicion x, y
    int xPos;
    int yPos;

    //Ancho y alto del panel emergente:
    int panelWidth;
    int panelHeight;

    // Dimensiones donde el panel se va a añadir
    int panelPadreWidth;
    int panelPadreHeight;

    // Posicion final del objeto tanto de altura (y) como de ancho (x)
    int posFinalx;
    int posFinaly;

    // Tiempo en espera antes de desaparecer
    int iEspera = 0;

    public panelMensajeEmergente(JPanel padre, String sMensaje) {

        super();
        
//        setLayout(new AbsoluteLayout());
        setSize(sMensaje.length() * 12, 25);
        setBackground(new Color(206, 249, 34));

        //definimos el label y lo agregamos al panel
        lblMensaje = new JLabel(sMensaje);
        lblMensaje.setLocation(this.getX(), this.getY());
        lblMensaje.setSize(this.getSize());
        lblMensaje.setFont(new Font("Serif", Font.BOLD, 14));
        lblMensaje.setForeground(new Color(36, 69, 76));
        lblMensaje.setAlignmentX(CENTER_ALIGNMENT);
        lblMensaje.setAlignmentY(CENTER_ALIGNMENT);
        lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensaje.setHorizontalTextPosition(SwingConstants.CENTER);

        add(lblMensaje);
        

        //cogemos medidas del panel contenedor
        panelPadreWidth = padre.getWidth();
        panelPadreHeight = padre.getHeight(); // en esta caso cojemos la alturna de toda la ventana de la aplicación para que finalice más centrado el recorrido

        //dimensionamos el label pero no lo hacemos por que creemos que se adaptará al jpanel.
        xPos = panelPadreWidth;
        yPos = panelPadreHeight-getHeight();  // la y del panelPadre

        //ponemos el panel en laposición incial
        fnSetLocation(xPos, yPos);
        
//        padre.add(this);
        setVisible(true);

        //posiciion final a la que va a llegar, como queremos desplazar de arriba hacia abajo la posición final es en el eje y 
        posFinaly = panelPadreWidth - getWidth();

        //Crea al Timer para cada .025 segundos
        timerDisplay = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (panelAparece && xPos>posFinaly){  //SI ES VISIBLE Y POSICIÓN INICIAL ES MÁS PEQUEÑA QUE POSICIÓN FINAL SUMAMOS AVANCE 25
                    xPos=xPos-15;
                    fnSetLocation(xPos, yPos);
                }else{
                    if (iEspera>15){
                        posFinaly=panelPadreWidth;
                        if (xPos<posFinaly){
                            xPos=xPos+15;
                            fnSetLocation(xPos, yPos);
                        }else{
                            panelAparece=false;
                            fnFinaliza();
                        }
                        
                    }else{
                        iEspera++;
                    }
                }
            }
        }
        );
        timerDisplay.start();

    }

    private void fnFinaliza() {

        //finaliza y destruye el jPanel
        timerDisplay.stop();

        this.setVisible(false);

    }

    private void fnSetLocation(int xPos, int yPos) {
        this.setLocation(xPos, yPos);
   }
    
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2=(Graphics2D)g;
        
        g2.fill(this.getBounds());
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    
    
}
