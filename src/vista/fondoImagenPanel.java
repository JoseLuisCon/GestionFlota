
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class fondoImagenPanel  extends JPanel{
    private Image imagen;

        @Override
        public void paintChildren(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/images/yellow.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paintChildren(g);

        }
}
