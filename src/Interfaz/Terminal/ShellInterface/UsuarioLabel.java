package Interfaz.Terminal.ShellInterface;

import javax.swing.*;
import java.awt.*;

public class UsuarioLabel extends JLabel {
    public UsuarioLabel(int MARGIN){
        setBounds(MARGIN,420,150,40);
        setFont(new Font("Monospaced", Font.BOLD, 15));
        setText("angelo@fenix:~$");
        setOpaque(true);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
    }
}
