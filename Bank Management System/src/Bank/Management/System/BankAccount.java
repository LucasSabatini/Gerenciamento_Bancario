package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class BankAccount{
    String username;
    String accountPassword;
    char accountType;
    double balance = 100;
    double[] prevTrans = new double[5];

    //Create Account
    public BankAccount(String username, String accountPassword, char accountType){
        this.username = username;
        this.accountPassword = accountPassword;
        this.accountType = accountType;
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

    //Extrato das últimas 5 transações

    //Realizar transferências

    //Mostrar informações da conta
    protected void accDetails(char accDet){
        if(accountType == 'a'){
            System.out.println("Você possui uma Conta Corrente:");
            System.out.println(" - Limitado a 24 saques por mês;");
            System.out.println(" - Limitado a realizar 4 transferências;");
            System.out.println(" - Tarifa de R$14,60 ao mês;\n");
        }
        else if (accountType == 'b') {
            System.out.println("Você possui uma Conta Poupança:");
            System.out.println(" - Limitado a 8 saques por mês;");
            System.out.println(" - Limitado a realizar 3 transferências;");
            System.out.println(" - Taxa de rendimento de 0,5% ao mês;\n");
        }
        else if (accountType == 'c'){
            System.out.println("Você possui uma Conta Universitária:");
            System.out.println(" - Limitado a 16 saques por mês;");
            System.out.println(" - Limitado a realizar 2 transferências;");
            System.out.println(" - Tarifa de R$4,55 ao mês;\n");
        }
    }

    //Mostrar limite de cheque especial

    //Juros de cheque especial

    //Account Menu
    protected void menu() throws IOException {
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
            System.out.println("g) - Finalizar operações.");
            option = sc.next().charAt(0);
            switch (option){
                case 'a':
                    showBalance();
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'b':
                    System.out.print("Digite o valor do saque: R$");
                    double amtW = sc.nextDouble();
                    dowithdraw(amtW);
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'c':
                    System.out.print("Digite o valor do depósito: R$");
                    double amtD = sc.nextDouble();
                    dodeposit(amtD);
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'd':
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'e':
                    System.out.println("Tecle Enter para retornar ao menu inicial...");
                    System.in.read();
                    break;
                case 'f':
                    accDetails(accountType);
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
