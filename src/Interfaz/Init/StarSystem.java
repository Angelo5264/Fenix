package Interfaz.Init;

import Interfaz.Init.ElementFrames.Panel;

import javax.swing.*;

public class StarSystem extends JFrame {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 500;

    public StarSystem(){
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setTitle("Fénix OS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Panel(WIDTH, HEIGHT));
        setVisible(true);
    }
    public static void main(String[] args) {
        new StarSystem();
    }
}
