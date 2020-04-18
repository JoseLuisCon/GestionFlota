
package Login.control;


import BBDD.ConexionBBDD;
import Login.modelo.Usuario;
import java.sql.*;


public class UsuarioDAO {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    public UsuarioDAO(){
        conexion=ConexionBBDD.conectar();
    }
    
    
    public boolean getUsuario(Usuario usuario){
        String sql="SELECT * FROM USUARIOS WHERE USUARIO='" + usuario.getNameUser() + "' AND CONTRASENA='" + usuario.getPass()+ "'" ;
        try {
            st=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(sql);
            
            if (rs.first()) return true;
            
            rs.close();
            st.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
      
    }
}
