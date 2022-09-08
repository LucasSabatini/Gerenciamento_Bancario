package BankManagementSystem;

import TextBlocks.Textblocks;

import java.util.Objects;
import java.util.Scanner;

public abstract class WelcomeScreen {
    static Scanner sc = new Scanner(System.in);

    static String tempUserName;
    static String tempAccountPassword;
    static String tempAccountPassConfirm;

    public static void createAccount() {
        //Creating a new account
        do {
            System.out.print(Textblocks.getWelcomeText());
            tempUserName = sc.nextLine();
            System.out.print("Digite sua Nova Senha: ");
            tempAccountPassword = sc.nextLine();
            System.out.print("Digite novamente sua Senha: ");
            tempAccountPassConfirm = sc.nextLine();
            if (Objects.equals(tempAccountPassword, tempAccountPassConfirm)) {
                System.out.println("\nParabéns! Seu cadastro foi efetuado.");
            } else {
                System.out.println("\nAs senhas digitadas devem ser iguais.");
            }
        }while(!Objects.equals(tempAccountPassword, tempAccountPassConfirm));
        Accounts conta = new Accounts(tempUserName, tempAccountPassword, accType()); //Meet and choose an account type
    }

    public static char accType() {
        do {
            System.out.println("\nConfira os tipos de conta disponíveis abaixo e escolha a sua!");
            System.out.print(Textblocks.getTiposDeConta());
            System.out.print(Textblocks.getOpcaoDeConta());
            Accounts.setAccountType(sc.next().charAt(0));
            if (Accounts.getAccountType() == 'a' || Accounts.getAccountType() == 'b' || Accounts.getAccountType() == 'c') {
                System.out.println("\nVocê deseja contratar este pacote?");
                System.out.println("a) Sim\nb) Não");
                System.out.print("\nOpção desejada: ");
                char confirmAcc = sc.next().charAt(0);
                sc.nextLine();
                if (Objects.equals(confirmAcc, 'a')) {
                    System.out.println("\n---------------------------------------------------------");
                    System.out.print("   Parabéns! Você contratou uma ");
                }
                else if (Objects.equals(confirmAcc,'b')){
                    System.out.println("\nCancelando...");
                    Accounts.setAccountType('e');
                }
                else {
                    System.out.println("\nOpção inválida!");
                    Accounts.setAccountType('e');
                }
            }
            else {
                System.out.println("\nOpção inválida!");
            }
        }while (!Objects.equals(Accounts.getAccountType(), 'a') && !Objects.equals(Accounts.getAccountType(), 'b') && !Objects.equals(Accounts.getAccountType(), 'c'));
        return Accounts.printAccountType();
    }
}