/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class my_event  extends javax.swing.JPanel {
    DefaultTableModel dtm = new DefaultTableModel();
    public my_event () throws SQLException {
        
            initComponents();
            table1.setModel(dtm);
            dtm.addColumn("ID");
            dtm.addColumn("Event_Name");
            dtm.addColumn("Place_Id");
            dtm.addColumn("Guest_num");
            dtm.addColumn("Reser_num");
            dtm.addColumn("Day");
            dtm.addColumn("Month");
            dtm.addColumn("Time");
       try {     
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            String sql = "SELECT * FROM event_s";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                
              dtm.addRow(new Object[]{rs.getInt("ID"),rs.getString("name"),rs.getString("Place_id"),rs.getInt("guest_num"),rs.getString("dday"),rs.getString("mmonth"),rs.getString("ttime")});
            }
            
       
       
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(my_event .class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    // End of variables declaration                   
}

