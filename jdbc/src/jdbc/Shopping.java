package jdbc;

import java.util.Scanner;
import user.data.UserLogin;
import user.data.UserRegestion;

public class Shopping {
    public static void main(String[] args) {
        UserLogin ul=new UserLogin();
        UserRegestion ur=new UserRegestion();
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("Press \n 1.User Registration . \n 2.User Login \n 3.Exit()");
            sc = new Scanner(System.in);
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                    
                case 1:
                    ur.userRegestion();//Class User UserReg.....
                    ul.userLogin();//Class User Login
                    break;
                case 2:
                    ul.userLogin();//Class User Login
                    break;
                case 3:
                    f = false;
                    break;
                default:

            }
        }
    }
}
