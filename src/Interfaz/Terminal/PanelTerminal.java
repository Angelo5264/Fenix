package Interfaz.Terminal;

import Interfaz.Terminal.ShellInterface.ComandTextField;
import Interfaz.Terminal.ShellInterface.UsuarioLabel;

import javax.swing.JPanel;
import java.awt.*;

public class PanelTerminal extends JPanel {
    /**
     * Panel donde se actualizara los datos de la terminal o Shell extiende de JPanel
     * @param WIDTH Ancho de ventana
     * @param HEIGTH Alto de ventana
     * @param MARGIN Margen en el que inician a dibujarse los elementos del lado izquierdo
     */
    public PanelTerminal(int WIDTH, int HEIGTH, int MARGIN){

        setSize(WIDTH,HEIGTH);
        setBackground(Color.BLACK);
        setOpaque(true); //hace que el panel deje de estar transparente
        setLayout(null);


        add(new TextArea(WIDTH,MARGIN));
        add(new UsuarioLabel(MARGIN));
        add(new ComandTextField(WIDTH,MARGIN));

    }
}
