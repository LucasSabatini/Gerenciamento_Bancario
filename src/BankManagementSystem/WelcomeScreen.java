package BankManagementSystem;

import java.util.Objects;

public abstract class WelcomeScreen{
    static String tempUserName;
    static String tempAccountPassword;
    static String tempAccountPassConfirm;

    public static Accounts conta = new Accounts();

    public static void createAccount() {
        //Creating a new account
        do {
            System.out.print(Textblocks.getWelcomeText());
            tempUserName = Main.sc.nextLine();
            System.out.print("Digite sua Nova Senha: ");
            tempAccountPassword = Main.sc.nextLine();
            System.out.print("Digite novamente sua Senha: ");
            tempAccountPassConfirm = Main.sc.nextLine();
            if (Objects.equals(tempAccountPassword, tempAccountPassConfirm)) {
                System.out.println("\nParabéns! Seu cadastro foi efetuado.");
            } else {
                System.out.println("\nAs senhas digitadas devem ser iguais.");
            }
        }while(!Objects.equals(tempAccountPassword, tempAccountPassConfirm));
        conta = new Accounts(tempUserName, tempAccountPassword, accType()); //Meet and choose an account type
    }


    public static char accType() {
        do {
            System.out.println("\nConfira os tipos de conta disponíveis abaixo e escolha a sua!");
            System.out.print(Textblocks.getTiposDeConta());
            System.out.print(Textblocks.getOpcaoDeConta());
            conta.setAccountType(Main.sc.next().charAt(0));
            if (conta.getAccountType() == 'a' || conta.getAccountType() == 'b' || conta.getAccountType() == 'c') {
                System.out.println("\nVocê deseja contratar este pacote?");
                System.out.println("a) Sim\nb) Não");
                System.out.print("\nOpção desejada: ");
                char confirmAcc = Main.sc.next().charAt(0);
                Main.sc.nextLine();
                if (Objects.equals(confirmAcc, 'a')) {
                    System.out.println("\n---------------------------------------------------------");
                    System.out.print("   Parabéns! Você contratou uma ");
                }
                else if (Objects.equals(confirmAcc,'b')){
                    System.out.println("\nCancelando...");
                    conta.setAccountType('e');
                }
                else {
                    System.out.println("\nOpção inválida!");
                    conta.setAccountType('e');
                }
            }
            else {
                System.out.println("\nOpção inválida!");
            }
        }while (!Objects.equals(conta.getAccountType(), 'a') && !Objects.equals(conta.getAccountType(), 'b') && !Objects.equals(conta.getAccountType(), 'c'));
        return conta.printAccountType();
    }
}