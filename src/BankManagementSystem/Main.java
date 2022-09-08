package BankManagementSystem;

import static BankManagementSystem.WelcomeScreen.*;

public class Main{

    public static void main(String[] args) {
        WelcomeScreen.createAccount(); //Open account create menu
        AccountMenu.menu(); //Open account menu
    }
}