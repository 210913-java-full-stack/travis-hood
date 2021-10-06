package services;


import DAOs.UserDAO;

import utils.ConnectionManager;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class NewUserLogin {



    public static void createNew() throws SQLException, IOException {

        Scanner userScan = new Scanner(System.in);
        System.out.println("Thanks for being a member of our bank. Enter user name:");
        String userName = userScan.next();

        if (userName.matches("[a-zA-Z0-9]{2,12}$")) {
            System.out.println("Please enter a password:");

        } else {
            System.out.println("That isn't within our parameters, try again");

            do {
                NewUserLogin.createNew();
            } while (userName.matches("[a-zA-Z0-9]{2,12}$") != true);
        }

        String userPassword = userScan.next();

        if(userPassword != null && userPassword.matches("[a-zA-Z0-9]{2,25}$")){

            UserDAO newUser = new UserDAO(ConnectionManager.getConnection());

            newUser.saveNewUser(userName, userPassword);
            VerifyCustomer.NameCollect(userName);
        }else {
            System.out.println("That isn't within our parameters, try again");
            do {
                NewUserLogin.createNew();
            } while (userPassword.matches("[a-zA-Z0-9]{2,12}$") != true);
        }
    }
}

