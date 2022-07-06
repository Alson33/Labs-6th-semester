package OOSD.lab4;

interface DrawApi {
    public void drawCircle(int radius);
}

class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Draw Red circle: Radius - ["+radius+"]");
    }
}

class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Draw Green Circle: Radius - ["+radius+"]");
    }
}

abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius);
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Shape red = new Circle(10, new RedCircle());
        Shape green = new Circle(10, new GreenCircle());

        green.draw();
        red.draw();

        /*
         * Output:
         * 
         * -------------
         * Draw Green Circle: Radius - [10]
         * Draw Red circle: Radius - [10]
         */
    }
}
