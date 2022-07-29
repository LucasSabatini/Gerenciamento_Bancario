package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class BankAccount{
    String username;
    String accountPassword;
    char accountType;

    double[] prevTrans = new double[5];

    //Create Account
    public BankAccount(String username, String accountPassword, char accountType){
        this.username = username;
        this.accountPassword = accountPassword;
        this.accountType = accountType;
    }

    //Realizar transferências

    //Mostrar limite de cheque especial

    //Juros de cheque especial

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
            System.out.println("d) - Exibir últimas 5 transações");
            System.out.println("e) - Alterar limite de cheque especial");
            System.out.println("f) - Exibir detalhes da conta");
            System.out.println("g) - Finalizar operações.");
            option = sc.next().charAt(0);
            switch (option){
                case 'a':
                    Balance.showBalance();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'b':
                    System.out.print("Digite o valor do saque: R$");
                    Withdraw.getWithdraw(sc.nextDouble());
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'c':
                    System.out.print("Digite o valor do depósito: R$");
                    Deposito.getDeposit(sc.nextDouble());
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'd':
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'e':
                    ChequeEspecial.getOverDraft();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'f':
                    AccountDetails.getAccDetails(accountType);
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'g':
                    System.out.println("Operações encerradas. Sessão finalizada.");
                    break;
                default:
                    System.out.println("Opção Inválida!\nDigite uma opção válida para continuar.");
                    break;
            }
        }while(option != 'g');
    }
}
