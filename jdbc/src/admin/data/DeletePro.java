package admin.data;

import admin.fun.AdminFun;
import com.conn.JavaCon;
import com.data.alldata;
import java.util.Scanner;

public class DeletePro {

    public DeletePro() {
        alldata al=new alldata();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        Scanner sc=new Scanner(System.in);
        System.out.println("Delete Id Enter ->");
        int DelId;
        DelId=sc.nextInt();
        al.ProsetId(DelId);
        boolean f=adf.ProDelete(al);
        if(f)
        {
            System.out.println("*********--------Delete Item Is SuccessFully ");
        }
        else
        {
            System.out.println("*********--------Delete Item Is UnSuccessFully ");
        }
    }
    
    public static void main(String[] args) {
        DeletePro dp=new DeletePro();
    }
}
