/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author saif7
 */
public class MyConnection {
    public static final String username = "root"; // here you have to set you mysql username
    public static final String password = "saifcore7"; //here you have to set your mysql password
    public static final String url = "jdbc:mysql://localhost:3306/shopping_system";
    public static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex, "",JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
