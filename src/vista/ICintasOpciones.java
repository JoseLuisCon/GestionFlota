
package vista;

import java.awt.Component;
import java.util.List;


public interface ICintasOpciones {
    
    public void addBotones(List<String> nombreBotones); //Método para pasar una lista de String con los nombres de los botones.
    public List<Component> getBotones(); //devolverá un array con los botones creados.
    
    
}
