package Multimedia.lab1;

import java.io.File;
import java.awt.event.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

class MusicPlayer implements ActionListener {
    Clip clip;
    long clipTimePosition;
    JButton play, pause, stop;

    public MusicPlayer(String audioPath) {
        try {
            File musicPath = new File(audioPath);

            if(musicPath.exists()){
                JFrame frame = new JFrame();

                play = new JButton("Play");
                pause = new JButton("Pause");
                stop = new JButton("Stop");

                play.setBounds(40,240,70,40);
                pause.setBounds(150,240,100,40);
                stop.setBounds(280,240,100,40);

                frame.add(play);
                frame.add(pause);
                frame.add(stop);

                frame.setSize(600, 400);
                frame.setLayout(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                play.addActionListener(this);
                pause.addActionListener(this);
                stop.addActionListener(this);
             
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                clip = AudioSystem.getClip();
                clip.open(audioInput);
            }else{
                System.out.println("Can't find the file !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playMusic() {
        if(clip.getMicrosecondPosition()>=clip.getMicrosecondLength()||clip.getMicrosecondPosition()==0){
            clip.setMicrosecondPosition(0);
        }else{
            clip.setMicrosecondPosition(clipTimePosition);
        }
        clip.start();
    }

    public void pauseMusic() {
        clipTimePosition = clip.getMicrosecondPosition();
        clip.stop();
    }

    public void stopMusic() {
        clipTimePosition = 0;
        clip.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            playMusic();
        }
        if(e.getSource()==pause){
            pauseMusic();
        }
        if(e.getSource()==stop){
            stopMusic();
        }
    }
}

public class AudioDemo {
    public static void main(String[] args) {
        String path = "D:/projects/college-related-projects/Labs-6th-semester/Multimedia/lab1/audio.wav";

        new MusicPlayer(path);
    }

    
}