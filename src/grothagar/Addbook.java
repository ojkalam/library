/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grothagar;

import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tipu
 */
public class Addbook extends javax.swing.JFrame {

    /**
     * Creates new form Addbook
     */
    public Addbook(){
        initComponents();
        Random();
    }
     public void Random(){
        Random rd=new Random();
        tf_bookid.setText(""+rd.nextInt(2000+1));   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        liblogo = new javax.swing.JLabel();
        libheading = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_edition = new javax.swing.JLabel();
        lb_bookname = new javax.swing.JLabel();
        btn_add_book = new javax.swing.JButton();
        lb_publisher = new javax.swing.JLabel();
        lb_isbn = new javax.swing.JLabel();
        lb_bookid = new javax.swing.JLabel();
        lb_page = new javax.swing.JLabel();
        tf_isbn = new javax.swing.JTextField();
        tf_bookid = new javax.swing.JTextField();
        tf_edition = new javax.swing.JComboBox<>();
        lb_authorname = new javax.swing.JLabel();
        tf_book_name = new javax.swing.JTextField();
        tf_page = new javax.swing.JTextField();
        tf_author = new javax.swing.JTextField();
        tf_publ = new javax.swing.JTextField();
        addanewbook = new javax.swing.JLabel();
        homebtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add a new book");
        getContentPane().setLayout(null);

        liblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liicon.png"))); // NOI18N
        getContentPane().add(liblogo);
        liblogo.setBounds(120, 10, 110, 90);

        libheading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        libheading.setForeground(new java.awt.Color(255, 255, 255));
        libheading.setText("Library Management System");
        getContentPane().add(libheading);
        libheading.setBounds(250, 20, 350, 70);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lb_edition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_edition.setText("Edition");

        lb_bookname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_bookname.setText("Book Name:");

        btn_add_book.setBackground(new java.awt.Color(255, 204, 255));
        btn_add_book.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_add_book.setText("Add book ");
        btn_add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_bookActionPerformed(evt);
            }
        });

        lb_publisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_publisher.setText("Publisher");

        lb_isbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_isbn.setText("ISBN No:");

        lb_bookid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_bookid.setText("Book Id:");

        lb_page.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_page.setText("Pages: ");

        tf_isbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_bookid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_edition.setBackground(new java.awt.Color(153, 153, 255));
        tf_edition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_edition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st edition", "2nd edition", "3rd edition", "4th edition", "5th edition", "6th edition", "7th edition", "8th edition" }));

        lb_authorname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_authorname.setText("Author");

        tf_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_nameActionPerformed(evt);
            }
        });

        tf_page.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pageActionPerformed(evt);
            }
        });

        addanewbook.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addanewbook.setForeground(new java.awt.Color(0, 204, 204));
        addanewbook.setText("Add a new Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_bookname)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_isbn)
                                .addComponent(lb_publisher, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lb_authorname)
                            .addComponent(lb_page, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_book_name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_bookid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(tf_publ))
                                .addGap(56, 56, 56))
                            .addComponent(addanewbook, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_add_book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_page, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_edition, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE)
                                .addComponent(tf_isbn, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addanewbook)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_bookid)
                    .addComponent(tf_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_bookname)
                    .addComponent(tf_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_authorname))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_publ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_publisher))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_isbn)
                    .addComponent(tf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_edition)
                    .addComponent(tf_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_page, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_page, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_add_book, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 120, 500, 520);

        homebtn.setBackground(new java.awt.Color(255, 204, 255));
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hom.png"))); // NOI18N
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        getContentPane().add(homebtn);
        homebtn.setBounds(20, 580, 70, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libook.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 780, 670);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 33, 9);

        setSize(new java.awt.Dimension(795, 698));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pageActionPerformed

    private void tf_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        setVisible(false);
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_homebtnActionPerformed
 public boolean ck_book_name(String bk){
     try{
         int bkname = Integer.parseInt(bk);
         return true;
     }catch(Exception ee){
         return false;
     }
 }
    private void btn_add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_bookActionPerformed
        // TODO add your handling code here:
        boolean b = false;
         Connection con = null;
         PreparedStatement stmt = null;
         String errormsg = "";
         String bk_name = tf_book_name.getText();
        //name validate
                //name exception handled
           
        if("".equals(bk_name)){
           errormsg = "book name empty\n";
           }if("".equals(tf_bookid.getText())){
           errormsg = errormsg+"book ID empty\n";
           }if("".equals(tf_author.getText())){
           errormsg = errormsg+"Author empty\n";
           }if("".equals(tf_publ.getText())){
           errormsg = errormsg+"publication empty\n";
           }if("".equals(tf_isbn.getText())){
           errormsg = errormsg+"isbn empty\n";
           }if("".equals(tf_page.getText())){
           errormsg = errormsg+"Pages empty\n";
           }
          if("".equals(errormsg)){
              if(ck_book_name(bk_name)){
                  JOptionPane.showMessageDialog(null,"Invalid book Name !","Warning",JOptionPane.WARNING_MESSAGE);
              }else{
        try{
            
            int bid = Integer.parseInt(tf_bookid.getText());
            String bname = tf_book_name.getText();
            String edition = tf_edition.getSelectedItem().toString();
            String author = tf_author.getText();
            String publisher = tf_publ.getText();
            String isbn = tf_isbn.getText();
            int pages = Integer.parseInt(tf_page.getText());

            
            String query = "insert into books(Book_ID,Book_Name,Author,Publisher,ISBN_No,Edition,Pages) values(?,?,?,?,?,?,?);";
            
            con = Db.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1,bid);
            stmt.setString(2,bname);
            stmt.setString(3,author);
            stmt.setString(4, publisher);
            stmt.setString(5,isbn);
            stmt.setString(6,edition);
            stmt.setInt(7,pages);

            stmt.executeUpdate();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null,"Book added successfuly !");

        }catch(NumberFormatException  ne){
            JOptionPane.showMessageDialog(null,"Invalid Book ID or Page number!","Warning",JOptionPane.WARNING_MESSAGE);
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
    }//GEN-LAST:event_btn_add_bookActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addanewbook;
    private javax.swing.JButton btn_add_book;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_authorname;
    private javax.swing.JLabel lb_bookid;
    private javax.swing.JLabel lb_bookname;
    private javax.swing.JLabel lb_edition;
    private javax.swing.JLabel lb_isbn;
    private javax.swing.JLabel lb_page;
    private javax.swing.JLabel lb_publisher;
    private javax.swing.JLabel libheading;
    private javax.swing.JLabel liblogo;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_book_name;
    private javax.swing.JTextField tf_bookid;
    private javax.swing.JComboBox<String> tf_edition;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JTextField tf_page;
    private javax.swing.JTextField tf_publ;
    // End of variables declaration//GEN-END:variables
}
