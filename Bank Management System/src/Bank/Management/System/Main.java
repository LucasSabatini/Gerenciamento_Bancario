package Bank.Management.System;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //Creating a new account
        System.out.println("Bem-vindo, vamos criar sua conta!\n");
        System.out.print("Digite seu Nome de Usuário: ");
        String username = sc.nextLine();
        System.out.print("Digite sua Nova Senha: ");
        String accountPassword = sc.nextLine();
        char accountType = TipoDeConta.getAccountType(); //Meet and choose an account type

        BankAccount acc1 = new BankAccount(username, accountPassword, accountType);
        acc1.menu(); //Open account menu

    }
}