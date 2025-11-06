package Interfaz.Init.ElementFrames;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Logo extends JLabel{
    public Logo(int marginInit){
        setBounds(marginInit,50,300,60);
        //  Importamos la imagen
        ImageIcon icono = new ImageIcon(getClass().getResource("/Interfaz/Init/ElementFrames/Resources/LogoFenix.jpeg"));
        //Redimenzionar la imagen = tamaño 300x60
        Image imagen = icono.getImage().getScaledInstance(300, 60, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(imagen));
    }
}
