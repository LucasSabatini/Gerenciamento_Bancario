package Bank.Management.System;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu Nome de Usuário e a sua Senha");
        System.out.print("Nome de Usuário: ");
        String username = sc.nextLine();
        System.out.print("Senha: ");
        String accountPassword = sc.nextLine();
        BankAccount acc1 = new BankAccount(username, accountPassword);
        acc1.menu();

    }
}