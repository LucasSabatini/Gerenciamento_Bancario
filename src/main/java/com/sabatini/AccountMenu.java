package com.sabatini;

import static BankManagementSystem.Main.sc;
import static BankManagementSystem.WelcomeScreen.conta;

public class AccountMenu {

    //Account Menu
    public static void menu() {
        char option;

        do {
            System.out.println("---------------------------------------------------------");
            System.out.print(Textblocks.getMainMenu());
            option = sc.next().charAt(0);
            switch (option) {
                case 'a' -> {
                    AccountBalance.showBalance();
                }
                case 'b' -> {
                    System.out.print("\nDigite o valor do saque: R$");
                    AccountWithdraw.getWithdraw(sc.nextDouble());
                }
                case 'c' -> {
                    System.out.print("\nDigite o valor do depósito: R$");
                    AccountDeposit.getDeposit(sc.nextDouble());
                }
                /*case 'd'-> {
                    AccountOverdraft.getOverDraft();
                    }*/
                case 'd' -> {
                    AccountDetails.getAccDetails(conta.getAccountType());
                }
                case 'e' -> System.out.println("\nAté a próxima, " + conta.getUserName() + "!" + "\nOperações encerradas. Sessão finalizada.");
                default -> System.out.println("\nOpção Inválida!\nDigite uma opção válida para continuar.\n");
            }
        } while (option != 'e');
        if (option != 'e') {
            System.out.println("\nTecle Enter para retornar ao menu inicial...");
            sc.nextLine();
        }
    }
}