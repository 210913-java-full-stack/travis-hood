package services;

import DAOs.AccountDAO;
import DAOs.UserDAO;
import models.UserModel;
import utils.ConnectionManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class VerifiedUser extends UserDAO {


    public VerifiedUser(Connection conn) {
        super(conn);
    }

    public static void verifyLogin() throws SQLException {
        Connection conn = null;

        try {
            conn = ConnectionManager.getConnection();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        UserDAO u = new UserDAO(conn);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please verify your user name:\n");
        String userName = sc.next();

        System.out.println("\nPlease verify your password:\n");
        String userPassword = sc.next();

        UserModel LoginInfo = u.getUserLogin(userName, userPassword, conn);//get user's login from table for comparison

        if ((LoginInfo.getUserName().equals(userName)) && (LoginInfo.getUserPassword().equals(userPassword))) {
            AccountView.AccountScreen(userName);//pass userName through to AccountScreen method in AccountView Class
        }

    }

}
