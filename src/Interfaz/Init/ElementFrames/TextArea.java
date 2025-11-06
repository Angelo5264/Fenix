package Interfaz.Init.ElementFrames;

import javax.swing.*;

public class TextArea extends JTextArea {
    public TextArea(int margin){
        setBounds(margin, 100, 300,200);
        setText(texto());
        setEditable(false);
    }

    public static String texto(){
        String texto="Initzialice system operative \n " +
                     "Building libraries \n" +
                     "Compile files";
        return texto;
    }


}
