
package admin.data;

import admin.fun.AdminFun;
import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;

public class adminlogin {
    public static void main(String [] args)
    {
        alldata al=new alldata();
        AddProdect add;
        UpdateProdouct up;
        DeletePro dp;
        ProFatch pf =new ProFatch();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        String Email,pass;
        System.out.println("\n******------Enter Admin Email ID and password .-----*****\n");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Email Id ->");
        Email=sc.nextLine();
        System.out.println("Enter PassWord ->");
        pass=sc.nextLine();
        al.adminlogin(Email, pass);
        boolean f=adf.adlogin(al);
        if(f)
        {
            System.out.println("\n******------Admin Email ID and password Matched.-----*****\n");
            boolean x=true;
            while(x)
            {
            System.out.println("Prees ,\n 1.ProDuct Insert \n 2.Update Data \n 3.Delete Data By(Id) \n");
            System.out.print(" 4.Data All Data Fatch \n 5.Exit ");
            int i=sc.nextInt();
            switch(i)
                {
                case 1:
                    add=new AddProdect();
                    break;
                case 2:
                    up=new UpdateProdouct();
                    break;
                case 3:
                    dp=new DeletePro();
                    break;
                case 4:
                    pf.ProFatch();
                    break;
                case 5:
                    x=false;
                    break;
                default:
                    System.out.println("********----------- Choice Is UnValid -------------************");
                }
            }
        }
        else
        {
            System.out.println("Your PassWord And Email Do'T Match");
        }
    }
}
