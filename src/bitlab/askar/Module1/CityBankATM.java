package bitlab.askar.Module1;

import bitlab.askar.Module1.project.BankAccount;
import bitlab.askar.Module1.project.CityBankAccount;
import bitlab.askar.Module1.Database;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String accountNumber = in.next();
        String pinCode = in.next();

        BankAccount account = null;

        for (int i = 0; i< Database.allAccounts.length; i++){
            if (Database.allAccounts[i].getAccountNumber().equals(accountNumber)
                    && Database.allAccounts[i].getPinCode().equals(pinCode)){


                account = Database.allAccounts[i];
                break;

            }
        }


        while (true){

            if (account instanceof CityBankAccount){

                System.out.println(" PRESS [1] TO CASH WITHDRAWAL  // снять деньги\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                        "\n" +
                        "               PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                        "\n" +
                        "               PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                        "\n" +
                        "               PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                        "\n" +
                        "               PRESS [6] TO EXIT // выход");


                int choice = in.nextInt();

                if (choice==1){
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                }else if (choice==2){
                    System.out.println(account.totalBalance());
                }else if (choice==3){
                    String newPincode = in.next();
                    account.setPinCode(newPincode);
                }else if(choice==4){
                    int debet = in.nextInt();
                    account.debetBalance(debet);
                }else if (choice==5){
                    System.out.println(account.accountData());
                }else{
                    break;
                }



            }else {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE\n" +
                        "\n" +
                        "               PRESS [3] TO EXIT");


                int choice = in.nextInt();

                if (choice==1){
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                }else if (choice==2){
                    System.out.println(account.totalBalance());
                }else {
                    break;
                }


            }
        }



    }
}
