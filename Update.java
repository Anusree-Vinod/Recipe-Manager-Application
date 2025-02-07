/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reciepe.manager.application;

import dao.Categorydao;
import model.Recipe;
import dao.Recipedao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Category;

/**
 *
 * @author anusr
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    
    public Update() {
        initComponents();
        ubtn.setEnabled(false);
        dbtn.setEnabled(false);
    }
    public void validateFieds()
    {
        String s=txtid.getText();
        if(!s.equals(""))
        {
            ubtn.setEnabled(true);
        }
        else
        {
            ubtn.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttil = new javax.swing.JTextField();
        txtpt = new javax.swing.JTextField();
        txtct = new javax.swing.JTextField();
        txtdis = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ubtn = new javax.swing.JButton();
        dbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Recipe ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Title");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 83, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 220, 83, 22));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Prep Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 254, 100, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cooking Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 292, 100, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Discription");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 329, 100, 25));

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidKeyReleased(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 141, 187, -1));
        getContentPane().add(txttil, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 184, 187, -1));
        getContentPane().add(txtpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 256, 187, -1));
        getContentPane().add(txtct, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 293, 187, -1));
        getContentPane().add(txtdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 330, 187, -1));

        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 220, 187, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Category", "Prep Time", "Cooking Time", "Discription"
            }
        ));
        jTable1.setRowHeight(50);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 67, 907, -1));

        ubtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ubtn.setText("Update");
        ubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubtnActionPerformed(evt);
            }
        });
        getContentPane().add(ubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        dbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dbtn.setText("Delete");
        dbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtnActionPerformed(evt);
            }
        });
        getContentPane().add(dbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbtn.setText("Clear");
        cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Add new category");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbtn)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(cbtn)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(267, 267, 267))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 690, 860));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HD-wallpaper-chocolate-ka-chocolate-bar.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -80, 810, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubtnActionPerformed
Recipe r=new Recipe();
r.setRecid(txtid.getText());
r.setTitle(txttil.getText());
r.setId((String)cat.getSelectedItem());
r.setPreptime(txtpt.getText());
r.setCtime(txtct.getText());
r.setDisc(txtdis.getText());
Recipedao.update(r);
setVisible(false);
new Update().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ubtnActionPerformed

    private void dbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtnActionPerformed
String id= txtid.getText();
int a = JOptionPane.showConfirmDialog(null,"Do you want to delete this Recipe","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            Recipedao.delete(id);
            setVisible(false);
            new Update().setVisible(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_dbtnActionPerformed

    private void txtidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyReleased
validateFieds();        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        ArrayList<Recipe> list = Recipedao.getAllRecords();
        Iterator<Recipe> itr= list.iterator();
        while(itr.hasNext())
        {
            Recipe robj= itr.next();
            dtm.addRow(new Object[] {robj.getRecid(),robj.getTitle(),robj.getId(),robj.getPreptime(),robj.getCtime(),robj.getDisc()});
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    
        int index=jTable1.getSelectedRow();
        TableModel model= jTable1.getModel();
        String id= model.getValueAt(index,0).toString();
        txtid.setText(id);
        String n=model.getValueAt(index,1).toString();
        txttil.setText(n);
        String c=model.getValueAt(index,2).toString();
        String p=model.getValueAt(index,3).toString();
        txtpt.setText(p);
        String co=model.getValueAt(index,4).toString();
        txtct.setText(co);
        String d=model.getValueAt(index,5).toString();
        txtdis.setText(d);
        ubtn.setEnabled(true);
        dbtn.setEnabled(true);
        cat.removeAllItems();
        cat.addItem(c);
        ArrayList<Category> categoryList= Categorydao.getAllRecords();
        Iterator<Category> categoryitr= categoryList.iterator();
        while(categoryitr.hasNext())
        {
            Category cobj= categoryitr.next();
            if(!cobj.getId().equals(c))
            {
                cat.addItem(cobj.getId());
            }
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnActionPerformed
setVisible(false);
            new Update().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
            new home().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
    new Newcategory().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JButton cbtn;
    private javax.swing.JButton dbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtct;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpt;
    private javax.swing.JTextField txttil;
    private javax.swing.JButton ubtn;
    // End of variables declaration//GEN-END:variables
}
