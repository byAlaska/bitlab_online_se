package bitlab.askar.Module1.Lesson9;

public class Main {
    public static void main(String[] args){

        Cat cat = new Cat();
        cat.nickName = "Pushok";



        Animal []animals = new Animal[9];
        animals[0] = new Snake(20,"Lilia",50,40);
        animals[0] = new Snake(20,"asdg",50,40);
        animals[0] = new Snake(10,"Lilia",50,40);
        animals[1] = cat;
        animals[2] = new Animal(30,"Bublik",100);


        for (int i=0;i<3;i++){
            animals[i].run();
        }

    }

}
