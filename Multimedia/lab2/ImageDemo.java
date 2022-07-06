package Multimedia.lab2;

import java.awt.*;
import java.net.URL;

import javax.swing.JFrame;

public class ImageDemo extends Canvas {
    Image image = null;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if(image == null){
            image = getImage("assets/test.jpg");
        }
        
        g.drawImage(image, 20, 20, 200, 200, this);
    }

    public Image getImage(String path) {
        Image tempImage = null;

        try {
            URL imageUrl = ImageDemo.class.getResource(path);
            tempImage = Toolkit.getDefaultToolkit().getImage(imageUrl);
        } catch (Exception e) {
            System.out.println("Error while getting image" + e.getMessage());
        }

        return tempImage;
    }

    public static void main(String[] args) {
        ImageDemo img = new ImageDemo();

        JFrame frame = new JFrame();

        frame.add(img);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
