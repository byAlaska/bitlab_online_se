package bitlab.askar.Module1.Lesson8.Practice6;

public class BankApplication {

    private String name;
    private String country;
    private Worker []workers = new Worker[100];
    public static int sizeOfWorkers;

    public BankApplication() {
    }

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addWorker(Worker worker){
        workers[sizeOfWorkers] = worker;
        sizeOfWorkers++;
    }

    public void listWorker(){
        for (int i=0;i<sizeOfWorkers;i++){
            System.out.println(workers[i]);
        }
    }
}
