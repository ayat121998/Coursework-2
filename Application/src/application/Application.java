/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Scanner;
//import java.lang.String;

/**
 *
 * @author Administrator
 */
public class Application {

    static BankAccount bankAccount;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the  Bank.");
        System.out.println("Please select a number from the menu.");

        while (true) {

            int option = 0;

            while (option != 4) {
                System.out.println("1. Create Bank Account");
                System.out.println("2. Create User");
                System.out.println("3. Run Simulation");
                System.out.println("4. Exit");

                Scanner s = new Scanner(System.in);
                option = s.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("You have selected to Create Bank Account.");
                        long accountNo = 9876543210l;
                        int accountBalance = 1980;
                        bankAccount = new BankAccount(accountNo, accountBalance);
                        System.out.println("Your account has been created.");
                        System.out.println("Your account number is " + accountNo + "Your account balance is " + accountBalance + "");
                        System.out.println("Do you want to use the default users (y/n)?");
                        String answer = s.next();
                        if (answer.equals("y")) {
                            System.out.println("1.Saul Goodman");
                            System.out.println("2.Walter White");
                            System.out.println("3.Jessie Pinkman");
                            System.out.println("4.Hank Schrader");

                            User Saul = new User("Saul", "Goodman", bankAccount);
                            double[] transactionSaul = {50, 10, -20, 10, -20, 20, 10, 50, -10, 10, -10, 50};
                            for (int i = 0; i < transactionSaul.length; i++) {
                                Saul.addTransaction(transactionSaul[i]);
                            }

                            User Walter = new User("Walter", "White", bankAccount);
                            double[] transactionWalter = {20, 20, -20, 50, -20, 10, 50, 50, -20, 10, 10};
                            for (int i = 0; i < transactionWalter.length; i++) {
                                Walter.addTransaction(transactionWalter[i]);
                            }
                            User Jessie = new User("Jessie", "Pinkman", bankAccount);
                            double[] transactionJessie = {50, 10, 10, -10, -10, 50, 20, -10, -20};
                            for (int i = 0; i < transactionJessie.length; i++) {
                                Jessie.addTransaction(transactionJessie[i]);
                            }
                            User Hank = new User("Hank", "Schrader", bankAccount);
                            double[] transactionHank = {50, 10, -20, 20, 10, -20};
                            for (int i = 0; i < transactionHank.length; i++) {
                                Hank.addTransaction(transactionHank[i]);
                            }
                            continue;
                        } else {
                            System.out.println("What would you like to name the user?");
                        }
                        String name = s.next();
                        System.out.println("Welcome to the Bank, " + name + "!");
                        System.out.println("Please enter your last name");
                        String surname = s.next();
                        System.out.println("Thank you for banking with us, " + name + " " + surname + "!");

                        break;
                    case 2:
                        System.out.println("You have selected Create User.");
                        System.out.println("Please enter the first name of the user");
                        name = s.next();
                        System.out.println("Please enter the last name of the user");
                        surname = s.next();
                        break;
                    case 3:
                        System.out.println("You have selected Run Simulation");
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("You have selected to exit from the program.");
                        System.out.println();
                        System.out.println("Thank you for banking with us!");
                        System.exit(0);

                        break;
                }
            }
        }
    }

}
