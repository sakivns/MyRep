/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cabservice;
import java.sql.*;
/**
 *
 * @author Vikas Yadav
 */
public class Dbconn {
   static Statement s;
   static ResultSet rs;
    static Connection con;
    PreparedStatement ps;
    public  Dbconn()
    {
        
        try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch(ClassNotFoundException e){System.out.println(e.getMessage());}
        try{
         con=DriverManager.getConnection("jdbc:odbc:vehicle","root","root@root");
       s=con.createStatement();
       
//        s.executeUpdate("CREATE TABLE REGISTRATION " +
//                   "(id INTEGER not NULL, " +
//                   " first VARCHAR(255), " + 
//                   " last VARCHAR(255), " + 
//                   " age INTEGER, " + 
//                   " PRIMARY KEY ( id ))");
    //    "CREATE TABLE USERS(Name VARCHAR(100),EmailId VARCHAR(50) not NULL,Mobile_number VARCHAR(20),PRIMARY KEY( EmailId ))"
       
        }catch(SQLException e){System.out.println(e.getMessage());}
    }
public  void executeupdate(String url)
{
    
    try{
        
    s.executeUpdate(url);
   }catch(SQLException e){System.out.println(e.getMessage());}
    }

public void executequery(String url) 
{
    
    try{
    rs=s.executeQuery(url);
    }catch(SQLException e){System.out.println(e.getMessage());}
}
public void preparedstatement(String url)
{
    try{
    ps=con.prepareStatement(url);
    
    }catch(SQLException e)
    {
        
    }
}

}
       