package relojconde;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class relojConde extends JLabel implements Runnable {

    private String fecha;
    private Thread hilo;

    public relojConde() {

        hilo = new Thread(this);
        hilo.start();

    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == hilo) {
            calcula();

            try {
                setText(fecha);
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
