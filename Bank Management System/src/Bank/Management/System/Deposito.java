package Bank.Management.System;

import java.util.Scanner;

import static Bank.Management.System.Balance.balance;

public class Deposito {

    //Make a deposit
    protected static void getDeposit(double amountDep) {
        Scanner sc = new Scanner(System.in);

        if (amountDep > 0) {
            System.out.println("Deseja confirmar o depósito no valor de R$" + amountDep);
            System.out.println("a) Sim\nb) Não");
            char confirmDpt = sc.next().charAt(0);
            if(confirmDpt == 'a') {
                System.out.println("Seu depósito de R$" + amountDep + " foi realizado.");
                balance += amountDep;
                System.out.println("Seu novo saldo é de R$" + balance);
            }
        } else {
            System.out.println("Digite um valor válido para o depósito.");
        }
    }
}
