package bitlab.askar.Module1.Lesson8.Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Student []students = new Student[10];
        int cnt = 0;

        while (true){

            System.out.println("[1] TO ADD STUDENT");
            System.out.println("[2] TO LIST STUDENT");
            System.out.println("[0] TO EXIT");

            int choice = in.nextInt();

            if (choice==1){

                System.out.println("Input name");
                String name = in.next();
                System.out.println("Input surname");
                String surname = in.next();
                System.out.println("Input gpa");
                double gpa = in.nextDouble();

                Student student = new Student(cnt,name,surname,gpa);
                students[cnt] = student;
                cnt++;

            }else if (choice==2){

                for (int i=0;i<cnt;i++){
                    System.out.println(students[i].toString());
                }
            }else {
                break;
            }

        }

    }






    public static Student topStudent(Student []students){

        double maxxGpa = students[0].gpa;
        Student student = null;

        for (int i=0;i<students.length;i++){
            if (maxxGpa<students[i].gpa){
                student = students[i];
                maxxGpa = students[i].gpa;
            }
        }

        return student;

    }
}
