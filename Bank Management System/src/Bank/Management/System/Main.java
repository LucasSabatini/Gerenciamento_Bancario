package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //Creating a new account
        System.out.println("Bem-vindo, vamos criar sua conta!");
        System.out.print("Nome de Usuário: ");
        String username = sc.nextLine();
        System.out.print("Senha: ");
        String accountPassword = sc.nextLine();

        //Choosing an account type
        char accountType;
        do {
            System.out.println("Escolha o tipo de sua conta: ");
            System.out.println("a) Conta Corrente");
            System.out.println("b) Conta Poupança");
            System.out.println("c) Conta Universitária");
            accountType = sc.next().charAt(0);
            switch (accountType) {
                case 'a':
                    System.out.println("Informações da Conta Corrente:");
                    System.out.println(" - Limitado a 24 saques por mês;");
                    System.out.println(" - Limitado a realizar 4 transferências;");
                    System.out.println(" - Tarifa de R$14,60 ao mês;\n");
                    System.out.println("Você deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) Não");
                    char confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("Parabéns! Você possui uma Conta Corrente.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                case 'b':
                    System.out.println("Informações da Conta Poupança:");
                    System.out.println(" - Limitado a 8 saques por mês;");
                    System.out.println(" - Limitado a realizar 3 transferências;");
                    System.out.println(" - Taxa de rendimento de 0,5% ao mês;\n");
                    System.out.println("Você deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) Não");
                    confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("Parabéns! Você possui uma Conta Poupança.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                case 'c':
                    System.out.println("Informações da Conta Universitária:");
                    System.out.println(" - Limitado a 16 saques por mês;");
                    System.out.println(" - Limitado a realizar 2 transferências;");
                    System.out.println(" - Tarifa de R$4,55 ao mês;\n");
                    System.out.println("Você deseja contratar este pacote?");
                    System.out.println("a) Sim\nb) Não");
                    confirmAcc = sc.next().charAt(0);
                    if(confirmAcc == 'a'){
                        System.out.println("Parabéns! Você possui uma Conta Universitária.\n");
                        System.out.println("Tecle Enter para abrir o menu de sua conta!");
                        System.in.read();
                    }
                    else {
                        accountType = 'e';
                    }
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
                }
            }while (accountType != 'a' && accountType != 'b' && accountType != 'c');

        BankAccount acc1 = new BankAccount(username, accountPassword, accountType);
        acc1.menu(); //Open account menu

    }
}