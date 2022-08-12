package BankManagementSystem;

import TextBlocks.Textblocks;
import java.io.IOException;
import java.util.Scanner;

public class AccountMenu {
    private static String username;
    private static String accountPassword;
    private static String accountType;

    //Create Account
    public AccountMenu(String username, String accountPassword, String accountType){
        AccountMenu.username = username;
        AccountMenu.accountPassword = accountPassword;
        AccountMenu.accountType = accountType;
    }

    //Account Menu
    public static void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.println("---------------------------------------------------------");
            System.out.print(Textblocks.getMainMenu());
            option = sc.next().charAt(0);
            switch (option) {
                case 'a' -> {
                    AccountBalance.showBalance();
                    System.out.println("\nTecle Enter para retornar ao menu inicial...");
                    System.in.read();
                }
                case 'b' -> {
                    System.out.print("\nDigite o valor do saque: R$");
                    AccountWithdraw.getWithdraw(sc.nextDouble());
                    System.out.println("\nTecle Enter para retornar ao menu inicial...");
                    System.in.read();
                }
                case 'c' -> {
                    System.out.print("\nDigite o valor do depósito: R$");
                    AccountDeposit.getDeposit(sc.nextDouble());
                    System.out.println("\nTecle Enter para retornar ao menu inicial...");
                    System.in.read();
                }
                /*case 'd'-> {
                    AccountOverdraft.getOverDraft();
                    System.out.println("\nTecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    }*/
                case 'd' -> {
                    AccountDetails.getAccDetails(accountType);
                    System.out.println("\nTecle Enter para retornar ao menu inicial...");
                    System.in.read();
                }
                case 'e' -> System.out.println("\nOperações encerradas. Sessão finalizada.");
                default -> System.out.println("\nOpção Inválida!\nDigite uma opção válida para continuar.\n");
            }
        } while (option != 'e');
    }
}