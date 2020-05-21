/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;



public class connection_class {
    public Connection connect(){ 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLServer Connector Not Found !","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
