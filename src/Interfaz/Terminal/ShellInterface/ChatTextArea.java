package Interfaz.Terminal.ShellInterface;

import javax.swing.*;
import java.awt.*;

public class ChatTextArea extends JTextArea {
    public ChatTextArea(int WIDTH, int MARGIN){
        setBounds(MARGIN, 20, WIDTH, 400);
        setEditable(false);
        setFont(new Font("Monospaced", Font.BOLD, 15));
        setBackground(Color.BLACK);
        setOpaque(true);
        setForeground(Color.WHITE);

    }
}
