package OOSD.lab4;

interface Media {
    public void play(String type, String filename);
}

interface AdvanceMedia {
    public void mp4(String filename);
    public void mp3(String filename);
}

class MediaAdapter implements Media {
    AudioPlayer audioPlayer;
    
    public MediaAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void play(String type, String filename) {
        if(type=="mp3"){
            audioPlayer.mp3(filename);
        }else if(type=="mp4"){
            audioPlayer.mp4(filename);
        }else{
            System.out.println("Playing file: {"+filename+"} || type: ["+type+"]");        
        }
    }
}

class AudioPlayer implements AdvanceMedia {
    @Override
    public void mp3(String filename) {
        System.out.println("Playing file: {"+filename+"} || type: [mp3]");
    }

    @Override
    public void mp4(String filename) {
        System.out.println("Playing file: {"+filename+"} || type: [mp4]");
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        Media mediaAdaptor = new MediaAdapter(audioPlayer);

        mediaAdaptor.play("mp3", "I Like me better.mp3");
        mediaAdaptor.play("vlc", "Girls like you.vlc");
        mediaAdaptor.play("mp4", "Light switch.mp4");

        /**
         * Output:
         * -------------------
         * Playing file: {I Like me better.mp3} || type: [mp3]
         * Playing file: {Girls like you.vlc} || type: [vlc]
         * Playing file: {Light switch.mp4} || type: [mp4]
         */
    }
}
