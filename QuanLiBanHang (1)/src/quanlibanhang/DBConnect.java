
package quanlibanhang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnect {
    
    
    public static Connection getConnection() throws  SQLException{
        String url="jdbc:mysql://localhost:3306/quanlicuahang";
        String user ="root";
        String password ="123456";
        return   (Connection) DriverManager.getConnection(url, user, password);
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 

    
 

