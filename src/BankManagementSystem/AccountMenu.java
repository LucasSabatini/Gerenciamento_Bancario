package BankManagementSystem;

import TextBlocks.Textblocks;

import static BankManagementSystem.WelcomeScreen.sc;

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
                    AccountDetails.getAccDetails(Accounts.getAccountType());
                }
                case 'e' -> System.out.println("\nOperações encerradas. Sessão finalizada.");
                default -> System.out.println("\nOpção Inválida!\nDigite uma opção válida para continuar.\n");
            }
        } while (option != 'e');
        if (option != 'e') {
            System.out.println("\nTecle Enter para retornar ao menu inicial...");
            sc.nextLine();
        }
    }
}