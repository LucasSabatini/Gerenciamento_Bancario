package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class AccountMenu {
    String username;
    String accountPassword;
    char accountType;

    //Create Account
    public AccountMenu(String username, String accountPassword, char accountType){
        this.username = username;
        this.accountPassword = accountPassword;
        this.accountType = accountType;
    }

    //Account Menu
    protected void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.println("Seja bem-vindo " + username + " ao seu Banco Pessoal");
            System.out.println("------------------------");
            System.out.println("Digite a letra relacionada ao serviço que deseja utilizar:");
            System.out.println("a) - Exibir saldo");
            System.out.println("b) - Fazer um saque");
            System.out.println("c) - Fazer um depósito");
            //System.out.println("d) - Exibir limite de cheque especial");
            System.out.println("d) - Exibir detalhes da conta");
            System.out.println("e) - Finalizar operações.");
            option = sc.next().charAt(0);
            switch (option){
                case 'a':
                    AccountBalance.showBalance();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'b':
                    System.out.print("Digite o valor do saque: R$");
                    AccountWithdraw.getWithdraw(sc.nextDouble());
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'c':
                    System.out.print("Digite o valor do depósito: R$");
                    AccountDeposit.getDeposit(sc.nextDouble());
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                /*case 'd':
                    AccountOverdraft.getOverDraft();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;*/
                case 'd':
                    AccountDetails.getAccDetails(accountType);
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'e':
                    System.out.println("Operações encerradas. Sessão finalizada.");
                    break;
                default:
                    System.out.println("Opção Inválida!\nDigite uma opção válida para continuar.");
                    break;
            }
        }while(option != 'e');
    }
}
