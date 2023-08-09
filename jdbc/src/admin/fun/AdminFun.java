package admin.fun;
import com.data.alldata;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class AdminFun {
    private static Connection conn;
    public AdminFun(Connection conn) {
       this.conn=conn;
    }
    PreparedStatement ps;
    /* Admin Login */
    public boolean adlogin(alldata ad)
    {        
        boolean f=false;
        try {
            String query="select * from adminlogin where email=? and pass=?";
            ps=conn.prepareStatement(query);
            ps.setString(1, ad.emailget());
            ps.setString(2, ad.passget());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                f=true;
            }
        } catch (Exception e) {
        }
        return f;
    }
    /* Admin Login */
    
    /* Product Add After Login */
    public  boolean Productinsert(alldata ad)
    {
        boolean f=false;
        try {
            String query1="Insert into prodata (ProName,ProQun,ProRs) values(?,?,?)";
            ps=conn.prepareStatement(query1);
            ps.setString(1, ad.ProNameget());
            ps.setInt(2, ad.ProQunget());
            ps.setInt(3, ad.ProRsget());
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        } catch (Exception e) {
        }
        return f;
    }
    /* Product Add After Login */
    
    /* Product Update After Login */
     public  boolean ProductUpadate(alldata ad)
    {
        boolean f=false;
        try {
            String query1="update prodata set ProName=?,ProQun=?,ProRs=? where id=?";
            ps=conn.prepareStatement(query1);
            ps.setString(1, ad.ProNameget());
            ps.setInt(2, ad.ProQunget());
            ps.setInt(3, ad.ProRsget());
            ps.setInt(4, ad.Progetid());
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        } catch (Exception e) {
        }
        return f;
    }
    /* Product Update After Login */
     
    /* Product Delete After Login  */
    public boolean ProDelete(alldata al)
    {
        boolean f=false;
        try {
            String query="Delete from prodata where id=?";
            ps=conn.prepareStatement(query);
            ps.setInt(1, al.Progetid());
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return  f;
    }
    
    /* Product Delete After Login  */
    
    public List<alldata>fatch()
    {
        List<alldata> list=new ArrayList<alldata>();
        alldata al=null;
        try {
            String query="select * from prodata";
            ps=conn.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                al=new alldata();
                al.ProductDetialUpdate(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                list.add(al);
            }
        }catch (Exception e) 
        {
            System.out.println(e);
        }
        return list;
    }
}

/* List<alldata> list=new ArrayList<alldata>();
       alldata em=null;
       try 
       {
            ps=conn.prepareStatement("select * from prodata");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                em=new alldata();
                em.ProductDetialUpdate(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                list.add(em);
            }
            
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
       return list;
*/