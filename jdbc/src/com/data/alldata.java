package com.data;
public class alldata {
    /* admin Login get and set  */
    private String pass;
    private String email;
    public void adminlogin(String email,String pass)
    {
        this.email=email;
        this.pass=pass;
    }
    public String emailget()
    {
        return email;
    }
    public String passget()
    {
        return pass;
    }
    /* admin Login get and set  */
    
    /*admin ProDuct Detial And Update And Delete  */
    private  String ProName;
    private int ProQun,ProRs,Proid;
    
    /*Admin  Setter Fun() */
    public void ProductDetial(String ProName,int ProQun,int ProRs )
     {
         this.ProName=ProName;
         this.ProQun=ProQun;
         this.ProRs=ProRs;              
     }
    public void ProductDetialUpdate(int Proid,String ProName,int ProQun,int ProRs )
    {
        this.ProName=ProName;
        this.ProQun=ProQun;
        this.ProRs=ProRs;
        this.Proid=Proid;
    }
    public void ProsetId(int Proid)
    {
        this.Proid=Proid;
    }
    
    /* admin Getter Fun() */
    public String ProNameget()
    {
        return ProName;
    }
    public int ProRsget()
    {
        return ProRs;
    }
    public int ProQunget()
    {
        return ProQun;
    }
    public int Progetid()
    {
        return  Proid;
    }
    /* ProDuct Detial And Update And Delete  */
    
    
    /* user All Data And Fun    */
    private String username,userDob,userMob,userpass;
    
    /* User Setter */
    public void UserDetialset(String username,String userDob,String userMob,String userpass)
    {
        this.username=username;
        this.userDob=userDob;
        this.userMob=userMob;
        this.userpass=userpass;
    }
    public void Userneameset(String username)
    {
        this.username=username;
    }
    public void Userpassset(String userpass)
    {
        this.userpass=userpass;
    }
    
    
    /* User Setter */
    
    /* User Getter */
    public String usernameget()
    {
        return username;
    }
    public String userDobget()
    {
        return userDob;
    }
    public String userMobget()
    {
        return userMob;
    }
    public String userpassget()
    {
        return userpass;
    }
    
    /* User Getter*/
    /* user All Data And Fun    */
}
