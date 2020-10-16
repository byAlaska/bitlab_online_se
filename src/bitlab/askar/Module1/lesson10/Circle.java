package bitlab.askar.Module1.lesson10;

public class Circle extends Shape {


    double radius;


    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*3.14*radius;
    }
}
