package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);

        } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                break;
            }
    }
    }
}
