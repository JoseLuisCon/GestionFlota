
package Login.control;


import BBDD.ConexionBBDD;
import Login.modelo.Usuario;
import java.sql.*;


public class UsuarioDAO {
    
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private Usuario user;
    
    public UsuarioDAO(){
        conexion=ConexionBBDD.conectar();
    }
    
    
    public Usuario getUsuario(Usuario usuario){
        
        
        String sql="SELECT * FROM USUARIOS WHERE USUARIO='" + usuario.getNameUser() + "' AND CONTRASENA='" + usuario.getPass()+ "'" ;
        try {
            st=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(sql);
            
            if (rs.first()) {
                rs.isFirst();
                user=new Usuario();
                user.setId_Usuario(rs.getInt("Id_Usuario"));
                user.setNameUser(rs.getString("Usuario"));
                user.setPass(rs.getString("Contrasena"));
                user.setTipo_Usuario(rs.getString("Tipo_Usuario"));
                user.setFecha_alta(rs.getDate("Fecha_Alta"));
                user.setFecha_baja(rs.getDate("Fecha_baja"));
            }
            
            rs.close();
            st.close();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
      
    }
}
