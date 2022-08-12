package BankManagementSystem;

import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {
        WelcomeScreen.createAccount(); //Open account create menu
        AccountMenu.menu(); //Open account menu
    }
}