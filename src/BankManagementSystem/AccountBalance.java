package BankManagementSystem;

import java.text.DecimalFormat;
import static BankManagementSystem.Accounts.getAccountType;
import static BankManagementSystem.WelcomeScreen.sc;

public abstract class AccountBalance {

    protected static double balance;
    protected static double balanceCU;

    //Show account balance
    protected static void showBalance() {
        DecimalFormat dc = new DecimalFormat("0.00"); //Formatação usando duas casas após a vírgula
        sc.nextLine();
        if (getAccountType() == 'b') {
            System.out.println("\nSaldo: R$" + dc.format(balanceCU + (balanceCU * 0.05)));
            balanceCU += (balanceCU * 0.05);
            System.out.println("Taxa de rendimento de 0,5% ao mês.");
        }
        else {
            System.out.println("\nO seu saldo é: R$" + dc.format(balance));
        }
        System.out.println("\nTecle Enter para retornar ao menu inicial...");
        sc.nextLine();
    }
}