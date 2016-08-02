/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;
import java.sql.*;

/**
 *
 * @author cursed
 */
public class SchoolManagement {

    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost/EMP";
    static final String user = "root";
    static final String pass ="";
    
    public static Connection getConnection(){
        Connection conn =null;
       // Statement stmt =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database");
            conn=DriverManager.getConnection(DB_URL, user, pass);
        
          /*  System.out.println("Creating statement");
            stmt = conn.createStatement();
            String sql ;
            sql = "select id,first,last,age from employees";
            ResultSet rs = stmt.executeQuery(sql);*/
            
           /* while(rs.next()){
                int id =rs.getInt("id");
                int age=rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }*/
           
          
           
        //rs.close();
        //stmt.close();
        //conn.close();
        }
        
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        /*finally{
        try{
            if(stmt!=null){
                stmt.close();
            }
        }
        catch(SQLException se2){
            
        }
        try{
            if(conn!=null){
                conn.close();
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        }*/
        return conn;
    
}
}
