package bitlab.askar.Module2.lesson6.prac;

import javax.swing.*;

public class MyThread extends  Thread{
    JLabel label;

    public MyThread(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        try {
            int x = 100;
            for (int i=0;i<300;i++){
                label.setLocation(x+=1,150);
                Thread.sleep(20);
                System.out.println("going on:" + label.getLocation());
            }

            label.setLocation(100,150);
            System.out.println("going on:" + label.getLocation());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
