package user.data;

import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;
import user.fun.UserFun;

public class UserLogin {

    public void userLogin() {
        alldata al=new alldata();
        UserShoping us=new UserShoping();
        UserFun uf=new UserFun(JavaCon.getconn());
        String Email,pass;
        System.out.println("\n******------Enter Email ID and PassWord You Login This Page.-----*****\n");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Email Id ->");
        Email=sc.nextLine();
        System.out.println("Enter PassWord ->");
        pass=sc.nextLine();
        al.Userneameset(Email);
        al.Userpassset(pass);
        boolean f=uf.userlogin(al);
        if(f)
        {
            System.out.println("-*-*-*-*-*-*--*-**-*-*Login is SuccessFully-*-*-*-*-*-*--*-**-*-*");
            us.userShoping();
        }
        else
        {
            System.out.println("-*-*-*-*-*-*--*-**-*-*Login is UnSuccessFully-*-*-*-*-*-*--*-**-*-*");
        }
    }
    
    public static void main(String[] args) {
        UserLogin ul=new UserLogin();
        ul.userLogin();
    }
}
