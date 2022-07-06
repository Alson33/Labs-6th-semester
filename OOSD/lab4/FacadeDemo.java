package OOSD.lab4;

interface Shape {
    public void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" --------------");
        System.out.println("|              |");
        System.out.println(" --------------");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(" ---");
        System.out.println("|   |");
        System.out.println(" ---");
    }
}

class ShapeProducer {
    Shape square;
    Shape rectangle;

    public ShapeProducer() {
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeProducer sp = new ShapeProducer();

        sp.drawRectangle();
        sp.drawSquare();

        /*
         * Output: 
         *  --------------
         * |              |
         *  --------------
         *  ---
         * |   |
         *  ---
         */
    }
}
