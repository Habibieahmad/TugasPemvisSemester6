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
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import static views.FormAsuransiPensiun.PHONE_VERIFYCATION;

/**
 *
 * @author dimasamirkusuma
 */
public class FormAsuransiPensiun extends javax.swing.JFrame {
    private Connection conn = new Connect().dbConnection();
    private DefaultTableModel tabmode;
    Icon iconQuestion = new javax.swing.ImageIcon(getClass().getResource("/images/icon-message-question.png"));    
    Icon iconSuccess = new javax.swing.ImageIcon(getClass().getResource("/images/icon-message-success.png"));    
    Icon iconError = new javax.swing.ImageIcon(getClass().getResource("/images/icon-message-error.png"));    
    public static final String PHONE_VERIFYCATION = "\\d+";
    /**
     * Creates new form FormDataPenjualan
     */
    public FormAsuransiPensiun() {
        initComponents();
        setIconFrame();
        scrollBarUI();
        NoKaryawan();
        dataKaryawan();
        buttonAwal(true);
    }

   
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jExt = new javax.swing.JLabel();
        jMin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKaryawan = new javax.swing.JTable();
        pSearch = new javax.swing.JPanel();
        tSearch = new javax.swing.JTextField();
        pS = new javax.swing.JPanel();
        iSearch = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtNoHp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jJk = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTglLahir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA CUSTOMER");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExt.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 26));

