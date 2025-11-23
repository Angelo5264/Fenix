package Interfaz;

import Interfaz.Init.Panelnit;
import Interfaz.Terminal.PanelTerminal;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private CardLayout cardLayout;
    private PanelTerminal panelTerminal;
    public MainPanel(int WITDH, int HEIGTH, Panelnit initPanel, PanelTerminal panelTerminal){
        this.panelTerminal=panelTerminal;
        cardLayout = new CardLayout();
        setSize(WITDH,HEIGTH);
        setLayout(cardLayout);
        setOpaque(true);
        setBackground(Color.BLACK);


        add(initPanel, "panelInit");
        add(panelTerminal, "panelTerminal");

    }
    public MainPanel(){

    }

    public void mostarInit(){
        if(cardLayout != null){
            cardLayout.show(this, "panelInit");
        }

    }

    public void mostrarTerminal(){
        if(cardLayout != null){
            cardLayout.show(this, "panelTerminal");
            revalidate();
            repaint();
            panelTerminal.requestTerminalFocus();
        }

    }
}
