package Bank.Management.System;

import static Bank.Management.System.TipoDeConta.accountType;

public class ChequeEspecial{

    protected static double overDraft;

    static double getOverDraft(){
        switch (accountType) {
            case 'a':
                System.out.println("O limite de cheque especial para esse tipo de conta: R$1000,00");
                break;
            case 'b':
                System.out.println("Esse tipo de conta não possui cheque especial.");
                break;
            case 'c':
                System.out.println("O limite de cheque especial para esse tipo de conta: R$800,00");
                break;
            default:
                break;
        }
        return overDraft;
    }

}
