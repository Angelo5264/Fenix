package Interfaz.Terminal.ShellInterface;

import javax.swing.*;
import java.awt.*;

public class TextArea  extends JTextArea {
    public TextArea (int WIDTH, int MARGIN){
        setBounds(WIDTH, 400, MARGIN, 20);
        setEditable(false);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFont(new Font("Monospaced", Font.BOLD, 20));

    }
}
