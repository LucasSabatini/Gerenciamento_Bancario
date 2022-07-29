package Bank.Management.System;

public class Balance {

    protected static double balance;

    //Show account balance
    protected static void showBalance() {
        System.out.println("O seu saldo é: R$" + balance);
    }
}
