package bitlab.askar.Module1.Lesson9;

public class Snake extends Animal{

    int poison;

    public Snake() {


    }

    public Snake(int age, String nickName, int weight, int poison) {
        super(age, nickName, weight);
        this.poison = poison;

    }

    @Override
    public String toString() {
        return "Snake{" +
                "poison=" + poison +
                super.toString();
    }

    @Override
    public void run() {
        System.out.println(nickName + " is running with poison: " + poison);
    }


    public void jump(){

    }
}
