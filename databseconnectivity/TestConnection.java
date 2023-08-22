package databseconnectivity;

import java.sql.Statement;
import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    
    public static void main(String[] args) {
        try {
            Connection con = null;
            Statement stmt = null;
            con = DriverManager.getConnection(DB_URL, username, password);
            String sql = "Create Table user (id integer, name varchar(20), address varchar(20))";
            stmt= con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Created Table");
            stmt.close();
            con.close();
            
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        
    }
    public static void insertdata(){
        Connection con = null;
        Statement stmt = null;
        String sql = "INSERT INTO user1 VALUES(1,'PRABUDDHA', 'KATHMANDU',)";
        
        

    }
    public static final
        String DB_URL = "jdbc:mysql://localhost/nccs";
        public static final
        String username = "root";
        public static final
        String password = "4444";
        
    
    
}
