
package vista;

import java.util.List;
import javax.swing.JButton;


public interface ICintasOpciones {
    
    public void addBotones(List<String> nombreBotones); //Método para pasar una lista de String con los nombres de los botones.
    public List<JButton> getBotones(); //devolverá un array con los botones creados.
    
    
}
