package Interfaz;

import Interfaz.Init.Panelnit;
import Interfaz.Terminal.PanelTerminal;

import javax.swing.*;
import java.awt.*;

public class StarSystem extends JFrame {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 500;
    private static final int MARGIN = 20;
    public StarSystem(){
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setTitle("Fénix OS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panelnit panelnit = new Panelnit(WIDTH, HEIGHT, MARGIN);
        PanelTerminal panelTerminal = new PanelTerminal(WIDTH,HEIGHT,MARGIN);
        panelTerminal.setVisible(false);
        panelnit.setVisible(true);

        panelnit.setBounds(0,0,WIDTH,HEIGHT);
        panelTerminal.setBounds(0,0,WIDTH,HEIGHT);

        add(panelTerminal);
        add(panelnit);
        panelnit.startThread(panelTerminal,panelnit);


        setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            new StarSystem();
        });
    }
}
