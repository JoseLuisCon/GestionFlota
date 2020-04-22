package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class cintaOpciones extends JPanel {


    private JPanel cintaPanel;

    public cintaOpciones(JPanel panel, List<String> botonesStrings) {

        this.cintaPanel = panel;

        addBotones(botonesStrings);

    }

    public void addBotones(List<String> Caption) {
       //antes de añandir comprobamos que no están ya añadidos
        boolean existenBotones = false;
        for (Component comp : cintaPanel.getComponents()) {
            if (comp instanceof JButton) {
                existenBotones = true;
                cintaPanel.remove(comp);
            }
            if (comp instanceof JLabel) {
                cintaPanel.remove(comp);
            }

        }

        JLabel labelRelleno = new JLabel("                                  ");
        cintaPanel.add(labelRelleno);

        for (String boton : Caption) {

            JButton newButton = new JButton(boton);

            newButton.setOpaque(false);
            newButton.setContentAreaFilled(false);
            newButton.setBorderPainted(false);
            newButton.setForeground(Color.WHITE);
            newButton.setFont(new Font("Tahoma", Font.BOLD, 14));
            newButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            cintaPanel.add(newButton);

        }
        cintaPanel.updateUI();

    }   
}
