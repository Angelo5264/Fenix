package Interfaz.Init.HiloProgressBar;

import Interfaz.MainPanel;

import javax.swing.*;

public class HiloProgressBar implements Runnable{
    private final JLabel progressBar;
    private final JTextArea  initText;
    private final MainPanel mainPanel;
    private String linea = "-".repeat(78) + " 0%";
    public HiloProgressBar (JLabel progressBar, JTextArea initText, MainPanel mainPanel){
        this.progressBar=progressBar;
        this.initText=initText;
        this.mainPanel=mainPanel;
    }
    @Override
    public void run() {
        try {
            //Eatado 1
            Thread.sleep(1000);
            SwingUtilities.invokeLater(() -> {
                linea = "#".repeat(15) + "-".repeat(45) + " 35%";
                progressBar.setText(linea);
                initText.setText("\n\nInitzialice system operative... \n\n");
            });

            // Estado 2
            Thread.sleep(1000);
            SwingUtilities.invokeLater(() -> {
                linea = "#".repeat(25) + "-".repeat(25) + " 70%";
                progressBar.setText(linea);
                initText.append("Building libraries... \n\n");
            });
            // Estado 3
            Thread.sleep(1000);
            SwingUtilities.invokeLater(() ->{
                linea = "#".repeat(36) + " 100%";
                progressBar.setText(linea);
                initText.append("Compile files... ");
            });

            Thread.sleep(1000);
            SwingUtilities.invokeLater(()->{
                mainPanel.mostrarTerminal();
            });
        }catch (Exception e){
            System.out.println("Error en el hilo de barra de progreso");
            System.out.println(e.getMessage());
        }
    }

}