        jMin.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 20, 26));

        jLabel9.setBackground(new java.awt.Color(153, 255, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DATA CUSTOMER ASURANSI INDIVIDU");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 780, 64));
        jLabel9.getAccessibleContext().setAccessibleName("DATA KARYAWAN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Nama");

        jLabel3.setText("No. Handphone");

        jLabel4.setText("Alamat");

        bTambah.setBackground(new java.awt.Color(0, 0, 0));
        bTambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bTambah.setForeground(new java.awt.Color(255, 255, 255));
        bTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-plus.png"))); // NOI18N
        bTambah.setText(" TAMBAH");
        bTambah.setBorder(null);
        bTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bTambahMouseExited(evt);
            }
        });
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bEdit.setBackground(new java.awt.Color(0, 0, 0));
        bEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bEdit.setForeground(new java.awt.Color(255, 255, 255));
        bEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-edit.png"))); // NOI18N
        bEdit.setText(" UBAH");
        bEdit.setBorder(null);
        bEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEditMouseExited(evt);
            }
        });
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bHapus.setBackground(new java.awt.Color(0, 0, 0));
        bHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bHapus.setForeground(new java.awt.Color(255, 255, 255));
        bHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-trash.png"))); // NOI18N
        bHapus.setText(" HAPUS");
        bHapus.setBorder(null);
        bHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bHapusMouseExited(evt);
            }
        });
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(0, 0, 0));
        bReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bReset.setForeground(new java.awt.Color(255, 255, 255));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-reset.png"))); // NOI18N
        bReset.setText(" RESET");
        bReset.setBorder(null);
        bReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bResetMouseExited(evt);
            }
        });
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        tKaryawan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No Polis.", "NAMA", "JENIS KELAMIN", "TGL LAHIR", "NO. HANDPHONE", "ALAMAT"
            }
        ));
        tKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tKaryawan.setFocusable(false);
        tKaryawan.setOpaque(false);
        tKaryawan.setRowHeight(30);
        tKaryawan.setRowMargin(2);
        tKaryawan.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tKaryawan.getTableHeader().setReorderingAllowed(false);
        tKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tKaryawan);
        if (tKaryawan.getColumnModel().getColumnCount() > 0) {
            tKaryawan.getColumnModel().getColumn(0).setPreferredWidth(120);
            tKaryawan.getColumnModel().getColumn(1).setPreferredWidth(350);
            tKaryawan.getColumnModel().getColumn(2).setPreferredWidth(50);
            tKaryawan.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        pSearch.setBackground(new java.awt.Color(25, 25, 25));
        pSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pSearch.setPreferredSize(new java.awt.Dimension(275, 25));
        pSearch.setLayout(null);

        tSearch.setForeground(new java.awt.Color(153, 153, 153));
        tSearch.setText("Search...");
        tSearch.setBorder(null);
        tSearch.setSelectionColor(new java.awt.Color(255, 68, 56));
        tSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tSearchFocusLost(evt);
            }
        });
        tSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tSearchKeyPressed(evt);
            }
        });
        pSearch.add(tSearch);
        tSearch.setBounds(5, 0, 250, 25);

        pS.setBackground(new java.awt.Color(255, 255, 255));
        pS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pS.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pSLayout = new javax.swing.GroupLayout(pS);
        pS.setLayout(pSLayout);
        pSLayout.setHorizontalGroup(
            pSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        pSLayout.setVerticalGroup(
            pSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        pSearch.add(pS);
        pS.setBounds(0, 0, 260, 25);

        iSearch.setBackground(new java.awt.Color(25, 25, 25));
        iSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-search.png"))); // NOI18N
        iSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iSearchMouseExited(evt);
            }
        });
        pSearch.add(iSearch);
        iSearch.setBounds(260, 0, 25, 25);

        jLabel6.setText("No Polis ");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        txtNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoHpActionPerformed(evt);
            }
        });

        jLabel2.setText("Jenis Kelamin");

        jJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-Laki", "Perempuan" }));

        jLabel5.setText("Tgl Lahir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jJk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoHp, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTglLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTglLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoHp)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(pSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void setIconFrame(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/asuransi_jiwa_pertalife_pnsurance_logo.jpg")));
    }
    
    private void scrollBarUI(){
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());        
        jScrollPane1.setHorizontalScrollBar(sp);
    }
    
    private void buttonAwal(boolean t){
           bTambah.setEnabled(t);
           bEdit.setEnabled(!t);
           bHapus.setEnabled(!t);
    }
    
    private void NoKaryawan(){
        txtNip.setEnabled(false);
        try {
            String sql="SELECT * FROM pensiun ORDER BY No DESC";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            if (rs.next()) {
                String np = rs.getString("No").substring(3);
                String AN = "" + (Integer.parseInt(np) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "0000000";}
                else if(AN.length()==2)
                {Nol = "000000";}
                else if(AN.length()==3)
                {Nol = "00000";}
                else if(AN.length()==4)
                {Nol = "0000";}
                else if(AN.length()==5)
                {Nol = "000";}
                else if(AN.length()==6)
                {Nol = "00";}
                else if(AN.length()==7)
                {Nol = "0";}
                else if(AN.length()==8)
                {Nol = "";}
               txtNip.setText( Nol + AN);
            } else {
               txtNip.setText("00000001");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Kode Penjualan Failed!</b><br>"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }
    }
    
    private void tambahData(){
        String No = txtNip.getText();
        String nm = txtNama.getText();
        String no_hp = txtNoHp.getText();
        String jk = (String)jJk.getSelectedItem();
        String alamat = txtAlamat.getText();
           
        Pattern p = Pattern.compile(PHONE_VERIFYCATION);
        Matcher m = p.matcher(no_hp);  
        java.util.Date d = jTglLahir.getDate();
        String tglLahir = null;
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        if(d == null){
            d = new Date(0);            
        }else{
           tglLahir= fm.format(jTglLahir.getDate());
        }
        try {
            if(!No.equals("") && !nm.equals("") && !alamat.equals("") && !jk.equals("Pilih Jenis Kelamin") ){
                if(m.matches() && no_hp.length() >=8 && no_hp.length() <=13){                                                        
                    java.sql.Statement stmt = conn.createStatement();                    
                    String sql ="INSERT INTO pensiun VALUES('"+No+"','"+nm+"','"+jk+"','"+tglLahir+"','"+no_hp+"','"+alamat+"')";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Success!</b><br>Data berhasil ditambahkan.</p></html>","Success!",JOptionPane.INFORMATION_MESSAGE,iconSuccess);                                    
                    reset();                    
                }else{
                    JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Nomor Hp Harus Bertuliskan Angka (Dengan Minimal 8 Angka dan Maksimal 13 Angka).</p></html>", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);                                        
                }
            }else{
                JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Tidak boleh ada kolom yang masih belom terisi! Mohon check kembali.", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }
    }
    
    private void ubahData(){
        String No = txtNip.getText();
        String nm = txtNama.getText();
        String no_hp = txtNoHp.getText();
        String jk = (String)jJk.getSelectedItem();
        String alamat = txtAlamat.getText();
           
        Pattern p = Pattern.compile(PHONE_VERIFYCATION);
        Matcher m = p.matcher(no_hp);  
        java.util.Date d = jTglLahir.getDate();
        String tglLahir = null;
        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        if(d == null){
            d = new Date(0);            
        }else{
           tglLahir= fm.format(jTglLahir.getDate());
        }  
        try {
            if(!No.equals("") && !nm.equals("") && !alamat.equals("") && !jk.equals("Pilih Jenis Kelamin")){
                if(m.matches() && no_hp.length() >=8 && no_hp.length() <=13){                                                                                                
                    java.sql.Statement stmt = conn.createStatement();
                    String sql="UPDATE pensiun SET nama = '"+nm+"', jk = '"+jk+"', tgl_lahir = '"+tglLahir+"', no_hp = '"+no_hp+"', alamat= '"+alamat+"' WHERE No ='"+No+"'";                                                
                    stmt.executeUpdate(sql);                
                    JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Success!</b><br>Data berhasil diubah.</p></html>","Success!",JOptionPane.INFORMATION_MESSAGE,iconSuccess);
                    reset();                    
                }else{
                    JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Nomor Hp Harus Bertuliskan Angka (Dengan Minimal 8 Angka dan Maksimal 13 Angka).</p></html>", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);                                        
                }
            }else{
                JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>Tidak boleh ada kolom yang masih belom terisi! Mohon check kembali.", "Failed!", JOptionPane.ERROR_MESSAGE,iconError);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }
    }
        
    private void hapusData(){
        int a;
        String No = txtNip.getText();
        a=JOptionPane.showConfirmDialog(null, "<html><p style=\"font-size:11px; width:200px;\">Apakah anda yankin ingin menghapus data dengan <b>No Polis : "+No+"</b> ?</p></html>", "Hapus Data", JOptionPane. YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconQuestion);        
        if(a==JOptionPane.YES_OPTION){       
            try{
                String sql = "DELETE FROM pensiun WHERE No ='"+No+"'";
                java.sql.Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);            
                reset();
                JOptionPane.showMessageDialog(null, "<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Success!</b><br>Data dengan <b>No Polis : "+No+"</b> Berhasil dihapus.</p></html>","Success!",JOptionPane.INFORMATION_MESSAGE,iconSuccess);
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
            }
        }else {
            return;
        }        
    }
    
    private void cariData(){
        String keyword = tSearch.getText();
         Object[] Baris ={"No Polis","NAMA","JENIS KELAMIN","TGL LAHIR","NO. HANDPHONE","ALAMAT"};
        tabmode = new DefaultTableModel(null, Baris);
        try {
            String sql = "SELECT * FROM pensiun WHERE No LIKE '%"+keyword+"%' or nama LIKE '%"+keyword+"%' or alamat LIKE '%"+keyword+"%' ";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6)
                });
            }
            tKaryawan.setModel(tabmode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Failed!</b><br>"+e+"</p></html>","Failed!",JOptionPane.ERROR_MESSAGE,iconError);
        }                       
    }
    
    private void reset(){
        buttonAwal(true);
        txtNama.setText("");
        txtNoHp.setText("");
        jJk.setSelectedIndex(0);
        txtAlamat.setText("");
        tSearch.setText("Search...");
        jTglLahir.setDate(null);
             
        dataKaryawan();
        NoKaryawan();
    }
    
    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void iSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSearchMouseEntered
        // TODO add your handling code here:
        pSearch.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_iSearchMouseEntered

    private void iSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSearchMouseExited
        // TODO add your handling code here:
        pSearch.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_iSearchMouseExited

    private void tSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchFocusGained
        // TODO add your handling code here:
        if(tSearch.getText().equals("Search...")){            
            tSearch.setText("");
            tSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tSearchFocusGained

    private void tSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchFocusLost
        // TODO add your handling code here:
            if(tSearch.getText().equals("")){            
            tSearch.setText("Search...");
            tSearch.setForeground(new Color(153,153,153));
        }                                   
    }//GEN-LAST:event_tSearchFocusLost

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        tambahData();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        ubahData();
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        hapusData();
        
    }//GEN-LAST:event_bHapusActionPerformed

    private void iSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSearchMouseClicked
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_iSearchMouseClicked

    private void tSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cariData();
        }
    }//GEN-LAST:event_tSearchKeyPressed

    private void tKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tKaryawanMouseClicked
        // TODO add your handling code here:        
        int row = tKaryawan.getSelectedRow();
        try{            
            String No = tabmode.getValueAt(row, 0).toString();        
            txtNip.setText(No);
            String nama = tabmode.getValueAt(row, 1).toString();        
            txtNama.setText(nama);
            String jk = tabmode.getValueAt(row, 2).toString();        
            jJk.setSelectedItem(jk);
            String tglLahir = tabmode.getValueAt(row, 3).toString(); 
            java.util.Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse(tglLahir);
            jTglLahir.setDate(tgl);
            String noHp = tabmode.getValueAt(row, 4).toString();
            txtNoHp.setText(noHp);
            String alamat = tabmode.getValueAt(row, 5).toString();                
            txtAlamat.setText(alamat);
          
            buttonAwal(false);
        } catch (ParseException ex) {
            Logger.getLogger(FormAsuransiPensiun.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_tKaryawanMouseClicked

    private void jMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(FormAsuransiPensiun.ICONIFIED);
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

    private void bTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTambahMouseEntered
        // TODO add your handling code here:
        bTambah.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bTambahMouseEntered

    private void bTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTambahMouseExited
        // TODO add your handling code here:
        bTambah.setBackground(Color.BLACK);
    }//GEN-LAST:event_bTambahMouseExited

    private void bEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditMouseEntered
        // TODO add your handling code here:
        bEdit.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bEditMouseEntered

    private void bEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditMouseExited
        // TODO add your handling code here:
        bEdit.setBackground(Color.BLACK);
    }//GEN-LAST:event_bEditMouseExited

    private void bHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseEntered
        // TODO add your handling code here:
        bHapus.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bHapusMouseEntered

    private void bHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseExited
        // TODO add your handling code here:
        bHapus.setBackground(Color.BLACK);
    }//GEN-LAST:event_bHapusMouseExited

    private void bResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bResetMouseEntered
        // TODO add your handling code here:
        bReset.setBackground(new Color(15,15,15));
    }//GEN-LAST:event_bResetMouseEntered

    private void bResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bResetMouseExited
        // TODO add your handling code here:
        bReset.setBackground(Color.BLACK);
    }//GEN-LAST:event_bResetMouseExited

    private void txtNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoHpActionPerformed

    private void dataKaryawan(){
         Object[] Baris ={"No Polis","NAMA","JENIS KELAMIN","TGL LAHIR","NO. HANDPHONE","ALAMAT"};
        tabmode = new DefaultTableModel(null, Baris);
        try {
            String sql = "SELECT * FROM pensiun ORDER BY No ASC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6)
                    
                });
            }            
            tKaryawan.setModel(tabmode);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"<html><p style=\"font-size:11px; width:200px;\"><b style=\"font-size:14px;\">Table Customer Failed!</b><br>"+e+"</p></html>","Table Customer Failed!",JOptionPane.ERROR_MESSAGE,iconError);
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
            java.util.logging.Logger.getLogger(FormAsuransiPensiun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAsuransiPensiun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAsuransiPensiun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAsuransiPensiun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAsuransiPensiun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JLabel iSearch;
    private javax.swing.JLabel jExt;
    private javax.swing.JComboBox<String> jJk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jTglLahir;
    private javax.swing.JPanel pS;
    private javax.swing.JPanel pSearch;
    private javax.swing.JTable tKaryawan;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
