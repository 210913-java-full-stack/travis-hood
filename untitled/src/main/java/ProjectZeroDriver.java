


import services.NewUserLogin;

import services.VerifiedUser;



import java.io.IOException;

import java.sql.SQLException;
import java.util.Scanner;



public class ProjectZeroDriver {


    public static void main(String[] args) throws SQLException, IOException {

        //prompt user for integer for Account Creation, Account Access, Quit

        System.out.println("================" +
                "\nWelcome, please select from one of the following options:" +
                "\n================" +
                "\n1)Create a new account" +
                "\n2)Account login" +
                "\n3)Quit" +
                "\n================");

        Scanner sc = new Scanner(System.in);//instantiate new Scanner obj. bound to System.in
        String input = sc.next();

        if ("1".equals(input) || "one".equals(input) || "One".equals(input)) {
            NewUserLogin.createNew();
        } else if ("2".equals(input)||"two".equals(input) || "Two".equals(input)){
            VerifiedUser.verifyLogin();
        } else {
            System.out.println("Maybe next time. Thanks for visiting with us today!");
        }
    }
}

//        sc1.nextLine();//advances to next line in case user uses space-bar
//        String userName = sc1.next();//set user input as userName field
//
//
//        System.out.println(userName + " what would you like your password to be?");//ask user for password
//        sc1.nextLine();
//        String userPassword = sc1.next();//set user input to userPassword
//        System.out.println(userPassword);

        //




//
//        userdao.save(1 + "", userName, userPassword);
//
//    }
//}

        //
//        MyArrayList<AccountModel> userAccountArray = new MyArrayList<>();
//
//        userAccountArray.add(account0);

//
////        String nameRegex = "[\\w&&\\D]{1,15}";
////        String emailRegex = "^[\\w]+\\@[\\w]+\\.[a-z]{3}";
//
//
//        //System.out.println("What kind of account would you like to open with us?\n1) Savings Account\n2)Checking");
//
//
//
//
//        //userModel user0 = new userModel(1, userName, userPassword);
//
//        //AccountModel account0 = new AccountModel(1, 'userBalance', 'userAccType');
//

////
////        test.add(customer1);
////        test.add(customer2);
////        test.add(customer0, 1);
////        test.remove(1);
////        System.out.println(test.size());
////        System.out.println(test.get(1));
////        for (int i = 0; i < test.size(); i++){
////            System.out.println(test.get(i));
////        }
//
////        private int id;
////        private String firstName;
////        private String lastName;
////        private String userName;
////        private String password;
//        }




