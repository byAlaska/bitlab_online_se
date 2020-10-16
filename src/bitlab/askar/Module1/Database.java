package bitlab.askar.Module1;

import bitlab.askar.Module1.project.NationalBankAccount;

public class Database {

    public static bitlab.askar.Module1.project.BankAccount allAccounts[] = new bitlab.askar.Module1.project.BankAccount[10];

    static{

        allAccounts[0] = new bitlab.askar.Module1.project.CityBankAccount("Ilyas","Zhuanyshev",20000, "KZ010322312","0102");

        allAccounts[1] = new bitlab.askar.Module1.project.CityBankAccount("Erbol","Assanbek",10000,"KZ010322313","0101");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",2000, "KZ0101112","0102");

        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов

    }
}
