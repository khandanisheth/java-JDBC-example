package user.data;

import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;
import user.fun.UserFun;

public class UserRegestion {
    public void userRegestion()
    {
        System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*--Submit Your InForMation *-*-*-*-*-*-*-*-*-*-*-*--\n");
        String username,userDob,userpass,usermo;
        alldata al=new alldata();
        UserFun uf=new UserFun(JavaCon.getconn());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr UserName || Email ->");
        username=sc.nextLine();
        System.out.println("Enetr Your Date Of Birth ->");
        userDob=sc.nextLine();
        System.out.println("Enetr Your Mobile Number ->");
        usermo=sc.nextLine(); 
        System.out.println("Enetr Your PassWord ->");
        userpass=sc.nextLine();
        al.UserDetialset(username, userDob, usermo, userpass);
        boolean f=uf.userInsert(al);
        if(f)
        {
            System.out.println("----*****User Data Is Insert Is SuccessFully ****----");
        }
        else
        {
             System.out.println("----*****User Data Is Insert Is UnSuccessFully ****----");
        }
    }
    public static void main(String[] args) {
        UserRegestion ur=new UserRegestion();
        ur.userRegestion();
    }
}
