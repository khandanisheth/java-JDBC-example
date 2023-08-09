package admin.data;

import admin.fun.AdminFun;
import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;

public class AddProdect {

    public AddProdect() {
        String ProName;
        int ProQun,ProRs;
        alldata al=new alldata();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        Scanner sc =new Scanner(System.in);
        System.out.println("************----------Admin.Data.Add Prodect--------------***********");
        System.out.println("Enter Product Name ->");
        ProName=sc.nextLine();
        System.out.println("Enter Product Quantity ->");
        ProQun=sc.nextInt();
        System.out.println("Enter Product Rs ->");
        ProRs=sc.nextInt();
        al.ProductDetial(ProName, ProQun, ProRs);
        boolean f=adf.Productinsert(al);
        if(f)
        {
            System.out.println("\n******------ProDuct Add SuccessFully -----*****\n");
        }
        else
        {
            System.out.println("********-------ProDuct Add UnSuccessFully------------************");
        }
    }
    
    public static void main(String[] args) {
        /*String ProName,ProSize;
        int ProQun,ProRs;
        alldata al=new alldata();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Product Name ->");
        ProName=sc.nextLine();
        System.out.println("Enter Product Size ->");
        ProSize=sc.nextLine();
        System.out.println("Enter Product Quantity ->");
        ProQun=sc.nextInt();
        System.out.println("Enter Product Rs ->");
        ProRs=sc.nextInt();
        al.ProductDetial(ProName, ProSize, ProQun, ProRs);
        boolean f=adf.Productinsert(al);
        if(f)
        {
            System.out.println("\n******------ProDuct Add SuccessFully -----*****\n");
        }
        else
        {
            System.out.println("********-------ProDuct Add UnSuccessFully------------************");
        }*/
        AddProdect add=new AddProdect();
    }
}
