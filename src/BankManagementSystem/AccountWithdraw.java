package BankManagementSystem;

import java.text.DecimalFormat;
import java.util.Scanner;

import static BankManagementSystem.AccountBalance.*;
import static BankManagementSystem.AccountType.accountType;

public class AccountWithdraw {

    //Make a withdraw
    protected static void getWithdraw(double amountWit){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); //Formatação usando duas casas após a vírgula

        System.out.println("Confirmar saque de R$" + dc.format(amountWit));
        System.out.println("a) Sim\nb) Não");
        char confirmWit = sc.next().charAt(0);
        System.out.println("\n");
        if(confirmWit == 'a' && amountWit > 0 && balance >= amountWit && accountType != 'b') {
            System.out.println("Seu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balance -= amountWit;
            System.out.println("Seu novo saldo é de R$" + dc.format(balance));
        }
        else if (confirmWit == 'a' && amountWit > 0 && balanceCU >= amountWit && accountType == 'b') {
            System.out.println("Seu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balanceCU -= amountWit;
        }
        else if(confirmWit == 'b'){
            System.out.println("Saque cancelado.");
        }
        else  if(amountWit <= 0){
            System.out.println("Digite um valor válido para sacar.");
        }
        else if(balance < amountWit || balanceCU <= amountWit){
            System.out.println("Você não possui saldo suficiente para realizar este saque.");
        }
    }
}