/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Data.form_Pembayaran;
import koneksi.koneksi;
/**
 *
 * @author IronMan
 */
public class popup_pemesanan extends javax.swing.JFrame {
private Connection conn = new koneksi ().connect();
    private DefaultTableModel tabmode;

    public form_Pembayaran sis = null;
    /**
     * Creates new form popup_pemesanan
     */
    public popup_pemesanan() {
        initComponents();
        datatable();
    }
 protected void datatable(){
        Object[] baris ={"Kode Barang","Nama Barang","Harga Barang","Jumlah Barang"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_pemesanan.setModel(tabmode);
        String sql = "select * from data_pemesanan";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String f = hasil.getString("kode_barang");
                String g = hasil.getString("nama_barang");
                String h = hasil.getString("harga_barang");
                String i = hasil.getString("jumlah_barang");
                
                String[] data={f,g,h,i};
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pemesanan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tabel Pemesanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 240, 30));

        tabel_pemesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pemesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_pemesanan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 490, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        setSize(new java.awt.Dimension(616, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_pemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pemesananMouseClicked
        // TODO add your handling code here:
        int tabelpemesanan = tabel_pemesanan.getSelectedRow();
        //untuk form pembayaran
        sis.kode = tabel_pemesanan.getValueAt(tabelpemesanan, 0).toString();
        sis.brg = tabel_pemesanan.getValueAt(tabelpemesanan, 1).toString();
        sis.harga = tabel_pemesanan.getValueAt(tabelpemesanan, 2).toString();
        sis.jml = tabel_pemesanan.getValueAt(tabelpemesanan, 3).toString();
        sis.itemterpilihpesanan();
        this.dispose();
    }//GEN-LAST:event_tabel_pemesananMouseClicked

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
            java.util.logging.Logger.getLogger(popup_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popup_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popup_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popup_pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popup_pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabel_pemesanan;
    // End of variables declaration//GEN-END:variables
}
