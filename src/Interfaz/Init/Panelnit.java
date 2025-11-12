package Interfaz.Init;
import Interfaz.Init.HiloProgressBar.HiloProgressBar;
import Interfaz.Init.HiloProgressBar.ProgressBar;
import Interfaz.Init.HiloProgressBar.TextArea;
import Interfaz.Terminal.PanelTerminal;

import javax.swing.JPanel;
import java.awt.*;

public class Panelnit extends JPanel {
    public Panelnit(int WIDTH, int HEIGHT, int MARGIN){
        setBounds(0,0, WIDTH,HEIGHT);
        setBackground(Color.BLACK);
        setOpaque(true);
        setLayout(null);
        Logo logo = new Logo(MARGIN);
        ProgressBar barra = new ProgressBar(WIDTH,MARGIN);
        TextArea textArea = new TextArea(MARGIN);
        PanelTerminal panelMostrar= new PanelTerminal();
        HiloProgressBar hiloProgressBar = new HiloProgressBar(barra,textArea,this, panelMostrar);
        Thread hilo = new Thread(hiloProgressBar);
        hilo.start();
        add(logo);
        add(barra);
        add(textArea);
    }
}
