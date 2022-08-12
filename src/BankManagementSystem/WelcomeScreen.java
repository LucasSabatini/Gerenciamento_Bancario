package BankManagementSystem;

import java.util.Objects;
import java.util.Scanner;

public abstract class WelcomeScreen {
    static Scanner sc = new Scanner(System.in);
    private static String userName;
    private static String accountPassword;
    private static String accountPassConfirm;

    public static String getWelcome() {
        // Textblock para reduzir o número de prints no código. O caractere '\s' adiciona um espaço em branco
        return """
                    
                    ------------------------------------------------
                                   Seja bem-vindo!
                            *** Vamos criar sua conta! ***
                    ------------------------------------------------
                Digite seu Nome de Usuário:\s""";
    }

    public static void createAccount() {
        //Creating a new account
        do {
            System.out.print(WelcomeScreen.getWelcome());
            userName = sc.nextLine();
            System.out.print("Digite sua Nova Senha: ");
            accountPassword = sc.nextLine();
            System.out.print("Digite novamente sua Senha: ");
            accountPassConfirm = sc.nextLine();
            if (Objects.equals(accountPassword, accountPassConfirm)) {
                System.out.println("\nParabéns! Seu cadastro foi efetuado.");
            } else {
                System.out.println("\nAs senhas digitadas devem ser iguais.");
            }
        }while(!Objects.equals(accountPassword, accountPassConfirm));
        AccountType.AccType(); //Meet and choose an account type
        AccountMenu account = new AccountMenu(userName, accountPassword, AccountType.getAccountType());
    }

    public static String getUserName() {
        return userName;
    }
}
