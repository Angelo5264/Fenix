package Interfaz.Init.HiloProgressBar;

import javax.swing.*;

public class HiloProgressBar implements Runnable{
    private final JLabel progressBar;
    private final JTextArea  initText;
    private final JPanel panelOculto, panelMostrar;
    private String linea = "-".repeat(78) + " 0%";
    public HiloProgressBar (JLabel progressBar, JTextArea initText, JPanel panelOculto, JPanel panelMostrar){
        this.progressBar=progressBar;
        this.initText=initText;
        this.panelOculto=panelOculto;
        this.panelMostrar=panelMostrar;
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
                panelOculto.setVisible(false);
                panelMostrar.setVisible(true);
                if(panelOculto.getParent()!=null){
                    panelOculto.getParent().revalidate(); // vamos al padre qeu contiene dicho panel y recalculamos el tamaño
                    panelOculto.getParent().repaint(); // redibujamos en el padre de dicho panel
                }
            });
        }catch (Exception e){
            System.out.println("Error en el hilo de barra de progreso");
            System.out.println(e.getMessage());
        }
    }

}
