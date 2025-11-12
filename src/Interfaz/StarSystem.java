package Interfaz;

import Interfaz.Init.Panelnit;
import Interfaz.Terminal.PanelTerminal;

import javax.swing.*;

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
        add(new Panelnit(WIDTH, HEIGHT, MARGIN));
        add(new PanelTerminal(WIDTH,HEIGHT,MARGIN));
        setVisible(true);
    }
    static void main(String[] args) {
        new StarSystem();
    }
}
