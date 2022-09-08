package BankManagementSystem;

import java.text.DecimalFormat;
import static BankManagementSystem.AccountBalance.*;
import static BankManagementSystem.Accounts.getAccountType;
import static BankManagementSystem.WelcomeScreen.sc;

public abstract class AccountWithdraw {

    //Make a withdraw
    protected static void getWithdraw(double amountWit){
        DecimalFormat dc = new DecimalFormat("0.00"); //Formatação usando duas casas após a vírgula

        System.out.println("\nConfirmar saque de R$" + dc.format(amountWit));
        System.out.println("a) Sim\nb) Não");
        System.out.print("\nOpção desejada: ");
        char confirmWit = sc.next().charAt(0);
        sc.nextLine();

        if(confirmWit == 'a' && amountWit > 0 && balance >= amountWit && getAccountType() == 'a') {
            System.out.println("\nSeu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balance -= amountWit;
            System.out.println("Seu novo saldo é de R$" + dc.format(balance));
        }
        else if (confirmWit == 'a' && amountWit > 0 && balanceCU >= amountWit && getAccountType() == 'b') {
            System.out.println("\nSeu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balanceCU -= amountWit;
        }
        else if(confirmWit == 'a' && amountWit > 0 && balance >= amountWit && getAccountType() == 'c') {
            System.out.println("\nSeu saque de R$" + dc.format(amountWit) + " foi realizado.");
            balance -= amountWit;
            System.out.println("Seu novo saldo é de R$" + dc.format(balance));
        }
        else if(confirmWit == 'b'){
            System.out.println("\nSaque cancelado.");
        }
        else  if(amountWit <= 0){
            System.out.println("\nDigite um valor válido para sacar.");
        }
        else if(balance < amountWit || balanceCU <= amountWit){
            System.out.println("\nVocê não possui saldo suficiente para realizar este saque.");
        }
        System.out.println("\nTecle Enter para retornar ao menu inicial...");
        sc.nextLine();
    }
}