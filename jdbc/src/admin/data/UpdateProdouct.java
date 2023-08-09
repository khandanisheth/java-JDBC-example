package admin.data;

import admin.fun.AdminFun;
import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;

public class UpdateProdouct {
     public UpdateProdouct() {
        String ProName;
        int ProQun,ProRs,Proid;
        alldata al=new alldata();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        System.out.println("************----------Admin.Data.Update Prodect--------------***********");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Update Id ->");
        Proid=sc.nextInt();
        sc =new Scanner(System.in);
        System.out.println("Enter Product Name ->");
        ProName=sc.nextLine();
        System.out.println("Enter Product Quantity ->");
        ProQun=sc.nextInt();
        sc =new Scanner(System.in);
        System.out.println("Enter Product Rs ->");
        ProRs=sc.nextInt();
        al.ProductDetialUpdate(Proid,ProName, ProQun, ProRs);
        boolean f=adf.ProductUpadate(al);
        if(f)
        {
            System.out.println("\n******------ProDuct Update SuccessFully -----*****\n");
        }
        else
        {
            System.out.println("********-------ProDuct Update UnSuccessFully------------************");
        }
    }
    public static void main(String[] args) {
        UpdateProdouct ap=new UpdateProdouct();
    }
}
