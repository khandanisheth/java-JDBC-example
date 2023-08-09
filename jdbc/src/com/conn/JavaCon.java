package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaCon {
    private static Connection con;
    public static Connection getconn()
    {
        if(con==null)
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interjadbc","root","6375");
            }
            catch (ClassNotFoundException e) 
            {
               e.printStackTrace();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return con;
    }
}
