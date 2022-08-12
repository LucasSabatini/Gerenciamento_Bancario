package BankManagementSystem;

import TextBlocks.Textblocks;
import java.util.Objects;
import java.util.Scanner;

import static BankManagementSystem.AccountDetails.*;

public abstract class AccountType {

    //Choosing an account type
    static String accountType;

    //Constructor
    static void AccType() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nConfira os tipos de conta disponíveis abaixo e escolha a sua!");
            System.out.print(Textblocks.getTiposDeConta());
            System.out.print(Textblocks.getOpcaoDeConta());
            accountType = sc.nextLine();
            if (accountType.equals("a") || accountType.equals("b") || accountType.equals("c")) {
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
                    accountType = "e";
                }
                else {
                    System.out.println("\nOpção inválida!");
                    accountType = "e";
                }
            }
            else {
                System.out.println("\nOpção inválida!");
            }
        }while (!Objects.equals(accountType, "a") && !Objects.equals(accountType, "b") && !Objects.equals(accountType, "c"));

    }

    public static String getAccountType() {
        switch (accountType){
            case "a" -> System.out.println("Conta Corrente!");
            case "b" -> System.out.println("Conta Poupança!");
            case "c" -> System.out.println("Conta Universitária!");
            default -> System.out.println("Opção inválida!");
        }
        return accountType;
    }
}