package com.company;

public class BankAccount {
    double amount;
    public void deposit(double sum){
        amount+=sum;
        System.out.println("Вы пополнили счет "+ amount);
    }
    public void withDraw(int sum) throws LimitException {
        if (sum>amount){
            throw new LimitException("На вашем счету недостаточно средств. Ваш счет составляет: "+amount,amount);
        }else {
            amount-=sum;
            System.out.println("Вы Сняли: "+sum+"\nОстаток на счету: "+amount);
        }

    }

    public double getAmount() {
        return amount;
    }
}
