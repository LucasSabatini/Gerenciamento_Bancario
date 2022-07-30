package Bank.Management.System;

import static Bank.Management.System.AccountType.accountType;

public class AccountDetails {

    //Mostrar informações da conta
    protected static void getAccDetails(char accDet){
        if(accountType == 'a'){
            System.out.println("Você possui uma Conta Corrente:");
            System.out.println(" - Limitado a 24 saques por mês;");
            System.out.println(" - Limitado a realizar 4 transferências;");
            //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$1000,00");
            System.out.println(" - Tarifa de R$14,60 ao mês;\n");
        }
        else if (accountType == 'b') {
            System.out.println("Você possui uma Conta Poupança:");
            System.out.println(" - Limitado a 8 saques por mês;");
            System.out.println(" - Limitado a realizar 3 transferências;");
            //System.out.println(" - Esse tipo de conta não possui cheque especial.");
            System.out.println(" - Taxa de rendimento de 0,5% ao mês;\n");
        }
        else if (accountType == 'c'){
            System.out.println("Você possui uma Conta Universitária:");
            System.out.println(" - Limitado a 16 saques por mês;");
            System.out.println(" - Limitado a realizar 2 transferências;");
            //System.out.println(" - O limite de cheque especial para esse tipo de conta: R$800,00");
            System.out.println(" - Tarifa de R$4,55 ao mês;\n");
        }
    }
}
