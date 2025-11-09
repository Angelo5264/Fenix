package Interfaz.Terminal;

import javax.swing.JPanel;
import java.awt.*;

public class PanelTerminal extends JPanel {
    public PanelTerminal(){
    }
    public PanelTerminal(int WIDTH, int HEIGTH, int MARGIN){
        setSize(WIDTH,HEIGTH);
        setBackground(Color.BLACK);
        setOpaque(true); //hace que el panel deje de estar transparente
        setLayout(null);

    }
}
