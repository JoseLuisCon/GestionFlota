package Recursos;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Reloj implements Runnable {

    private String fecha;
    private JTextField miTextField;
    private Thread hilo;

    
    
    public Reloj(JTextField miTextField) {

        this.miTextField = miTextField;

        hilo = new Thread(this);
        hilo.start();

    }

    @Override
    public void run() {

        while (true) {
            calcula();
            try {

                miTextField.setText(fecha);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }

    }

    private void calcula() {

        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);

        SimpleDateFormat fecha = new SimpleDateFormat("k:mm:ss");
        this.fecha = fecha.format(fechaHoraActual);

    }

}
