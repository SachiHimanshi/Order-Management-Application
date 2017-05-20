/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagement;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;






/**
 *
 * @author Kushani Madhushika
 */
public class ReportViwer extends JFrame {
    
     public ReportViwer(String fileName) throws ClassNotFoundException, SQLException
    {
        this(fileName, null);
    }
    public ReportViwer(String fileName, HashMap para) throws ClassNotFoundException, SQLException
    {
        super("ABC Solutions Hotel Management System (Report Viewer)");

        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
           java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoe_shop","root","");
            
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
    
     