package com.bankAcc;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("==========================================================================================");;
            System.out.println("Deposited: Rs." + amount);
            System.out.println("==========================================================================================");;
        } else {
        	System.out.println("Invalid Amount Deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("==========================================================================================");;
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("==========================================================================================");;
        } else {
            System.out.println("Balance Insufficient..!");
        }
    }

    public void showBalance() {
    	System.out.println("==========================================================================================");;
        System.out.println("Balance: Rs." + balance);
        System.out.println("==========================================================================================");;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = S.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = S.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = S.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = S.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    S.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

