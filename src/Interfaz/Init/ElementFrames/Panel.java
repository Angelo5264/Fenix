package Interfaz.Init.ElementFrames;
import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel {
    private static final int MARGIN_INIT = 20;
    public Panel(int WIDTH, int HEIGHT){
        setBounds(0,0, WIDTH,HEIGHT);
        setBackground(Color.BLACK);
        setOpaque(true);
        setLayout(null);
        Logo logo = new Logo(MARGIN_INIT);
        add(logo);
        add(new ProgressBar(WIDTH,MARGIN_INIT));
    }
}
