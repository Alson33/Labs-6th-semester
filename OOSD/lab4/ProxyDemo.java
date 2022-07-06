package OOSD.lab4;

interface Image {
    public void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file: "+fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("Loading file: "+fileName);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        image.display();
        System.out.println(' ');
        image.display();

        /**
         * Output:
         * 
         * ---------------
         * Loading file: test_image.jpg
         * Displaying file: test_image.jpg
         * 
         * Displaying file: test_image.jpg
         */
    }
}
