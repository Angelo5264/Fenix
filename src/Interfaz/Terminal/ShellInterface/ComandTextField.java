package Interfaz.Terminal.ShellInterface;

import javax.swing.*;
import java.awt.*;

public class ComandTextField extends JTextField {
    public ComandTextField(int WIDTH, int MARGIN){
        setBounds(MARGIN+150,420,WIDTH-150,40); //200 es el tamaño del label qeu contendra nuestro nombre de usuario
        setFont(new Font("Monospaced", Font.BOLD, 15));
        setOpaque(true);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setBorder(null);
    }
}
