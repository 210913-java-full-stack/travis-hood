package services;

import DAOs.AccountDAO;
import DAOs.CustomerDAO;
import models.AccountModel;
import utils.ConnectionManager;
import utils.datastructures.MyArrayList;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountView {
    public static void AccountScreen(String userName) throws SQLException {
        Connection conn = null;

        try {
            conn = ConnectionManager.getConnection();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        AccountDAO accountID = new AccountDAO(conn);
        accountID.getAcctID(userName);


        System.out.println("================" +
                "\nWelcome, please select from one of the following options:" +
                "\n================" +
                "\n1) View Account Balance" +
                "\n2) Deposit Money" +
                "\n3) Withdraw Money" +
                "\n4) Add/create an Cash Account" +
                "\n5) Quit" +
                "\n================\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch(input){
            case "1":
                Scanner input2 = new Scanner(System.in);
                accountID.getAcctID(userName);
                System.out.println("Which account balance would you like to see?");

                double choice = input2.nextDouble();
                System.out.println("$"+ accountID.getAccountBalanceByAcctID(choice));
                break;
            case "2":
                Scanner input3 = new Scanner(System.in);
                System.out.println("Which account would you like to deposit to?");
                accountID.getAcctID(userName);

                double choice2 = input3.nextDouble();
               System.out.println("How much money would you like to deposit?");
               Scanner input4 = new Scanner(System.in);
                double depositChoice = input4.nextDouble();

                if (depositChoice < 0 ){
                    System.out.println("That's a negative number, we don't do that here");
                } else {
                    accountID.saveDeposit(depositChoice, choice2);
                }
                break;
            case "3":
                Scanner input5 = new Scanner(System.in);

                System.out.println("Which account would you like to withdraw from?");
                accountID.getAcctID(userName);
                double choice3 = input5.nextDouble();

                System.out.println("How much money would you like to withdraw?");
                Scanner input6 = new Scanner(System.in);
                double withdrawChoice = input6.nextDouble();

                if (withdrawChoice < 0 ){
                    System.out.println("That's a negative number, we don't do that here");
                } else {
                    accountID.saveWithdraw(withdrawChoice, choice3);
                }
                break;
            case "4":
                System.out.println(
                        "What would you like to name the new account?");
                Scanner sc2 = new Scanner(System.in);
                String input7 = sc2.next();
                accountID.getAcctID(userName);
                System.out.println("please re-enter first name\n");
                String firstName = sc2.next();
                System.out.println("please re-enter last name:\n");
                String lastName = sc2.next();
                CustomerDAO NewCustomer = new CustomerDAO(conn);
                NewCustomer.saveNewCustomer(1, firstName, lastName,conn);
                System.out.println("Show the account some love and give it an opening balance");
                double openingBal = sc.nextDouble();
                if (input7.matches("[a-zA-Z0-9]{2,25}$") && openingBal > 0){
                    MyArrayList<AccountModel> acctID = accountID.getAcctID(userName);
                    System.out.println(acctID);
                    accountID.addNewAcct2Existent(openingBal,input7);
                } else {
                    System.out.println("You probably included a special character in the account name, or tried to deposit a negative number");
                    AccountView.AccountScreen(userName);
                }
                break;
            case "5":

                break;
        }
    }
}
