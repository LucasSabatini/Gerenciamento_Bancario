package BankManagementSystem;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main{

    protected static String accountPassConfirm;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String username;
        String accountPassword;
        char accountType;

        //Creating a new account
        do {
            System.out.println("Bem-vindo, vamos criar sua conta!\n");
            System.out.print("Digite seu Nome de Usuário: ");
            username = sc.nextLine();
            System.out.print("Digite sua Nova Senha: ");
            accountPassword = sc.nextLine();
            System.out.print("Digite novamente sua Senha: ");
            accountPassConfirm = sc.nextLine();
            if (Objects.equals(accountPassword, accountPassConfirm)) {
                System.out.println("Parabéns! Seu cadastro foi efetuado.\n");
            } else {
                System.out.println("As senhas digitadas devem ser iguais.");
            }
        }while(!Objects.equals(accountPassword, accountPassConfirm));
        accountType = AccountType.getAccountType(); //Meet and choose an account type
        AccountMenu acc1 = new AccountMenu(username, accountPassword, accountType);
        acc1.menu(); //Open account menu
    }
}