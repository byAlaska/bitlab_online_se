package bitlab.askar.Module1.lesson10;

public class Main {
    public static void main(String[] args){

        Square square = new Square(5);

        Circle circle = new Circle(5);


        Shape [] shapes = {
                square,circle
        };



        for (int i=0;i<2;i++){
            System.out.println(shapes[i].getArea());
        }




    }

    public static  void run(Shape shape){

    }
}
