
package BBDD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//===================CLASE PARA ESTABLECER UNA ÚNICA INSTANCIA HACIA LA CONEXIÓN CON PATRÓN DE DISEÑO SINGLETON
public class ConexionBBDD {
    
    private static Connection conexion=null;
    private static String url;
            
            
            
    private ConexionBBDD(){};
    
    public static Connection conectar(){
        
        if (conexion==null){
            
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                url = "jdbc:ucanaccess://" + "src\\BBDD\\vehiculos.accdb";
                
                conexion = DriverManager.getConnection(url);
                
                return conexion;
            } catch (Exception ex) {
                Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return conexion;
        
    }
    
    
}
