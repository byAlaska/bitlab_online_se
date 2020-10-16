package bitlab.askar.Module2.lesson6.prac;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){

        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");

        JLabel label = new JLabel("#");
        label.setLocation(100,150);
        label.setSize(30,30);
        add(label);

        JButton button = new JButton("FIRE");
        button.setLocation(100,100);
        button.setSize(100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    MyThread thread = new MyThread(label);
                    thread.start();
                }catch (Exception exception){
                    exception.printStackTrace();
                }

            }
        });

        add(button);
    }
}
