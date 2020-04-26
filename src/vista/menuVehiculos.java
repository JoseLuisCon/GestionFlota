


package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;


public final class menuVehiculos {
    
    private static menuVehiculos menuVehiculos=null;
    
    private static List<JButton> botonesMenu=new ArrayList<>();

    private menuVehiculos() {
    }
    
    public static menuVehiculos getmenuVehiculos(){
        if(menuVehiculos!=null){
            return new menuVehiculos();
        }
        return menuVehiculos;
    }
    
    public static void setMenuVehiculos(List<String> opciones){
        int x=0;
        
        for (String boton : opciones) {

            JButton newButton = new JButton(boton);

            newButton.setOpaque(false);
            newButton.setContentAreaFilled(false);
            newButton.setBorderPainted(false);
            newButton.setForeground(Color.WHITE);
            newButton.setFont(new Font("Tahoma", Font.BOLD, 14));
            newButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            
            botonesMenu.add(newButton);

        }
     }

    public static List<JButton> getBotonesMenu() {
        return botonesMenu;
    }

    public static void moverBotones (int sentido){
        
        
        if (sentido==1){
            
            
            
            
        }
        
        
    }
   
}
