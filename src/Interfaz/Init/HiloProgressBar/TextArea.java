package Interfaz.Init.HiloProgressBar;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {

    public TextArea(int MARGIN){
        setBounds(MARGIN, 100, 400,200);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFont(new Font("Monospaced", Font.BOLD, 20));
        setText("");
        setEditable(false);

    }




}
