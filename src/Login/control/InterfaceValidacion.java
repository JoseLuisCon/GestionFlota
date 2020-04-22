package Login.control;

import Login.modelo.Usuario;


public interface InterfaceValidacion {
    public void recibeUsuario(String user);
    public void recibeContrasena(String pass);
    public Usuario getUsuario(Usuario user);
    
}
