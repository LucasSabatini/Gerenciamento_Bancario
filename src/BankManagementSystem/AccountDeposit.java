package BankManagementSystem;

import java.text.DecimalFormat;
import static BankManagementSystem.AccountBalance.*;
import static BankManagementSystem.Accounts.getAccountType;
import static BankManagementSystem.WelcomeScreen.sc;

public abstract class AccountDeposit {

    //Make a deposit
    protected static void getDeposit(double amountDep) {
        DecimalFormat dc = new DecimalFormat("0.00"); //Formatação usando duas casas após a vírgula

        if (amountDep > 0) {
            System.out.println("\nDeseja confirmar o depósito no valor de R$" + dc.format(amountDep));
            System.out.println("a) Sim\nb) Não");
            System.out.print("\nOpção desejada: ");
            char confirmDpt = sc.next().charAt(0);
            sc.nextLine();
            if(confirmDpt == 'a') {
                if(getAccountType() == 'b'){
                    System.out.println("\nSeu depósito de R$" + dc.format(amountDep) + " foi realizado");
                    balanceCU += amountDep;
                    System.out.println("Seu novo saldo é de R$" + dc.format(balanceCU));
                }
                else {
                    System.out.println("\nSeu depósito de R$" + dc.format(amountDep) + " foi realizado.");
                    balance += amountDep;
                    System.out.println("Seu novo saldo é de R$" + dc.format(balance));
                }
            }
        }
        else {
            System.out.println("\nDigite um valor válido para o depósito.");
        }
        System.out.println("\nTecle Enter para retornar ao menu inicial...");
        sc.nextLine();
    }
}