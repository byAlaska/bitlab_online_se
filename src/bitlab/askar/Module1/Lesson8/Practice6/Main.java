package bitlab.askar.Module1.Lesson8.Practice6;

public class Main {
    public static void main(String[] args){


        BankApplication bankApplication = new BankApplication("Kaspi","Almaty");

        Worker worker = new Worker(1,"Name","Surname","Almaty",40000);
        bankApplication.addWorker(worker);
        bankApplication.addWorker(new Worker(2,"qwetrty","asdf","Astana",50000));


        bankApplication.listWorker();

    }
}
