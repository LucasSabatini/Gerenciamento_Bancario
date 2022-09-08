package BankManagementSystem;

import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        WelcomeScreen.createAccount(); //Open account create menu
        AccountMenu.menu(); //Open account menu
    }
}