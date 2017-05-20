/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement.dbconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;

/**
 *
 * @author Kushani Madhushika
 */
public class Dbconnect {
     public static Connection connect(){
    
          
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shoe_shop","root","");
            
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            
            System.out.println(e);
        }
    
    return conn;
    }

    static TableModel resultSetToTableModel(ResultSet genrRS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     com.mysql.jdbc.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

