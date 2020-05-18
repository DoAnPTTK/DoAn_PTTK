/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doan;

/**
 *
 * @author MSI2
 */
public class QL_KH_GUI extends javax.swing.JFrame {

    /**
     * Creates new form QL_KH_GUI
     */
    public QL_KH_GUI() {
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

        bgnv = new javax.swing.JPanel();
        bg_thoat = new javax.swing.JPanel();
        text_trangchu7 = new javax.swing.JLabel();
        icon_trangchu7 = new javax.swing.JLabel();
        button_thoat = new javax.swing.JButton();
        bg_chuquan = new javax.swing.JPanel();
        bg_cafeomely = new javax.swing.JPanel();
        text_cafeomely = new javax.swing.JLabel();
        icon_cafe = new javax.swing.JLabel();
        icon_cafe1 = new javax.swing.JLabel();
        text_cafeomely1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboGt = new javax.swing.JComboBox<>();
        btnHuy = new javax.swing.JButton();
        txtTenkh = new javax.swing.JTextField();
        txtDtl = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgnv.setBackground(new java.awt.Color(255, 255, 255));
        bgnv.setMaximumSize(new java.awt.Dimension(1280, 1000));
        bgnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_thoat.setBackground(new java.awt.Color(85, 65, 118));

        text_trangchu7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        text_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_trangchu7.setText("Quản lý khách hàng");

        icon_trangchu7.setBackground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_trangchu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_customer_26px_1.png"))); // NOI18N
        icon_trangchu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_trangchu7.setOpaque(true);

        button_thoat.setBackground(new java.awt.Color(255, 255, 255));
        button_thoat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_thoat.setForeground(new java.awt.Color(204, 51, 0));
        button_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_back_arrow_30px.png"))); // NOI18N
        button_thoat.setText("Thoát");
        button_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        button_thoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thoatLayout = new javax.swing.GroupLayout(bg_thoat);
        bg_thoat.setLayout(bg_thoatLayout);
        bg_thoatLayout.setHorizontalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addComponent(icon_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                .addComponent(button_thoat)
                .addContainerGap())
        );
        bg_thoatLayout.setVerticalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(button_thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(icon_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgnv.add(bg_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        bg_chuquan.setBackground(new java.awt.Color(54, 33, 89));
        bg_chuquan.setToolTipText("");
        bg_chuquan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cafeomely.setBackground(new java.awt.Color(85, 65, 118));
        bg_cafeomely.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_cafeomely.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_cafeomely.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely.setText("Đ/C: Thị trấn Phú Phong, huyện Tây Sơn, tỉnh Bình Định.");
        bg_cafeomely.add(text_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 0, 523, 56));

        icon_cafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_address_50px_1.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 79, 56));

        icon_cafe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_cafe_50px.png"))); // NOI18N
        bg_cafeomely.add(icon_cafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 79, 56));

        text_cafeomely1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        text_cafeomely1.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely1.setText("OMELY QUÁN ");
        bg_cafeomely.add(text_cafeomely1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 275, 56));

        bg_chuquan.add(bg_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 980, -1));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "SĐT", "Điểm Tính Lũy"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 600, 340));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Thông tin nhân viên");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_refresh_16px.png"))); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 40));

        bg_chuquan.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 620, 390));

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên Khách Hàng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 21));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Giới Tính");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 89, 21));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SĐT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 89, 21));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Điểm Tích Lũy");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, 21));

        cboGt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboGt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Không xác định" }));
        jPanel1.add(cboGt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 30));

        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_cancel_24px.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, 30));

        txtTenkh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtTenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, 30));

        txtDtl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtDtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 60, 30));

        txtSdt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, 30));

        bg_chuquan.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, 250));

        jPanel4.setBackground(new java.awt.Color(85, 65, 118));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Chức năng");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_add_30px.png"))); // NOI18N
        jButton9.setText("Thêm");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/delete.png"))); // NOI18N
        jButton4.setText("Xóa");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/sửa .png"))); // NOI18N
        jButton3.setText("Cập nhật");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_google_web_search_50px.png"))); // NOI18N
        jButton2.setText("Tra cứu");
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 97), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        bg_chuquan.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 600, 80));

        bgnv.add(bg_chuquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        txtTenkh.setText(null);
        txtSdt.setText(null);
        cboGt.setSelectedItem("Nam");
        txtDtl.setText(null);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thoatActionPerformed
        // TODO add your handling code here:
        new Chu_Quan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_KH_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_KH_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_cafeomely;
    private javax.swing.JPanel bg_chuquan;
    private javax.swing.JPanel bg_thoat;
    private javax.swing.JPanel bgnv;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton button_thoat;
    private javax.swing.JComboBox<String> cboGt;
    private javax.swing.JLabel icon_cafe;
    private javax.swing.JLabel icon_cafe1;
    private javax.swing.JLabel icon_trangchu7;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel text_cafeomely;
    private javax.swing.JLabel text_cafeomely1;
    private javax.swing.JLabel text_trangchu7;
    private javax.swing.JTextField txtDtl;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenkh;
    // End of variables declaration//GEN-END:variables
}
