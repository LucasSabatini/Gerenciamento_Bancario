package BankManagementSystem;

import static BankManagementSystem.WelcomeScreen.conta;
import static BankManagementSystem.Main.sc;

public abstract class AccountDetails {

    //Mostrar informações da conta
    public static void getAccDetails(char accDet){
        sc.nextLine();
        if(conta.getAccountType() == 'a'){
            String tipoCorrente = """
            
            Informações da Conta Corrente:
             - Limitado a 24 saques por mês
             - Limitado a realizar 4 transferências
             - Tarifa de R$14,60 ao mês""";
            System.out.println(tipoCorrente);
        }
        else if (conta.getAccountType() == 'b') {
            String tipoPoupanca = """
                      
            Informações da Conta Poupança:
             - Limitado a 8 saques por mês
             - Limitado a realizar 3 transferências
             - Taxa de rendimento de 0,5% ao mês""";
            System.out.println(tipoPoupanca);
        }
        else if (conta.getAccountType() == 'c'){
            String tipoUniversitaria = """
            
            Informações da Conta Universitária:
             - Limitado a 16 saques por mês
             - Limitado a realizar 2 transferências
             - Tarifa de R$4,55 ao mês""";
            System.out.println(tipoUniversitaria);
        }
        System.out.println("\nTecle Enter para retornar ao menu inicial...");
        sc.nextLine();
    }
}