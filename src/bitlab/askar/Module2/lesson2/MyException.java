package bitlab.askar.Module2.lesson2;

public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "There is exception in login";
    }
}
