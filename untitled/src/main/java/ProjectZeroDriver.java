import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProjectZeroDriver {

    public static void main(String [] args) {

        System.out.println("Welcome, new user!\nWhat name should we call you by?\n");//prompt user for username

        Scanner sc = new Scanner(System.in);//instantiate new Scanner obj. bound to System.in
        String userName = sc.nextLine();//set userName field to

        //String nameCheck = parse(userName);

//        for (int i = 0; i < userName.length(); i++){
//            if ()
//        }

        System.out.println(userName + " what would you like your password to be?");

        String userPassword = sc.nextLine();
//        System.out.println(userPassword);


    }

}
