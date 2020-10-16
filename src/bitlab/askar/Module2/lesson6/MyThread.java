package bitlab.askar.Module2.lesson6;

public class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {

            for (int i=0;i<10;i++){

                synchronized (this) {
                    System.out.println("Hello there" + " , thread:" + getName());
                    Thread.sleep(1000);
                }
            }

            System.out.println("finished");


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
