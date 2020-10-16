package bitlab.askar.Module1.Lesson9;

public class Animal extends Object{

    protected int age;
    String nickName;
    int weight;

    public Animal() {
    }

    public Animal(int age, String nickName, int weight) {
        this.age = age;
        this.nickName = nickName;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", nickName='" + nickName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void run(){
    }
}
