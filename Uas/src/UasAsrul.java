/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
import static javax.swing.JOptionPane.showMessageDialog;
public class UasAsrul extends javax.swing.JFrame {

    /**
     * Creates new form UasAsrul
     */
        public UasAsrul() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBarang1 = new javax.swing.JRadioButton();
        jBarang2 = new javax.swing.JRadioButton();
        jBarang3 = new javax.swing.JRadioButton();
        jJb1 = new javax.swing.JTextField();
        jHbd1 = new javax.swing.JTextField();
        jTh1 = new javax.swing.JTextField();
        jHb1 = new javax.swing.JTextField();
        jHb2 = new javax.swing.JTextField();
        jHb3 = new javax.swing.JTextField();
        jJb2 = new javax.swing.JTextField();
        jJb3 = new javax.swing.JTextField();
        jHbd2 = new javax.swing.JTextField();
        jHbd3 = new javax.swing.JTextField();
        jTh2 = new javax.swing.JTextField();
        jTh3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTotal = new javax.swing.JButton();
        jButtonuangakhir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBayar = new javax.swing.JTextField();
        jUakhir = new javax.swing.JTextField();
        jHapus = new javax.swing.JButton();
        jKeluar = new javax.swing.JButton();
        jTbayar = new javax.swing.JTextField();
        jDis5persen = new javax.swing.JTextField();
        jBayarAkhir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("MINI KASIR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Harga Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jumlah Barang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Harga Barang Diskon");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Harga");

