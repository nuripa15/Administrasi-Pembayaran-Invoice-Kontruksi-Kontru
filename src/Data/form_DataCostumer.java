/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Luthfiani
 */
public class form_DataCostumer extends javax.swing.JFrame {
     private final Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form form_DataCostumer
     */
    public form_DataCostumer() {
        initComponents();
        datatable();
    }
    protected void aktif(){
        tcos.setEnabled(true);
        tnama.setEnabled(true);
        tperusahaan.setEnabled(true);
        talamat.setText("");
        tno.setText("");
        temail.setText("");
        tcos.requestFocus();
        }
    protected void kosong(){
        tcos.setText("");
        tnama.setText("");
        tperusahaan.setText("");
        talamat.setText("");
        tno.setText("");
        temail.setText("");
    }
         
    protected void datatable(){
        Object[] baris ={"ID Costumer","Nama","Perusahaan","Alamat Perusahaan","No Telepon","Email"};
        tabmode = new DefaultTableModel(null, baris);
        tablecostumer.setModel(tabmode);
        String sql = "select * from data_costumer";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("ID");
                String b = hasil.getString("Nama");
                String c = hasil.getString("Perusahaan");
                String d = hasil.getString("Alamat");
                String e = hasil.getString("NoTelp");
                String f = hasil.getString("Email");
                
                String[] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }     
        }catch (Exception e){
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tablecostumer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tperusahaan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tcos = new javax.swing.JTextField();
        Bsave = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablecostumer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablecostumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecostumerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablecostumer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 610, 120));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Costumer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        jPanel1.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Perusahaan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(tperusahaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat Perusahaan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        talamat.setColumns(20);
        talamat.setRows(5);
        jScrollPane1.setViewportView(talamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Telepon");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel1.add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Costumer");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(tcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        Bsave.setBackground(new java.awt.Color(153, 153, 153));
        Bsave.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Bsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Save_1.png"))); // NOI18N
        Bsave.setText("Simpan");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });
        jPanel1.add(Bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, 30));

        Bedit.setBackground(new java.awt.Color(153, 153, 153));
        Bedit.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Edit.png"))); // NOI18N
        Bedit.setText("Ubah");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        jPanel1.add(Bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Delete.png"))); // NOI18N
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 90, 30));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Clear.png"))); // NOI18N
        jButton4.setText("Bersih");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 30));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exit.png"))); // NOI18N
        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 90, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ic home.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 230));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 2, 24)); // NOI18N
        jLabel3.setText("Data Costumer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });
        getContentPane().add(tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 180, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cari.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo_rajawali-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/formCostumer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 380));

        setSize(new java.awt.Dimension(677, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into data_costumer values (?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1,Integer.parseInt (tcos.getText()));
            stat.setString(2, tnama.getText());
            stat.setString(3, tperusahaan.getText());
            stat.setString(4, talamat.getText());
            stat.setString(5, tno.getText());
            stat.setString(6, temail.getText());
           
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            tcos.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan" +e);
        }
    }//GEN-LAST:event_BsaveActionPerformed

    private void tablecostumerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecostumerMouseClicked
        // TODO add your handling code here:
        int bar;
         bar = tablecostumer.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
       
        tcos.setText(a);
        tnama.setText(b);
        tperusahaan.setText(c);
        talamat.setText(d);
        tno.setText(e);
        temail.setText(f);
      
    }//GEN-LAST:event_tablecostumerMouseClicked

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
        // TODO add your handling code here:
        try{
         String sql = "update data_costumer set Nama=?,Perusahaan=?,Alamat=?,NoTelp=?,Email=? where ID=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            
            stat.setString(1, tnama.getText());
            stat.setString(2, tperusahaan.getText());
            stat.setString(3, talamat.getText());
            stat.setString(4, tno.getText());
            stat.setString(5, temail.getText());
            stat.setInt(6,Integer.parseInt (tcos.getText()));
        
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil diubah");
            kosong();
            tcos.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah" +e);
        }  
    }//GEN-LAST:event_BeditActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus","konfirmasi dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from data_costumer where ID ='"+tcos.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "data berhasil dihapus");
                tcos.requestFocus();
            datatable();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus" +e);
        }}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         kosong();
        datatable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu_utamaa mn = new menu_utamaa();
        dispose();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object[] Baris ={"ID Costumer","Nama","Perusahaan","Alamat Perusahaan","No Telepon","Email"};
       tabmode = new DefaultTableModel (null, Baris);
       tablecostumer.setModel (tabmode);
       String sql = "select * from data_costumer where ID='"+tcari.getText()+"'";
       try {
           java.sql.Statement stat = conn.createStatement ();
           ResultSet hasil = stat.executeQuery(sql);
           while (hasil.next()) {
               String a = hasil.getString ("ID");
               String b = hasil.getString ("Nama");
               String c = hasil.getString ("Perusahaan");
               String d = hasil.getString ("Alamat");
               String e = hasil.getString ("NoTelp");
               String f = hasil.getString ("Email");
               String[] data={a,b,c,d,e,f};
               tabmode.addRow (data);
           }
           } catch (Exception e) {
       }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode () == KeyEvent.VK_ENTER){
            datatable();
        }
    }//GEN-LAST:event_tcariKeyPressed

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
        // TODO add your handling code here:
        Object[] Baris ={"ID Costumer","Nama","Perusahaan","Alamat Perusahaan","No Telepon","Email"};
       tabmode = new DefaultTableModel (null, Baris);
       tablecostumer.setModel (tabmode);
       String sql = "select * from data_costumer where ID='"+tcari.getText()+"'";
       try {
           java.sql.Statement stat = conn.createStatement ();
           ResultSet hasil = stat.executeQuery(sql);
           while (hasil.next()) {
               String a = hasil.getString ("ID");
               String b = hasil.getString ("Nama");
               String c = hasil.getString ("Perusahaan");
               String d = hasil.getString ("Alamat");
               String e = hasil.getString ("NoTelp");
               String f = hasil.getString ("Email");
               String[] data={a,b,c,d,e,f};
               tabmode.addRow (data);
           }
           } catch (Exception e) {
       }       
    }//GEN-LAST:event_tcariKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(form_DataCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_DataCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_DataCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_DataCostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_DataCostumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablecostumer;
    private javax.swing.JTextArea talamat;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tcos;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tperusahaan;
    // End of variables declaration//GEN-END:variables
}
