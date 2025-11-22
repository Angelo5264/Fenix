package Interfaz.Init;
import Interfaz.Init.HiloProgressBar.HiloProgressBar;
import Interfaz.Init.HiloProgressBar.ProgressBar;
import Interfaz.Init.HiloProgressBar.TextArea;
import Interfaz.Terminal.PanelTerminal;

import javax.swing.JPanel;
import java.awt.*;

public class Panelnit extends JPanel {
    private ProgressBar barra;
    private TextArea textArea;
    public Panelnit(int WIDTH, int HEIGHT, int MARGIN){
        setBounds(0,0, WIDTH,HEIGHT);
        setBackground(Color.BLACK);
        setOpaque(true);
        setLayout(null);
        Logo logo = new Logo(MARGIN);
        barra = new ProgressBar(WIDTH,MARGIN);
        textArea = new TextArea(MARGIN);

        add(logo);
        add(barra);
        add(textArea);
    }

    public void startThread(JPanel panelMostrar, JPanel panelOcultar){
        HiloProgressBar hiloProgressBar = new HiloProgressBar(this.barra,this.textArea,this, panelMostrar);
        Thread hilo = new Thread(hiloProgressBar);
        hilo.start();
    }
}
