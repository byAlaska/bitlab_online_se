package bitlab.askar.Module2.lesson6.lab;

public class Car extends Thread {
    int speed;
    double distance;

    public Car(String name, int speed, double distance) {
        super(name);
        this.speed = speed;
        this.distance = distance;
    }

    public Car(ThreadGroup group, String name, int speed, double distance) {
        super(group, name);
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {

        try {

            int drivenDistance = 0;

            for (int i=0;i<distance/speed;i++){

                drivenDistance += speed;
                System.out.println(getName() + " is on :"+ drivenDistance);
                Thread.sleep(1000);
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
