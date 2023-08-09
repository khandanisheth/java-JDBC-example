package user.fun;

import admin.data.ProFatch;
import com.data.alldata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class UserFun {
    private Connection conn;
    ProFatch pf=new ProFatch();
    public UserFun(Connection conn) {
        this.conn=conn;
    }
    PreparedStatement ps;
    // User Registion Data Insert Data 
    public boolean userInsert(alldata al)
    {
        boolean f=false;
        try {
            String query="Insert into userdata (username,userdob,usermob,userpass) values(?,?,?,?)";
            String query1="Insert into prodata (ProName,ProQun,ProRs) values(?,?,?)";
            ps=conn.prepareStatement(query);
            ps.setString(1, al.usernameget());
            ps.setString(2, al.userDobget());
            ps.setString(3, al.userMobget());
            ps.setString(4, al.userpassget());
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return f;
    }
    
    public boolean userlogin(alldata al)
    {
        boolean f=false;
        try {
            String query="select * from userdata where username=? and userpass=?";
            ps=conn.prepareStatement(query);
            ps.setString(1, al.usernameget());
            ps.setString(2, al.userpassget());
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                f=true;
            }
        } catch (Exception e) {
        }
        return f;
    }
    
    public void Shoppinguser(alldata al)
    {
        int totalBalance=0,allQun=0,shopQun=0,clothRs=0;
        String clothName=" ";
        pf.ProFatch();
        try 
        {
            String query="select * from prodata where id =?";
            ps=conn.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter ProDouct Id You Shopping ->");
            int id=sc.nextInt();
            al.ProsetId(id);
            ps.setInt(1, al.Progetid());
            ResultSet rs=ps.executeQuery();
            System.out.println("ProId"+"\t"+"ProName"+"\t\t"+"ProQuntity"+"\t"+"ProRS");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+" \t\t    "+rs.getInt(3)+"\t \t"+rs.getInt(4));
                allQun=rs.getInt(3);
                clothRs=rs.getInt(4);
                clothName=rs.getString(2);
            }
            System.out.println("Enter Your "+clothName+" Quntity Number ->");
            shopQun=sc.nextInt();
            
            //shopQun=allQun-shopQun;
            totalBalance +=shopQun*clothRs;
            System.out.println("Your Total Balance ->"+totalBalance);
            
        } catch (Exception e) {
        }
    }
}
