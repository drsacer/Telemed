package com.telemed;

import java.util.Scanner;

public class TelemedMain {
    static TelemedMemDB telemedDB = new TelemedMemDB();


    static String mainMenu = "Main menu:\n" +
            "1 - Signup/registration\n" +
            "2 - Login\n" +
            "0 - Exit";

    static String loggedInMenu = "Logged in menu:\n" +
            "1 - Add new record\n" +
            "2 - List all records\n" +
            "3 - Logout\n";

    static String adminMenu = "Admin menu:\n" +
            "1 - List all users\n" +
            "2 - Remove user\n" +
            "3 - See records for user\n";



    public static void main (String [] args ) {
        System.out.println("Hello to Telemed system!\n");

        Scanner scanner = new Scanner(System.in);
        User currUser = null;
        int choice = -1;
        do {
            if(currUser == null) {
                // maim menu
                System.out.println(mainMenu);
                choice = scanner.nextInt();
                if (choice == 1) { // signup
                    User u = new User();
                    System.out.println("Enter username:");
                    u.setUsername(scanner.next());
                    System.out.println("Enter password:");
                    u.setPassword(scanner.next());

                    telemedDB.registerNewUser(u);

                    currUser = u;
                } else if (choice == 2) { // login

                    System.out.println("Enter username:");
                    String username = scanner.next();
                    System.out.println("Enter password:");
                    String password = scanner.next();

                    User u = telemedDB.findUser(username, password);
                    if(u == null) {
                        System.out.println("User not found. Please check your username or password.");
                    }

                    currUser = u;

                }
            } else if(currUser.isAdminUser() == false) {
                // display logged in user menu

            } else if(currUser.isAdminUser() == true) {
                // display admin menu
            }
        } while (choice != 0);

    }
}
