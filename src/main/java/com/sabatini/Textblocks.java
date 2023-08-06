package com.sabatini;

import static BankManagementSystem.WelcomeScreen.conta;

// Textblocks para reduzir o número de prints no código. O caractere '\s' adiciona um espaço em branco

public abstract class Textblocks {
    private static final String tiposDeConta = """
            
            Informações da Conta Corrente:
             - Limitado a 24 saques por mês
             - Limitado a realizar 4 transferências
             - Tarifa de R$14,60 ao mês
    
             Informações da Conta Poupança:
             - Limitado a 8 saques por mês
             - Limitado a realizar 3 transferências
             - Taxa de rendimento de 0,5% ao mês
             
            Informações da Conta Universitária:
             - Limitado a 16 saques por mês
             - Limitado a realizar 2 transferências
             - Tarifa de R$4,55 ao mês
             """;

    private static final String opcaoDeConta = """
    
    Digite a letra associada ao tipo de conta que você deseja contratar:
    a) Conta Corrente
    b) Conta Poupança
    c) Conta Universitária
    
    Opção desejada:\s""";

    private static final String mainMenu = """
            , seja bem-vindo ao seu Banco Pessoal!
                        
            Digite a letra relacionada ao serviço que deseja utilizar:
            a) - Exibir saldo
            b) - Fazer um saque
            c) - Fazer um depósito
            d) - Exibir detalhes da conta
            e) - Finalizar operações
            
            Opção desejada:\s""";

    private static final String welcomeText = """
                    
                    ------------------------------------------------
                                   Seja bem-vindo!
                            *** Vamos criar sua conta! ***
                    ------------------------------------------------
                Digite seu Nome de Usuário:\s""";

    public static String getTiposDeConta() {
        return tiposDeConta;
    }

    public static String getOpcaoDeConta() {
        return opcaoDeConta;
    }

    public static String getMainMenu() {
        return conta.getUserName() + mainMenu;
    }

    public static String getWelcomeText() {
        return welcomeText;
    }
}
