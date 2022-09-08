package BankManagementSystem;

public class Accounts {
    //Choosing an account type
    private static String userName;
    private static String accountPassword;
    private static char accountType;

    //Create Account
    public Accounts(String userName, String accountPassword, char accountType) {
        setUserName(userName);
        setAccountPassword(accountPassword);
        setAccountType(accountType);
    }

    public static char printAccountType() {
        switch (accountType){
            case 'a' -> System.out.println("Conta Corrente!");
            case 'b' -> System.out.println("Conta Poupança!");
            case 'c' -> System.out.println("Conta Universitária!");
            default -> System.out.println("Opção inválida!");
        }
        return accountType;
    }

    public static char getAccountType() {
        return accountType;
    }

    public static String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        Accounts.userName = userName;
    }

    public static String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        Accounts.accountPassword = accountPassword;
    }

    public static void setAccountType(char accountType) {
        Accounts.accountType = accountType;
    }
}
