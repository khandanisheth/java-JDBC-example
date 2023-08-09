package user.data;

import com.conn.JavaCon;
import java.util.Scanner;
import user.fun.UserFun;
import com.data.alldata;

public class UserShoping {

    public void userShoping() {
        alldata al=new alldata();
        UserFun uf=new UserFun(JavaCon.getconn());
        Scanner sc=new Scanner(System.in);
        boolean f=true;
        while (f) 
        {            
            System.out.println("-*/-/-/**-*/-Do You Want Shopping -*/-/-/**-*/-");
            System.out.println("You Prees \n 1.Yes \n 2.No ");
            System.out.println("Enter Your Choice ->");
            int Choice=sc.nextInt();
            switch(Choice)
            {
                case 1:
                    uf.Shoppinguser(al);
                    break;
                case 2:
                    f=false;
                    break;
                default:
                    System.out.println(" *-*/-*/-/*-/*-/-*-/-**--Your Choice Is Wrong Is Wrong *-*/-*/-/*-/*-/-*-/-**--");
            }
        } 
    }
    
    public static void main(String[] args) 
    {
       UserShoping us=new UserShoping();
       us.userShoping();
               
    }
}
