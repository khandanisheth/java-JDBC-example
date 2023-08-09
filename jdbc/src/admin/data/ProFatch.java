
package admin.data;

import admin.fun.AdminFun;
import com.conn.JavaCon;
import com.data.alldata;
import java.util.ArrayList;
import java.util.List;

public class ProFatch {
    public void  ProFatch()
    {
        alldata al =new alldata();
        AdminFun adf=new AdminFun(JavaCon.getconn());
        List<alldata> list=adf.fatch();
        if(list.isEmpty())
        {
            System.out.println("List is Empty");
        }
        else
        {
            System.out.println("ProId"+"\t"+"ProName"+"\t\t"+"ProQuntity"+"\t"+"ProRS");
            for(alldata ess:list)
            {
                System.out.println(ess.Progetid()+"\t"+ess.ProNameget()+" \t\t    "+ess.ProQunget()+"\t \t"+ess.ProRsget());
            }
        }
    }
    public static void main(String[] args) 
    {
        ProFatch pf=new ProFatch();
        
    }
}
