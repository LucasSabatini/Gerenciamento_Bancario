package Bank.Management.System;

import static Bank.Management.System.Balance.balance;

public class Withdraw {

    //Make a withdraw
    protected static void getWithdraw(double amountWit){
        if (amountWit > 0 && balance >= amountWit){
            balance -= amountWit;
            System.out.println("Seu saque de R$" + amountWit + " foi realizado.");
        }
        else{
            System.out.println("Você não possui saldo suficiente para realizar este saque.");
        }
    }

}
