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
public class TraCuuHD_NV_GUI extends javax.swing.JFrame {

    /**
     * Creates new form TraCuuHD_NV_GUI
     */
    public TraCuuHD_NV_GUI() {
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

        bg7 = new javax.swing.JPanel();
        bg_thoat = new javax.swing.JPanel();
        bg_trangchu7 = new javax.swing.JPanel();
        text_trangchu7 = new javax.swing.JLabel();
        icon_trangchu7 = new javax.swing.JLabel();
        button_thoat = new javax.swing.JButton();
        bg_home_banhang = new javax.swing.JPanel();
        bg_cafe_cake = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        icon_search = new javax.swing.JLabel();
        text_search = new javax.swing.JTextField();
        gachchan = new javax.swing.JPanel();
        them_hd = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        bg_address = new javax.swing.JPanel();
        text_cafeomely1 = new javax.swing.JLabel();
        icon_cafe1 = new javax.swing.JLabel();
        icon_cafe = new javax.swing.JLabel();
        text_cafeomely = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg7.setBackground(new java.awt.Color(255, 255, 255));
        bg7.setMaximumSize(new java.awt.Dimension(1280, 1000));
        bg7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_thoat.setBackground(new java.awt.Color(85, 65, 118));

        bg_trangchu7.setBackground(new java.awt.Color(85, 65, 118));

        text_trangchu7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        text_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_trangchu7.setText("Bán hàng");

        icon_trangchu7.setBackground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_trangchu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_online_store_32px.png"))); // NOI18N
        icon_trangchu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_trangchu7.setOpaque(true);

        javax.swing.GroupLayout bg_trangchu7Layout = new javax.swing.GroupLayout(bg_trangchu7);
        bg_trangchu7.setLayout(bg_trangchu7Layout);
        bg_trangchu7Layout.setHorizontalGroup(
            bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_trangchu7Layout.createSequentialGroup()
                .addComponent(icon_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        bg_trangchu7Layout.setVerticalGroup(
            bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(icon_trangchu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addComponent(bg_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(button_thoat)
                .addContainerGap())
        );
        bg_thoatLayout.setVerticalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_thoat)
                .addContainerGap())
        );

        bg7.add(bg_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        bg_home_banhang.setBackground(new java.awt.Color(54, 33, 89));
        bg_home_banhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cafe_cake.setBackground(new java.awt.Color(85, 65, 118));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã khách hàng", "Thành tiền", "Mã nhân viên", "Ngày lập"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setBackground(new java.awt.Color(85, 65, 118));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kết quả tra cứu hóa đơn");

        javax.swing.GroupLayout bg_cafe_cakeLayout = new javax.swing.GroupLayout(bg_cafe_cake);
        bg_cafe_cake.setLayout(bg_cafe_cakeLayout);
        bg_cafe_cakeLayout.setHorizontalGroup(
            bg_cafe_cakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        bg_cafe_cakeLayout.setVerticalGroup(
            bg_cafe_cakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_cafe_cakeLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        bg_home_banhang.add(bg_cafe_cake, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 980, 240));

        search.setBackground(new java.awt.Color(85, 65, 118));
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_search.setBackground(new java.awt.Color(54, 33, 89));
        icon_search.setForeground(new java.awt.Color(255, 255, 255));
        icon_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/banhang/icons8_search_26px.png"))); // NOI18N
        icon_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_search.setOpaque(true);
        search.add(icon_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 34, 40));

        text_search.setBackground(new java.awt.Color(85, 65, 118));
        text_search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text_search.setForeground(new java.awt.Color(255, 255, 255));
        text_search.setToolTipText("");
        text_search.setBorder(null);
        text_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_searchActionPerformed(evt);
            }
        });
        search.add(text_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        javax.swing.GroupLayout gachchanLayout = new javax.swing.GroupLayout(gachchan);
        gachchan.setLayout(gachchanLayout);
        gachchanLayout.setHorizontalGroup(
            gachchanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gachchanLayout.setVerticalGroup(
            gachchanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        search.add(gachchan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 1));

        bg_home_banhang.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 200, 40));

        them_hd.setBackground(new java.awt.Color(54, 33, 89));
        them_hd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg_home_banhang.add(them_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 40));

        jTextField10.setBackground(new java.awt.Color(54, 33, 89));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Nhập mã hóa đơn:");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        bg_home_banhang.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 150, 40));

        bg7.add(bg_home_banhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 510));

        bg_address.setBackground(new java.awt.Color(85, 65, 118));
        bg_address.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_cafeomely1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        text_cafeomely1.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely1.setText("OMELY QUÁN ");
        bg_address.add(text_cafeomely1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 235, 56));

        icon_cafe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_cafe_50px.png"))); // NOI18N
        bg_address.add(icon_cafe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        icon_cafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_address_50px_1.png"))); // NOI18N
        bg_address.add(icon_cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 79, 56));

        text_cafeomely.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_cafeomely.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely.setText("Đ/C: Thị trấn Phú Phong, huyện Tây Sơn, tỉnh Bình Định.");
        bg_address.add(text_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 523, 50));

        bg7.add(bg_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1000, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thoatActionPerformed
        // TODO add your handling code here:
        new home_banhang_nv().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_thoatActionPerformed

    private void text_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_searchActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(TraCuuHD_NV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraCuuHD_NV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraCuuHD_NV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraCuuHD_NV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraCuuHD_NV_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg7;
    private javax.swing.JPanel bg_address;
    private javax.swing.JPanel bg_cafe_cake;
    private javax.swing.JPanel bg_home_banhang;
    private javax.swing.JPanel bg_thoat;
    private javax.swing.JPanel bg_trangchu7;
    private javax.swing.JButton button_thoat;
    private javax.swing.JPanel gachchan;
    private javax.swing.JLabel icon_cafe;
    private javax.swing.JLabel icon_cafe1;
    private javax.swing.JLabel icon_search;
    private javax.swing.JLabel icon_trangchu7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JPanel search;
    private javax.swing.JLabel text_cafeomely;
    private javax.swing.JLabel text_cafeomely1;
    private javax.swing.JTextField text_search;
    private javax.swing.JLabel text_trangchu7;
    private javax.swing.JPanel them_hd;
    // End of variables declaration//GEN-END:variables
}
