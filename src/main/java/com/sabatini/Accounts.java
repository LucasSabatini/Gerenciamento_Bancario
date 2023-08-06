package com.sabatini;

public class Accounts {
    //Choosing an account type
    private String userName;
    private String accountPassword;
    private char accountType;

    //Create Account
    public Accounts(){

    }

    public Accounts(String userName, String accountPassword, char accountType) {
        setUserName(userName);
        setAccountPassword(accountPassword);
        setAccountType(accountType);
    }

    public char printAccountType() {
        switch (accountType){
            case 'a' -> System.out.println("Conta Corrente!");
            case 'b' -> System.out.println("Conta Poupança!");
            case 'c' -> System.out.println("Conta Universitária!");
            default -> System.out.println("Opção inválida!");
        }
        return accountType;
    }

    public char getAccountType() {
        return accountType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }
}
