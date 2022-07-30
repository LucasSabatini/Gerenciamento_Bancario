package Bank.Management.System;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Bank.Management.System.AccountBalance.*;
import static Bank.Management.System.AccountType.accountType;

public class AccountDeposit {

    //Make a deposit
    protected static void getDeposit(double amountDep) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); //Formatação usando duas casas após a vírgula

        if (amountDep > 0) {
            System.out.println("Deseja confirmar o depósito no valor de R$" + dc.format(amountDep));
            System.out.println("a) Sim\nb) Não");
            char confirmDpt = sc.next().charAt(0);
            if(confirmDpt == 'a') {
                if(accountType == 'b'){
                    System.out.println("Seu depósito de R$" + dc.format(amountDep) + " foi realizado");
                    balanceCU += amountDep;
                    System.out.println("Seu novo saldo é de R$" + dc.format(balanceCU));
                }
                else {
                    System.out.println("Seu depósito de R$" + dc.format(amountDep) + " foi realizado.");
                    balance += amountDep;
                    System.out.println("Seu novo saldo é de R$" + dc.format(balance));
                }
            }
        } else {
            System.out.println("Digite um valor válido para o depósito.");
        }
    }
}
