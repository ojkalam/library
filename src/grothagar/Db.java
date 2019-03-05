package grothagar;
import java.sql.*;
import javax.swing.JOptionPane;
public class Db
{
//JDBC and database properties.
   private static final String DB_DRIVER="com.mysql.jdbc.Driver";
   private static final String DB_URL="jdbc:mysql://localhost:3306/demolib";
   private static final String DB_USERNAME="root";
   private static final String DB_PASSWORD ="";
    public static Connection getConnection(){
        Connection conn = null; 
        try{
            Class.forName(DB_DRIVER); //Register the JDBC driver
            //Open the connection
            conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
//            if(conn != null){ 
//                JOptionPane.showMessageDialog(null,"Safol connection");
//            }else{ 
//                System.out.println("Failed to connect."); 
//            } 
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    }
}