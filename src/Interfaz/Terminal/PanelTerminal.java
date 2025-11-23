package Interfaz.Terminal;

import Interfaz.Terminal.ShellInterface.ChatTextArea;
import Interfaz.Terminal.ShellInterface.ComandTextField;
import Interfaz.Terminal.ShellInterface.UsuarioLabel;

import javax.swing.JPanel;
import java.awt.*;

public class PanelTerminal extends JPanel {
    private ComandTextField comandTextField;
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

        comandTextField= new ComandTextField(WIDTH,MARGIN);
        add(this.comandTextField);
        add(new ChatTextArea(WIDTH,MARGIN));
        add(new UsuarioLabel(MARGIN));

    }
    public void requestTerminalFocus() {
        if (comandTextField != null) {
            // Llama a requestFocusInWindow() en el componente específico
            comandTextField.requestFocusInWindow();
        }
    }
}

