package Interfaz.Init.ElementFrames;

import javax.swing.JLabel;
import java.awt.*;

public class ProgressBar extends JLabel implements Runnable {

    private Thread hilo;
    private String linea = "-".repeat(78) + " 0%";
    public ProgressBar(int width, int margin) {
        setBounds(margin, 400, width, 60);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 30));
        setText(linea);

        // Inicia el hilo de animación
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        try {
            // Estado 1
            Thread.sleep(1000);
            linea = "#".repeat(15) + "-".repeat(52) + " 35%";
            setText(linea);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}