package Interfaz.Init.ElementFrames;

import javax.swing.*;

public class HiloProgressBar implements Runnable{
    private JLabel progressBar;
    private JTextArea  initText;
    private String linea = "-".repeat(78) + " 0%";
    public HiloProgressBar (JLabel progressBar){
        this.progressBar=progressBar;
    }
    public HiloProgressBar(JTextArea initText){
        this.initText=initText;
    }
    @Override
    public void run() {
        try {
            //Eatado 1
            Thread.sleep(1000);
            linea = "#".repeat(15) + "-".repeat(52) + " 35%";
            progressBar.setText(linea);
            initText.setText("Initzialice system operative \n ");
            // Estado 2
            Thread.sleep(1000);
            linea = "#".repeat(30) + "-".repeat(26) + " 70%";
            progressBar.setText(linea);
            initText.append("");
            // Estado 3
            Thread.sleep(1000);
            linea = "#".repeat(45) + " 100%";
            progressBar.setText(linea);

);
        }catch (Exception e){
            System.out.println("Error en el hilo de barra de progreso");
            System.out.println(e.toString());
        }
    }
}
