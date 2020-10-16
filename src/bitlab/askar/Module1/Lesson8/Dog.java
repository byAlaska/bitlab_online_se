package bitlab.askar.Module1.Lesson8;

public class Dog {

    private int legs;
    private String nickName;
    private String paroda;
    private String password;


    static int count = 0;


    public Dog(){
    }


    public Dog(int legs, String nickName, String paroda){
        this.legs = legs;
        this.nickName = nickName;
        this.paroda = paroda;
    }


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public void run(){
        System.out.println(this.nickName + " is running ");
    }

    public static void increase(){
        count++;
    }


    public String toString() {
        return "Dog{" +
                "legs=" + legs +
                ", nickName='" + nickName + '\'' +
                ", paroda='" + paroda + '\'' +
                '}';
    }
}