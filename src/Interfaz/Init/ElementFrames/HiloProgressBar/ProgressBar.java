package Interfaz.Init.ElementFrames.HiloProgressBar;

import javax.swing.JLabel;
import java.awt.*;

public class ProgressBar extends JLabel  {

    private String linea = "-".repeat(78) + " 0%";
    public ProgressBar(){

    }
    public ProgressBar(int WIDTH, int MARGIN) {
        setBounds(MARGIN, 400, WIDTH, 60);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 25));
        setText(linea);
    }
}