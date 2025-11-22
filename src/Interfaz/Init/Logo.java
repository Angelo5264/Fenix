package Interfaz.Init;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Logo extends JLabel{
    public Logo(int marginInit){
        setBounds(marginInit,50,300,60);
        //  Importamos la imagen
        String rutaImagen = "/LogoFenix.jpeg";
        URL ruta= getClass().getResource(rutaImagen);
        //Verficiar si la imagen fue subida
        if (ruta == null){
            IO.println("ERROR: Imagen no subida \n " +
                    "Class: Logo.java");
        }
        ImageIcon icono = new ImageIcon(ruta);
        //Redimenzionar la imagen = tamaño 300x60
        Image imagen = icono.getImage().getScaledInstance(300, 60, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(imagen));
    }
}
