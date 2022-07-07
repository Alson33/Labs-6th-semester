package Multimedia.lab4;

import java.awt.*;
import javax.swing.JFrame;

public class Zebracrossing extends Canvas {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < 8; i++) {
            if(i%2==0){
                g.fillRect(i*50, 20, 50, 300);
            }else{
                g.drawRect(i*50, 20, 50, 300);
            }
        }
    }

    public static void main(String[] args) {
        Zebracrossing zc = new Zebracrossing();

        JFrame frame = new JFrame();

        frame.setSize(500, 600);
        frame.add(zc);
        frame.setVisible(true);
    }
}