        jBarang1.setText("Barang 1");
        jBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBarang1ActionPerformed(evt);
            }
        });

        jBarang2.setText("Barang 2");
        jBarang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBarang2ActionPerformed(evt);
            }
        });

        jBarang3.setText("Barang 3");
        jBarang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBarang3ActionPerformed(evt);
            }
        });

        jHbd1.setEditable(false);
        jHbd1.setBackground(new java.awt.Color(204, 204, 255));

        jTh1.setEditable(false);
        jTh1.setBackground(new java.awt.Color(204, 204, 255));

        jHb1.setEditable(false);
        jHb1.setBackground(new java.awt.Color(204, 204, 255));
        jHb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHb1ActionPerformed(evt);
            }
        });

        jHb2.setEditable(false);
        jHb2.setBackground(new java.awt.Color(204, 204, 255));
        jHb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHb2ActionPerformed(evt);
            }
        });

        jHb3.setEditable(false);
        jHb3.setBackground(new java.awt.Color(204, 204, 255));

        jHbd2.setEditable(false);
        jHbd2.setBackground(new java.awt.Color(204, 204, 255));

        jHbd3.setEditable(false);
        jHbd3.setBackground(new java.awt.Color(204, 204, 255));

        jTh2.setEditable(false);
        jTh2.setBackground(new java.awt.Color(204, 204, 255));

        jTh3.setEditable(false);
        jTh3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Pembayaran");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Diskon 5% Jika Pembelian diatas 1.000.000");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Pembayaran stelah diskon");

        jTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTotal.setText("Total");
        jTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalActionPerformed(evt);
            }
        });

        jButtonuangakhir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonuangakhir.setText("Uang Akhir");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Bayar");

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Uang Akhir");

        jUakhir.setEditable(false);
        jUakhir.setBackground(new java.awt.Color(204, 204, 255));

        jHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jHapus.setText("Hapus Semua");

        jKeluar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKeluar.setText("Keluar");

        jTbayar.setEditable(false);
        jTbayar.setBackground(new java.awt.Color(204, 204, 255));

        jDis5persen.setEditable(false);
        jDis5persen.setBackground(new java.awt.Color(204, 204, 255));

        jBayarAkhir.setEditable(false);
        jBayarAkhir.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonuangakhir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jHapus)
                                    .addComponent(jKeluar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jHb3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jBarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jHb2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jHb1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3)
                                                .addComponent(jJb1)
                                                .addComponent(jJb2)
                                                .addComponent(jJb3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))))
                                .addGap(30, 49, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jHbd1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jHbd3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jHbd2, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addComponent(jTh1)
                            .addComponent(jTh2)
                            .addComponent(jTh3)
                            .addComponent(jBayar)
                            .addComponent(jUakhir)
                            .addComponent(jTbayar)
                            .addComponent(jDis5persen)
                            .addComponent(jBayarAkhir))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBarang1)
                    .addComponent(jJb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHbd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBarang2)
                    .addComponent(jHb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jJb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHbd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBarang3)
                        .addComponent(jHb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jJb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jHbd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jDis5persen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jBayarAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jUakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonuangakhir)
                    .addComponent(jKeluar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jBarang1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double hrgb1 = 25.000;
        if (jBarang1.isSelected()){
            jHb1.setText(String.valueOf(hrgb1));
        }
        else{
            jHb1.setText(String.valueOf("0"));
        }
    }                                        

    private void jBarang3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double hrgb3 = 75.000;
        if (jBarang3.isSelected()){
            jHb3.setText(String.valueOf(hrgb3));
        }
        else{
            jHb1.setText(String.valueOf("0"));
        }
    }                                        

    private void jTotalActionPerformed(java.awt.event.ActionEvent evt) {                                       
       double jmlb1 = 0, jmlb2 = 0, jmlb3 = 0, byr = 0, hrgb1 = 25.000, hrgb2 = 50.000, hrgb3 = 75.000, dsk1persen = 0.01, hrgDiskon1persen, hrgTotal;
        try{
           jmlb1 = Double.parseDouble(jJb1.getText());
           jmlb2 = Double.parseDouble(jJb2.getText());
           jmlb3 = Double.parseDouble(jJb3.getText());
       }catch(Exception err){
           showMessageDialog( null,  "This is even shorter");   
       }
        
        if (jmlb1 >= 50){
            hrgTotal = hrgb1 * jmlb1 - dsk1persen;
            hrgDiskon1persen = hrgb1 * dsk1persen;
            jTh1.setText(String.valueOf(hrgTotal));
        }
        else{
            hrgTotal = hrgb1 * jmlb1;
            jTh1.setText(String.valueOf(hrgTotal));
        }
        if (jmlb2 >= 50){
            hrgTotal = hrgb2 * jmlb2 - dsk1persen;
            hrgDiskon1persen = hrgb2 * dsk1persen;
            jTh2.setText(String.valueOf(hrgTotal));
        }
        else{
            hrgTotal = hrgb2 * jmlb1;
            jTh2.setText(String.valueOf(hrgTotal));
        }
        if (jmlb2 >= 50){
            hrgTotal = hrgb3 * jmlb3 - dsk1persen;
            hrgDiskon1persen = hrgb3 * dsk1persen;
            jTh3.setText(String.valueOf(hrgTotal));
        }
        else{
            hrgTotal = hrgb3 * jmlb1;
            jTh3.setText(String.valueOf(hrgTotal));
        }
        
        double tHarga1, tHarga2, tHarga3, tPembayaran, tDis5per = 0, dis5per = 0.05, results;
                tHarga1 = Double.parseDouble(jTh1.getText());
                tHarga2 = Double.parseDouble(jTh2.getText());
                tHarga3 = Double.parseDouble(jTh3.getText());
                tPembayaran = tHarga1 + tHarga2 + tHarga3;
                jTbayar.setText(String.valueOf(tPembayaran));
                if (tPembayaran >= 1000000) {
                    tDis5per = tPembayaran * dis5per;
                    jDis5persen.setText(String.valueOf(tDis5per));
                    results = tPembayaran - tDis5per;
                    jBayarAkhir.setText(String.valueOf(results));
                }else{
                    jBayarAkhir.setText(String.valueOf(tPembayaran));
                }
    }                                      

    private void jHb2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jHb1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jBarang2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    double hrgb2 = 50.000;
        if (jBarang2.isSelected()){
            jHb2.setText(String.valueOf(hrgb2));
        }
        else{
            jHb2.setText(String.valueOf("0"));
        }
    }                                        

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
            java.util.logging.Logger.getLogger(UasAsrul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UasAsrul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UasAsrul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UasAsrul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UasAsrul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton jBarang1;
    private javax.swing.JRadioButton jBarang2;
    private javax.swing.JRadioButton jBarang3;
    private javax.swing.JTextField jBayar;
    private javax.swing.JTextField jBayarAkhir;
    private javax.swing.JButton jButtonuangakhir;
    private javax.swing.JTextField jDis5persen;
    private javax.swing.JButton jHapus;
    private javax.swing.JTextField jHb1;
    private javax.swing.JTextField jHb2;
    private javax.swing.JTextField jHb3;
    private javax.swing.JTextField jHbd1;
    private javax.swing.JTextField jHbd2;
    private javax.swing.JTextField jHbd3;
    private javax.swing.JTextField jJb1;
    private javax.swing.JTextField jJb2;
    private javax.swing.JTextField jJb3;
    private javax.swing.JButton jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTbayar;
    private javax.swing.JTextField jTh1;
    private javax.swing.JTextField jTh2;
    private javax.swing.JTextField jTh3;
    private javax.swing.JButton jTotal;
    private javax.swing.JTextField jUakhir;
    // End of variables declaration                   
}
