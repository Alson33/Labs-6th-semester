package Multimedia.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ImageAnimationDemo extends JPanel implements ActionListener {

    private Timer animator;
    private Image image;
    private int delay = 500, xPos = 0;

    public ImageAnimationDemo() {
        image = getImage("./assets/frame21.gif"); 
        animator = new Timer(delay, this);
        animator.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(xPos > 500){
            xPos = 0;
        }

        g.drawImage(image, xPos, 0, this);
        xPos += 20;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public Image getImage(String path) {
        Image tempImage = null;

        try {
            URL imageUrl = ImageAnimationDemo.class.getResource(path);
            tempImage = Toolkit.getDefaultToolkit().getImage(imageUrl);
        } catch (Exception e) {
            System.out.println("Error while getting image" + e.getMessage());
        }

        return tempImage;
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageAnimationDemo imd = new ImageAnimationDemo();

        frame.add(imd);
        frame.setSize(900, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}