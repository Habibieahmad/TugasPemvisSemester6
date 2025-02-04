/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.Connect;
import config.ScrollBarCustom;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author  Habibie Ahmad
 */
public class FormReportDataPenilaianKinerjaKaryawan extends javax.swing.JFrame {
    private Connection conn = new Connect().dbConnection();
    private DefaultTableModel tabmode;
    Icon iconError = new javax.swing.ImageIcon(getClass().getResource("/images/icon-message-error.png"));    
    /**
     * Creates new form FormLaporanStokBarang
     */
    public FormReportDataPenilaianKinerjaKaryawan() {
        initComponents();
        setIconFrame();
        scrollBarUI();
        dataPenilaianKinerjaKaryawan();
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
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
        tPenilaianKinerjaKaryawan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKP = new javax.swing.JTextField();
        bCetak1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bCetakSemua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMin = new javax.swing.JLabel();
        jExt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Data Customer");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tPenilaianKinerjaKaryawan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tPenilaianKinerjaKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PENILAIAN", "NIP", "NAMA", "JABATAN", "N1", "N2", "N3", "xN1", "xN2", "xN3", "xNTOTAL"
            }
        ));
        tPenilaianKinerjaKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tPenilaianKinerjaKaryawan.setFocusable(false);
        tPenilaianKinerjaKaryawan.setOpaque(false);
        tPenilaianKinerjaKaryawan.setRowHeight(30);
        tPenilaianKinerjaKaryawan.setRowMargin(2);
        tPenilaianKinerjaKaryawan.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tPenilaianKinerjaKaryawan.getTableHeader().setReorderingAllowed(false);
        tPenilaianKinerjaKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPenilaianKinerjaKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPenilaianKinerjaKaryawan);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CETAK DATA PERORANGAN");

        jLabel1.setText("Kode Penilaian");

        bCetak1.setBackground(new java.awt.Color(0, 0, 0));
        bCetak1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCetak1.setForeground(new java.awt.Color(255, 255, 255));
        bCetak1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-print-white.png"))); // NOI18N
        bCetak1.setText(" CETAK ");
        bCetak1.setBorder(null);
        bCetak1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCetak1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCetak1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCetak1MouseExited(evt);
            }
        });
        bCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetak1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(bCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bCetak1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        bCetakSemua.setBackground(new java.awt.Color(0, 0, 0));
        bCetakSemua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCetakSemua.setForeground(new java.awt.Color(255, 255, 255));
        bCetakSemua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-print-white.png"))); // NOI18N
        bCetakSemua.setText(" CETAK ");
        bCetakSemua.setBorder(null);
        bCetakSemua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCetakSemua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCetakSemuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCetakSemuaMouseExited(evt);
            }
        });
        bCetakSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakSemuaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CETAK SEMUA DATA ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(bCetakSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCetakSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMin.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jMin.setForeground(new java.awt.Color(255, 255, 255));
        jMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMin.setText("-");
        jMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMinMouseExited(evt);
            }
        });
        jPanel2.add(jMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 20, 26));

        jExt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jExt.setForeground(new java.awt.Color(255, 255, 255));
        jExt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jExt.setText("X");
        jExt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jExtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jExtMouseExited(evt);
            }
        });
        jPanel2.add(jExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 20, 26));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LAPORAN DATA PENILAIAN KINERJA KARYAWAN");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconFrame(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon-logo.png")));
    }
    
    private void scrollBarUI(){
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());        
        jScrollPane1.setHorizontalScrollBar(sp);
    } 
    
    private void dataPenilaianKinerjaKaryawan(){
        Object[] Baris ={"KODE PENILAIAN","NIP","NAMA","JABATAN","N1","N2","N3","xN1","xN2","xN3","xNTotal"};
        tabmode = new DefaultTableModel(null, Baris);
        try {
            String sql = "SELECT t1.kode_penilaian,t1.nip_karyawan,t2.nama,t2.jabatan,t1.n1,t1.n2,t1.n3,t1.xn1,t1.xn2,t1.xn3,t1.xntotal FROM penilaian_kinerja_karyawan t1 INNER JOIN karyawan t2 ON t1.nip_karyawan = t2.nip ORDER BY t1.xntotal DESC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6),
                    hasil.getString(7),
                    hasil.getString(8),
                    hasil.getString(9),
                    hasil.getString(10),            
                    hasil.getString(11)            
                });
            }
            tPenilaianKinerjaKaryawan.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
    }
    private void jMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(FormReportDataPenilaianKinerjaKaryawan.ICONIFIED);
    }//GEN-LAST:event_jMinMouseClicked

    private void jMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseEntered
        // TODO add your handling code here:
        jMin.setForeground(Color.RED);
    }//GEN-LAST:event_jMinMouseEntered

    private void jMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseExited
        // TODO add your handling code here:
        jMin.setForeground(Color.WHITE);
    }//GEN-LAST:event_jMinMouseExited

    private void jExtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jExtMouseClicked

    private void jExtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseEntered
        // TODO add your handling code here:
        jExt.setForeground(Color.RED);
    }//GEN-LAST:event_jExtMouseEntered

    private void jExtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtMouseExited
        // TODO add your handling code here:
        jExt.setForeground(Color.WHITE);
    }//GEN-LAST:event_jExtMouseExited

    private void bCetakSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakSemuaActionPerformed
        // TODO add your handling code here:
         try {
            HashMap parameter=new HashMap();
            File file = new File("src/reports/reportPenilaianKinerjaKaryawan.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            net.sf.jasperreports.engine.JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint jp = JasperFillManager.fillReport(JasperReport, parameter,conn );
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Data tidak dapat dicetak!"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }    
    }//GEN-LAST:event_bCetakSemuaActionPerformed

    private void bCetakSemuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetakSemuaMouseEntered
        // TODO add your handling code here:
        bCetakSemua.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bCetakSemuaMouseEntered

    private void bCetakSemuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetakSemuaMouseExited
        // TODO add your handling code here:
        bCetakSemua.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_bCetakSemuaMouseExited

    private void bCetak1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetak1MouseEntered
        // TODO add your handling code here:
        bCetak1.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bCetak1MouseEntered

    private void bCetak1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCetak1MouseExited
        // TODO add your handling code here:
        bCetak1.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_bCetak1MouseExited

    private void bCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetak1ActionPerformed
        // TODO add your handling code here:
        try {
            HashMap parameter=new HashMap();            
            parameter.put("kdp",txtKP.getText());
            File file = new File("src/reports/reportNilaiPeroranganKaryawan.jrxml");
            JasperDesign JasperDesign = JRXmlLoader.load(file);
            net.sf.jasperreports.engine.JasperReport JasperReport = JasperCompileManager.compileReport(JasperDesign);
            JasperPrint jp = JasperFillManager.fillReport(JasperReport, parameter,conn );
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Data tidak dapat dicetak!"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }     
    }//GEN-LAST:event_bCetak1ActionPerformed

    private void tPenilaianKinerjaKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPenilaianKinerjaKaryawanMouseClicked
        // TODO add your handling code here:
        int row = tPenilaianKinerjaKaryawan.getSelectedRow();        
        String kp = tabmode.getValueAt(row, 0).toString();        
        txtKP.setText(kp);
    }//GEN-LAST:event_tPenilaianKinerjaKaryawanMouseClicked

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
            java.util.logging.Logger.getLogger(FormReportDataPenilaianKinerjaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReportDataPenilaianKinerjaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReportDataPenilaianKinerjaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReportDataPenilaianKinerjaKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReportDataPenilaianKinerjaKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak1;
    private javax.swing.JButton bCetakSemua;
    private javax.swing.JLabel jExt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tPenilaianKinerjaKaryawan;
    private javax.swing.JTextField txtKP;
    // End of variables declaration//GEN-END:variables
}
