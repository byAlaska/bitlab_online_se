package bitlab.askar.Module1.lesson10;

public abstract class Shape {

    private int countOfAngle;


    public int getCountOfAngle() {
        return countOfAngle;
    }

    public void setCountOfAngle(int countOfAngle) {
        this.countOfAngle = countOfAngle;
    }

    public Shape(int countOfAngle) {
        this.countOfAngle = countOfAngle;
    }

    public abstract double getArea();


    public void jump(){

    }



}
