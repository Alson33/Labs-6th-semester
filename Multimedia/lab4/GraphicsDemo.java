package Multimedia.lab4;

import javax.swing.JFrame;
import java.awt.*;

public class GraphicsDemo extends Canvas {
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(100, 100, 200, 100);
        g.drawLine(20, 20, 100, 20);
        g.drawOval(50, 50, 40, 60);
    }

    public static void main(String[] args) {
        GraphicsDemo gd = new GraphicsDemo();    
    
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.add(gd);
        frame.setVisible(true);
    }
}
