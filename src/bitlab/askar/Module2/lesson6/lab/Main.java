package bitlab.askar.Module2.lesson6.lab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){


        ArrayList<Car> cars = new ArrayList<>();
        ThreadGroup threadGroup = new ThreadGroup("group");
        Car car1 = new Car(threadGroup,"Ferrari",100,1000);
        Car car2 = new Car(threadGroup,"Renaul",80,1000);
        Car car3 = new Car(threadGroup,"BMW",75,1000);
        Car car4 = new Car(threadGroup,"Mercedes",90,1000);
        Car car5 = new Car(threadGroup,"Kia",120,1000);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);


        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();


        ArrayList<Car> result = new ArrayList<>();

        int activeCount = threadGroup.activeCount();
        while (threadGroup.activeCount()>0){
            if (activeCount>threadGroup.activeCount()){
                activeCount--;

                for (Car c:cars){
                    if (!c.isAlive()){
                        result.add(c);
                        cars.remove(c);
                        break;
                    }
                }

            }
        }


        for (int i=0;i<result.size();i++){
            System.out.println(i+1 + ". " + result.get(i).getName());
        }

    }
}
