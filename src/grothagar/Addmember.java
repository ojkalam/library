/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grothagar;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Tipu
 */
public class Addmember extends javax.swing.JFrame {

    /**
     * Creates new form Addmember
     */
    public Addmember() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_st_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        memid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        addmem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        libheading = new javax.swing.JLabel();
        liblogo = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add member");
        getContentPane().setLayout(null);

        tf_st_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tf_st_name);
        tf_st_name.setBounds(280, 150, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Add a new Member");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 100, 170, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 150, 50, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Student Id:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(160, 207, 71, 20);

        memid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memidActionPerformed(evt);
            }
        });
        getContentPane().add(memid);
        memid.setBounds(280, 200, 230, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Semester:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(160, 260, 62, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("E-mail:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(160, 310, 70, 30);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(email);
        email.setBounds(280, 310, 230, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Contact:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(160, 360, 76, 30);
        getContentPane().add(contact);
        contact.setBounds(280, 360, 233, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Address:");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(160, 420, 70, 20);
        getContentPane().add(address);
        address.setBounds(280, 420, 230, 30);

        addmem.setBackground(new java.awt.Color(255, 204, 204));
        addmem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addmem.setText("Add Member");
        addmem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmemActionPerformed(evt);
            }
        });
        getContentPane().add(addmem);
        addmem.setBounds(280, 480, 230, 38);

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hom.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 500, 70, 70);

        libheading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        libheading.setText("Library Management System");
        getContentPane().add(libheading);
        libheading.setBounds(260, 40, 304, 29);

        liblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liicon.png"))); // NOI18N
        getContentPane().add(liblogo);
        liblogo.setBounds(130, 10, 110, 90);

        semester.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st semeste", "2nd semeste", "4th semeste", "5th semeste", "6th semeste", "7th semeste", "8th semeste", "9th semeste", "10th semeste", "11th semeste" }));
        getContentPane().add(semester);
        semester.setBounds(280, 260, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginpage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 580);

        setSize(new java.awt.Dimension(748, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memidActionPerformed

    private void addmemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmemActionPerformed
        // TODO add your handling code here:
        boolean b = false;
        Connection con = null;
        PreparedStatement stmt = null;
        String errormsg = "";
        String st_name = tf_st_name.getText();
        //name validate
                //name exception handled
                int len = st_name.length();  
                int c=0;
                for(int i=0;i<len;i++){
                    if(Character.isDigit(st_name.charAt(i))){
                        b = true;
                        break;
                    }
                    c++;
                 }
             
        if("".equals(st_name)){
           errormsg = "Student name empty\n";
           }if("".equals(memid.getText())){
           errormsg = errormsg+"Student ID empty\n";
           }if("".equals(email.getText())){
           errormsg = errormsg+"Email empty\n";
           }if("".equals(contact.getText())){
           errormsg = errormsg+"Contact empty\n";
           }if("".equals(address.getText())){
           errormsg = errormsg+"Address empty\n";
           }
          if("".equals(errormsg)){
              if(b){
                  JOptionPane.showMessageDialog(null,"Invalid Name !","Warning",JOptionPane.WARNING_MESSAGE);
              }else{
               try{
            String nam = st_name;
            int mem_id = Integer.parseInt(memid.getText());
            String seme = semester.getSelectedItem().toString();
            String em = email.getText();
            String cont = contact.getText();
            String addr = address.getText();
            
            String query = "insert into member(Student_ID,Name,Semester,Email,Contact,Address) values(?,?,?,?,?,?);";
            
            con = Db.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1,mem_id);
            stmt.setString(2,nam);
            stmt.setString(3,seme);
            stmt.setString(4,em);
            stmt.setString(5,cont);
            stmt.setString(6,addr);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Member added successfuly !");

        }catch(NumberFormatException  ne){
            JOptionPane.showMessageDialog(null,"Invalid Student ID !","Warning",JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                stmt.close();
                con.close();
            }catch(Exception ee){
                JOptionPane.showMessageDialog(null, "Connection Error !");
            }
         }
              }  
       }else{
            JOptionPane.showMessageDialog(null,errormsg,"Warning",JOptionPane.WARNING_MESSAGE); 
      }
    }//GEN-LAST:event_addmemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmem;
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel libheading;
    private javax.swing.JLabel liblogo;
    private javax.swing.JTextField memid;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JTextField tf_st_name;
    // End of variables declaration//GEN-END:variables
}