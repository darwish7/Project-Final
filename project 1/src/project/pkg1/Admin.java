package project.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Admin extends javax.swing.JFrame {
        
    DefaultTableModel tab = new DefaultTableModel();
    public Admin() {
        initComponents();
        admin_table.setModel(tab);
        tab.addColumn("ID");
        tab.addColumn("First Name");
        tab.addColumn("Last Name");
        tab.addColumn("Email");
        tab.addColumn("Password");
        tab.addColumn("Gender");
        tab.addColumn("Role");
        tab.addColumn("Event ID");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM account";
           // String sql = "SELECT account.ID, account.fname,account.lname,account.Email,account.pass,account.gender,account.job_id,event_s.name,event_s.ID FROM account INNER JOIN event_S ON account.event_id = event_s.ID; ";
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
            tab.addRow(new Object[] { 
                rs.getInt("ID"),
                rs.getString("fname"),
            rs.getString("lname"),
            rs.getString("Email"),
            rs.getString("pass"),
            rs.getString("Gender"),
            rs.getString("job_id"),
            rs.getString("event_id")});
          
            
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        Add_button = new javax.swing.JButton();
        Delete_button = new javax.swing.JButton();
        Update_button = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        fname_Field = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        lname_field = new javax.swing.JTextField();
        Email_field = new javax.swing.JTextField();
        pass_field = new javax.swing.JPasswordField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Rolebtn = new javax.swing.JComboBox<>();
        refresh_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admin_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
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
        admin_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admin_table);

        Add_button.setText("Add User");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        Delete_button.setText("Delete User");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });

        Update_button.setText("Update");
        Update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_buttonActionPerformed(evt);
            }
        });

        label1.setText("First Name");

        fname_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_FieldActionPerformed(evt);
            }
        });

        label2.setText("Last Name");
        label2.setPreferredSize(new java.awt.Dimension(67, 20));

        label3.setText("Email");
        label3.setPreferredSize(new java.awt.Dimension(67, 20));
        label3.setRequestFocusEnabled(false);

        label4.setText("Password");

        lname_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname_fieldActionPerformed(evt);
            }
        });

        Email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_fieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(Male);
        Male.setText("Male");

        buttonGroup1.add(Female);
        Female.setText("Female");

        Rolebtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Service Provider", "Customer", " " }));

        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/pkg1/Refresh.png"))); // NOI18N
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(244, 244, 244))
                                .addComponent(Rolebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(Female, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(pass_field, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(Email_field)
                                .addComponent(lname_field)
                                .addComponent(fname_Field))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Delete_button)
                        .addGap(80, 80, 80)
                        .addComponent(Update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Female, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(Rolebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
    String gender = null;
    String role;
    int role_id = 0;
    try {
            String fname = fname_Field.getText();
            String lname = lname_field.getText();
            String email  = Email_field.getText();
            String pass = pass_field.getText();
            if(Male.isSelected()){
                gender="Male";
            }
            if(Female.isSelected()){
                gender="Female";
            }
            role= Rolebtn.getSelectedItem().toString();
            if("Customer".equals(role)){
                role_id = 4;
            }
            else if("Admin".equals(role)){
                role_id=1;
            }
            if("Service Provider".equals(role)){
                role_id = 2;
            }
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            String sql = "insert into account(fName,lname,Email,pass,gender,job_id) values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,fname);
            st.setString(2,lname);
            st.setString(3,email);
            st.setString(4,pass);
            st.setString(5, gender);
            st.setInt(6,role_id);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account Inserted Sucessfully");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"SQLServer Connector Not Found !","Error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Enter Correct Data","Error",JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }

            
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            int row = admin_table.getSelectedRow();
            Statement st = con.createStatement();
            String id = admin_table.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM account WHERE ID ='"+id+"' ";
            
            int val = st.executeUpdate(sql);
            if(val == 1){
            JOptionPane.showMessageDialog(null,"User Deleted succesfully","Done",JOptionPane.INFORMATION_MESSAGE);
            }/* DefaultTableModel model=(DefaultTableModel)admin_table.getModel();
            model.setRowCount(0);
            show_user();*/
            if(val==0){
            JOptionPane.showMessageDialog(null,"User Already Deleted","Done",JOptionPane.YES_OPTION);        
            }
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Can not delete user!","Error!!",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Delete_buttonActionPerformed

    private void Update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_buttonActionPerformed
        try {
            String Gender2 = null;
            String Role2;
            int roleId = 0;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EventMangment","root","123");
            int row = admin_table.getSelectedRow();
            Statement st = con.createStatement();
            String iD = admin_table.getModel().getValueAt(row, 0).toString();
             if(Male.isSelected()){
           Gender2="Male";
           }
           if(Female.isSelected()){
           Gender2="Female";
           }
           Role2= Rolebtn.getSelectedItem().toString();
           if("Customer".equals(Role2)){
           roleId = 4;
           }
           else if("Admin".equals(Role2)){
           roleId=1;
           }
           if("Service Provider".equals(Role2)){
           roleId = 2;
           }
            
            String sql3 = "UPDATE account SET fname='"+fname_Field.getText()+"' ,lname='"+lname_field.getText()+"' ,Email='"+Email_field.getText()+"' ,pass='"+pass_field.getText()+"'"
                    + ",gender='"+Gender2+"' ,job_id='"+roleId+"'WHERE ID='"+iD+"' ";
            
           int val2 = st.executeUpdate(sql3);
           if(val2==1){
           JOptionPane.showMessageDialog(null,"User Updated succesfully","Done",JOptionPane.INFORMATION_MESSAGE);
         
           
           }
           else{
               JOptionPane.showMessageDialog(null,"No Updates Done!!","Done",JOptionPane.INFORMATION_MESSAGE);
           }
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Update Failed!!","Error!!",JOptionPane.ERROR_MESSAGE);
           Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null,"Cannot connect to SQLServer!!","Error!!",JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e ){
            JOptionPane.showMessageDialog(null,"Please Select User To Update ","Done",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Update_buttonActionPerformed

    private void fname_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_FieldActionPerformed

    private void lname_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname_fieldActionPerformed

    private void Email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_fieldActionPerformed

    private void admin_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_tableMouseClicked
         int i = admin_table.getSelectedRow();
         TableModel model = admin_table.getModel();
         fname_Field.setText(model.getValueAt(i,1).toString());
         lname_field.setText(model.getValueAt(i,2).toString());
         Email_field.setText(model.getValueAt(i, 3).toString());
         pass_field.setText(model.getValueAt(i,4).toString());
         String Gender = model.getValueAt(i,5).toString();
         if(Gender.equals("Male")){
         Male.setSelected(true);
         }
         else{
         Female.setSelected(true);
         }
         String role = model.getValueAt(i,6).toString();
         switch(role){
             case "1":
                 Rolebtn.setSelectedIndex(0);
                 break;
             case "2":
                 Rolebtn.setSelectedIndex(1);
                 break;
             case "4":
                 Rolebtn.setSelectedIndex(2);
                 break;
         }
    }//GEN-LAST:event_admin_tableMouseClicked

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        Admin updated = new Admin();
        updated.setSize(700, 700);
        updated.setLocation(700,300);
        updated.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refresh_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Delete_button;
    private javax.swing.JTextField Email_field;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JComboBox<String> Rolebtn;
    private javax.swing.JButton Update_button;
    private javax.swing.JTable admin_table;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fname_Field;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField lname_field;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JButton refresh_btn;
    // End of variables declaration//GEN-END:variables
}
