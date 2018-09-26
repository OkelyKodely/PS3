
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhcho
 */
public class Categories extends javax.swing.JFrame {

    private Vector<String> categories = new Vector<String>();

    /**
     * Creates new form Categories
     */
    public Categories() {
        initComponents();
        
        //jlstCategories.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //jlstCategories.setLayoutOrientation(JList.VERTICAL);

        getCategories();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstCategories = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categoryName = new javax.swing.JTextField();
        jbtnInsert = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 750));
        setPreferredSize(new java.awt.Dimension(1280, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(258, 120));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(258, 120));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(275, 120));

        jlstCategories.setAutoscrolls(false);
        jlstCategories.setMaximumSize(null);
        jlstCategories.setMinimumSize(null);
        jlstCategories.setPreferredSize(null);
        jScrollPane1.setViewportView(jlstCategories);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel1.setText("Categories");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, 20));

        categoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNameActionPerformed(evt);
            }
        });
        jPanel1.add(categoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 230, 30));

        jbtnInsert.setBackground(new java.awt.Color(255, 255, 255));
        jbtnInsert.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insert.png"))); // NOI18N
        jbtnInsert.setText("Insert");
        jbtnInsert.setIconTextGap(10);
        jbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 150, 80));

        jbtnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.setIconTextGap(10);
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 180, 80));

        jbtnDelete.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.setIconTextGap(10);
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 160, 80));

        jButton4.setText("VIEW SELECTED PRODUCTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(80, 750));
        jPanel3.setPreferredSize(new java.awt.Dimension(80, 750));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton10.setText("Category");
        jButton10.setMaximumSize(new java.awt.Dimension(65, 23));
        jButton10.setMinimumSize(new java.awt.Dimension(65, 23));
        jButton10.setPreferredSize(new java.awt.Dimension(65, 23));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, 63, 70));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 63, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Connection getConnection()
    {
        Connection conn = null;

        String hostName = "ec2-54-163-240-54.compute-1.amazonaws.com";
        String dbName = "d89l9begjikklj";
        String userName = "isscllglmxgeln";
        String password = "334f696049572d4bc9c3b6b78c3410301e24dd3b5fd2b96dc15bf4c1c6fed113";

        try
        {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://" + hostName + "/" + dbName + "?user=" + userName + "&password=" + password + "&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
            conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(Exception e)
        {
            e.printStackTrace();

            return null;
        }
    }
    
    private void insertCategory()
    {
        try
        {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO categories (category) VALUES (?)");
            ps.setString(1, categoryName.getText());
            ps.executeUpdate();
            ps.close();

            con.close();
            
            getCategories();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void updateCategory()
    {
        try
        {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE categories set category = ? where category = ?");
            ps.setString(1, categoryName.getText());
            ps.setString(2, jlstCategories.getSelectedValue());
            ps.executeUpdate();
            ps.close();

            con.close();
            
            getCategories();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void deleteCategory()
    {
        try
        {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM categories where category = ?");
            ps.setString(1, jlstCategories.getSelectedValue());
            ps.executeUpdate();
            ps.close();

            con.close();
            
            getCategories();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void getCategories()
    {
        try
        {
            Connection con = getConnection();
        
            PreparedStatement ps = con.prepareStatement(
                    "select category from categories order by category asc"
            );
            ResultSet rs = ps.executeQuery();
            categories.clear();
            while(rs.next())
            {
                categories.add(rs.getString("category"));
            }
            rs.close();
            ps.close();
            
            con.close();
            
            jlstCategories.setListData(categories);
            
            System.out.println(categories.size());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categories().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void categoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNameActionPerformed

    private void jbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertActionPerformed
        if(!categoryName.getText().equals("all"))
            insertCategory();
    }//GEN-LAST:event_jbtnInsertActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        if(!jlstCategories.getSelectedValue().equals("all"))
            updateCategory();
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        if(!jlstCategories.getSelectedValue().equals("all"))
            deleteCategory();
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String category = "";
                category = jlstCategories.getSelectedValue();
                if(category != null)
                {
                    new ProductService(category, null).setVisible(true);
                }
                else
                {
                    new ProductService("all", null).setVisible(true);
                }
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoryName;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnInsert;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JList<String> jlstCategories;
    // End of variables declaration//GEN-END:variables
}
