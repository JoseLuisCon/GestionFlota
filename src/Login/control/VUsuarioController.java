package Login.control;

import Login.modelo.Usuario;
import javax.swing.JOptionPane;

public class VUsuarioController implements InterfaceValidacion {

    private UsuarioDAO usuarioDAO;
    private Usuario usuario;

    public VUsuarioController() {

        this.usuarioDAO = new UsuarioDAO();
        this.usuario = new Usuario();

    }

    @Override
    public void recibeUsuario(String txtUsuario) {
        if (txtUsuario.length() > 1) {
            usuario.setNameUser(txtUsuario);
        }
    }

    @Override
    public void recibeContrasena(String txtPass) {
        if (txtPass.length() > 1) {
            usuario.setPass(txtPass);
        }
    }
 
    @Override
    public Usuario getUsuario(Usuario user){
        return usuarioDAO.getUsuario(user);
    }

}
