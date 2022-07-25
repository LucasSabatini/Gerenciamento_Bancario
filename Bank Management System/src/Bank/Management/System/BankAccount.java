package Bank.Management.System;

import java.util.Scanner;

public class BankAccount{
    String username;
    String accountPassword;
    double balance = 100;
    double[] prevTrans = new double[5];

    //Create Account
    public BankAccount(String username, String accountPassword){
        this.username = username;
        this.accountPassword = accountPassword;
    }


    //Show account balance
    protected void showBalance() {
        System.out.println("O seu saldo é: R$" + balance);
    }

    //Make a withdraw
    protected void dowithdraw(double amountWit){
        if (amountWit > 0 && balance >= amountWit){
            balance -= amountWit;
            System.out.println("Seu saque de R$" + amountWit + " foi realizado.");
        }
        else{
            System.out.println("Você não possui saldo suficiente para realizar este saque.");
        }
    }

    //Make a deposit
    protected void dodeposit(double amountDep){
        if(amountDep > 0){
            System.out.println("Seu depósito de R$" + amountDep + " foi realizado.");
            balance += amountDep;
            System.out.println("Seu novo saldo é de R$" + balance);
        }
        else{
            System.out.println("Digite um valor válido para o depósito.");
        }
    }

    //Realizar transferências

    //Tipo de conta (corrente, poupança, universitária...)

    //Mostrar informações da conta

    //Mostrar limite de cheque especial

    //Juros de cheque especial

    //Account Menu
    protected void menu(){
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.println("Seja bem-vindo " + username + " ao seu Banco Pessoal");
            System.out.println("------------------------");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("a) - Exibir saldo");
            System.out.println("b) - Fazer um saque");
            System.out.println("c) - Fazer um depósito");
            System.out.println("d) - Exibir últimas 5 transações");
            System.out.println("e) - Alterar limite de cheque especial");
            System.out.println("f) - Exibir detalhes da conta");
            System.out.println("g) - Alterar o tipo da conta");
            System.out.println("h) - Finalizar operações.");
            option = sc.next().charAt(0);
            switch (option){
                case 'a':
                    showBalance();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    sc.nextLine();
                    break;
                case 'b':
                    System.out.print("Digite o valor do saque: R$");
                    double amtW = sc.nextDouble();
                    dowithdraw(amtW);
                    break;
                case 'c':
                    System.out.print("Digite o valor do depósito: R$");
                    double amtD = sc.nextDouble();
                    dodeposit(amtD);
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Opção Inválida!\nDigite uma opção válida para continuar.");
            }
        }while(option != 'h');
    }
}
