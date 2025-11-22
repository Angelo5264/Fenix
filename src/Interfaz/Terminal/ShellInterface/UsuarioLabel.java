package Interfaz.Terminal.ShellInterface;

import javax.swing.*;
import java.awt.*;

public class UsuarioLabel extends JLabel {
    public UsuarioLabel(int MARGIN){
        setBounds(MARGIN,500,200,60);
        setFont(new Font("Monospaced", Font.BOLD, 15));
        setText("angelo@fenix:~$");
        setOpaque(true);
        setBackground(Color.WHITE);
    }
}
