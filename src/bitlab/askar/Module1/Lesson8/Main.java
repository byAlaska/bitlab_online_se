package bitlab.askar.Module1.Lesson8;

public class Main {

    public static void main(String[] args){

        int a = 5;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        a = 6;

        System.out.println(a);
        System.out.println(b);






        //1o3i9ngsg930
        Dog dog = new Dog(4,"PUshok","Chihuahua");
        Dog dog2 = new Dog(dog.getLegs(),dog.getNickName(),dog.getParoda());


        dog.setNickName("REX");
        dog.setLegs(3);
        dog.setParoda("German");


        System.out.println(dog);
        System.out.println(dog2);



    }
}
