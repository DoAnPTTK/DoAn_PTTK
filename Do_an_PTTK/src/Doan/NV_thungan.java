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
public class NV_thungan extends javax.swing.JFrame {

    /**
     * Creates new form NV_thungan
     */
    public NV_thungan() {
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
        sidepane7 = new javax.swing.JPanel();
        bg_trangchu7 = new javax.swing.JPanel();
        text_trangchu7 = new javax.swing.JLabel();
        icon_trangchu7 = new javax.swing.JLabel();
        bg_banhang = new javax.swing.JPanel();
        icon_banhang = new javax.swing.JLabel();
        button_banhang = new javax.swing.JButton();
        bg_ban = new javax.swing.JPanel();
        icon_ban = new javax.swing.JLabel();
        button_ban = new javax.swing.JButton();
        bg_thucdon = new javax.swing.JPanel();
        icon_thucdon = new javax.swing.JLabel();
        button_thucdon = new javax.swing.JButton();
        bg_thongke = new javax.swing.JPanel();
        icon_thongke = new javax.swing.JLabel();
        button_thongke = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bg_chuquan = new javax.swing.JPanel();
        bg_cafeomely = new javax.swing.JPanel();
        text_cafeomely = new javax.swing.JLabel();
        icon_cafe = new javax.swing.JLabel();
        bg_cafe_cake = new javax.swing.JPanel();
        image_cafe_cake = new javax.swing.JLabel();
        bg_address = new javax.swing.JPanel();
        text_cafeomely1 = new javax.swing.JLabel();
        icon_cafe1 = new javax.swing.JLabel();
        bg_thoat = new javax.swing.JPanel();
        button_dangxuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgnv.setBackground(new java.awt.Color(255, 255, 255));
        bgnv.setMaximumSize(new java.awt.Dimension(1280, 1000));
        bgnv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane7.setBackground(new java.awt.Color(54, 33, 89));
        sidepane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_trangchu7.setBackground(new java.awt.Color(85, 65, 118));

        text_trangchu7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        text_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        text_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_trangchu7.setText("Trang chủ");

        icon_trangchu7.setBackground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setForeground(new java.awt.Color(255, 255, 255));
        icon_trangchu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_trangchu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_home_32px.png"))); // NOI18N
        icon_trangchu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_trangchu7.setOpaque(true);

        javax.swing.GroupLayout bg_trangchu7Layout = new javax.swing.GroupLayout(bg_trangchu7);
        bg_trangchu7.setLayout(bg_trangchu7Layout);
        bg_trangchu7Layout.setHorizontalGroup(
            bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_trangchu7Layout.createSequentialGroup()
                .addComponent(icon_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
            .addGroup(bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_trangchu7Layout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(text_trangchu7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        bg_trangchu7Layout.setVerticalGroup(
            bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_trangchu7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(bg_trangchu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(text_trangchu7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        sidepane7.add(bg_trangchu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        bg_banhang.setBackground(new java.awt.Color(85, 65, 118));

        icon_banhang.setBackground(new java.awt.Color(54, 33, 89));
        icon_banhang.setForeground(new java.awt.Color(255, 255, 255));
        icon_banhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_banhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_shop_26px.png"))); // NOI18N
        icon_banhang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_banhang.setOpaque(true);

        button_banhang.setBackground(new java.awt.Color(54, 33, 89));
        button_banhang.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_banhang.setForeground(new java.awt.Color(255, 255, 255));
        button_banhang.setText("Bán hàng");
        button_banhang.setOpaque(false);
        button_banhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_banhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_banhangLayout = new javax.swing.GroupLayout(bg_banhang);
        bg_banhang.setLayout(bg_banhangLayout);
        bg_banhangLayout.setHorizontalGroup(
            bg_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_banhangLayout.createSequentialGroup()
                .addComponent(icon_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        bg_banhangLayout.setVerticalGroup(
            bg_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_banhang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icon_banhang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane7.add(bg_banhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 310, 40));

        bg_ban.setBackground(new java.awt.Color(85, 65, 118));

        icon_ban.setBackground(new java.awt.Color(54, 33, 89));
        icon_ban.setForeground(new java.awt.Color(255, 255, 255));
        icon_ban.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_ban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_table_26px.png"))); // NOI18N
        icon_ban.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_ban.setOpaque(true);

        button_ban.setBackground(new java.awt.Color(54, 33, 89));
        button_ban.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_ban.setForeground(new java.awt.Color(255, 255, 255));
        button_ban.setText("Bàn");
        button_ban.setOpaque(false);
        button_ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_banActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_banLayout = new javax.swing.GroupLayout(bg_ban);
        bg_ban.setLayout(bg_banLayout);
        bg_banLayout.setHorizontalGroup(
            bg_banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_banLayout.createSequentialGroup()
                .addComponent(icon_ban, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_ban, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        bg_banLayout.setVerticalGroup(
            bg_banLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_ban, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icon_ban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane7.add(bg_ban, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, 40));

        bg_thucdon.setBackground(new java.awt.Color(85, 65, 118));

        icon_thucdon.setBackground(new java.awt.Color(54, 33, 89));
        icon_thucdon.setForeground(new java.awt.Color(255, 255, 255));
        icon_thucdon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_thucdon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_cutlery_26px.png"))); // NOI18N
        icon_thucdon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_thucdon.setOpaque(true);

        button_thucdon.setBackground(new java.awt.Color(54, 33, 89));
        button_thucdon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_thucdon.setForeground(new java.awt.Color(255, 255, 255));
        button_thucdon.setText("Thực đơn");
        button_thucdon.setActionCommand("Thực dơn");
        button_thucdon.setOpaque(false);
        button_thucdon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thucdonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thucdonLayout = new javax.swing.GroupLayout(bg_thucdon);
        bg_thucdon.setLayout(bg_thucdonLayout);
        bg_thucdonLayout.setHorizontalGroup(
            bg_thucdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_thucdonLayout.createSequentialGroup()
                .addComponent(icon_thucdon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_thucdon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        bg_thucdonLayout.setVerticalGroup(
            bg_thucdonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_thucdon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(icon_thucdon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane7.add(bg_thucdon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 310, 40));

        bg_thongke.setBackground(new java.awt.Color(85, 65, 118));

        icon_thongke.setBackground(new java.awt.Color(54, 33, 89));
        icon_thongke.setForeground(new java.awt.Color(255, 255, 255));
        icon_thongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_statistics_26px.png"))); // NOI18N
        icon_thongke.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        icon_thongke.setOpaque(true);

        button_thongke.setBackground(new java.awt.Color(54, 33, 89));
        button_thongke.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_thongke.setForeground(new java.awt.Color(255, 255, 255));
        button_thongke.setText("Thống kê");
        button_thongke.setOpaque(false);
        button_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_thongkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thongkeLayout = new javax.swing.GroupLayout(bg_thongke);
        bg_thongke.setLayout(bg_thongkeLayout);
        bg_thongkeLayout.setHorizontalGroup(
            bg_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_thongkeLayout.createSequentialGroup()
                .addComponent(icon_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        bg_thongkeLayout.setVerticalGroup(
            bg_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(button_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane7.add(bg_thongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 310, 40));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(54, 33, 89));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_employee_50px.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhân Viên Thu Ngân");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 230, 1));

        sidepane7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 310, 50));

        bgnv.add(sidepane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 620));

        bg_chuquan.setBackground(new java.awt.Color(54, 33, 89));
        bg_chuquan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cafeomely.setBackground(new java.awt.Color(85, 65, 118));

        text_cafeomely.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_cafeomely.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely.setText("Đ/C: Thị trấn Phú Phong, huyện Tây Sơn, tỉnh Bình Định.");

        icon_cafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/chuquan/icons8_address_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout bg_cafeomelyLayout = new javax.swing.GroupLayout(bg_cafeomely);
        bg_cafeomely.setLayout(bg_cafeomelyLayout);
        bg_cafeomelyLayout.setHorizontalGroup(
            bg_cafeomelyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cafeomelyLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(icon_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(text_cafeomely, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_cafeomelyLayout.setVerticalGroup(
            bg_cafeomelyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(text_cafeomely, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg_chuquan.add(bg_cafeomely, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 680, -1));

        bg_cafe_cake.setBackground(new java.awt.Color(54, 33, 89));

        image_cafe_cake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_cafe_cake.setIcon(new javax.swing.ImageIcon("F:\\document\\Do_an_PTTK\\src\\Doan\\images\\chuquan\\quan_càe.png")); // NOI18N

        javax.swing.GroupLayout bg_cafe_cakeLayout = new javax.swing.GroupLayout(bg_cafe_cake);
        bg_cafe_cake.setLayout(bg_cafe_cakeLayout);
        bg_cafe_cakeLayout.setHorizontalGroup(
            bg_cafe_cakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cafe_cakeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(image_cafe_cake)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        bg_cafe_cakeLayout.setVerticalGroup(
            bg_cafe_cakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_cafe_cake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg_chuquan.add(bg_cafe_cake, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 680, 420));

        bg_address.setBackground(new java.awt.Color(85, 65, 118));

        text_cafeomely1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        text_cafeomely1.setForeground(new java.awt.Color(255, 255, 255));
        text_cafeomely1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_cafeomely1.setText("OMELY QUÁN");

        icon_cafe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_cafe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/images/dangnhap/icons8_cafe_50px.png"))); // NOI18N

        javax.swing.GroupLayout bg_addressLayout = new javax.swing.GroupLayout(bg_address);
        bg_address.setLayout(bg_addressLayout);
        bg_addressLayout.setHorizontalGroup(
            bg_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_addressLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(icon_cafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_cafeomely1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_addressLayout.setVerticalGroup(
            bg_addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_cafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(text_cafeomely1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bg_chuquan.add(bg_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, -1));

        bgnv.add(bg_chuquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 690, 560));

        bg_thoat.setBackground(new java.awt.Color(85, 65, 118));

        button_dangxuat.setBackground(new java.awt.Color(255, 255, 255));
        button_dangxuat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button_dangxuat.setForeground(new java.awt.Color(204, 0, 0));
        button_dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_logout_rounded_left_24px_1.png"))); // NOI18N
        button_dangxuat.setText("Đăng Xuất");
        button_dangxuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        button_dangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_thoatLayout = new javax.swing.GroupLayout(bg_thoat);
        bg_thoat.setLayout(bg_thoatLayout);
        bg_thoatLayout.setHorizontalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap(543, Short.MAX_VALUE)
                .addComponent(button_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_thoatLayout.setVerticalGroup(
            bg_thoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_thoatLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(button_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bgnv.add(bg_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 690, 60));

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

    private void button_thucdonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thucdonActionPerformed
        // TODO add your handling code here:
        new ThucDon_NV_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_thucdonActionPerformed

    private void button_banhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_banhangActionPerformed
        // TODO add your handling code here:
        new home_banhang_nv().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_banhangActionPerformed

    private void button_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dangxuatActionPerformed
        // TODO add your handling code here:
        new DangNhapGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_dangxuatActionPerformed

    private void button_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_thongkeActionPerformed
        // TODO add your handling code here:
        new ThongKe_nv_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_thongkeActionPerformed

    private void button_banActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_banActionPerformed
        // TODO add your handling code here:
        new Ban_NV_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_banActionPerformed

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
            java.util.logging.Logger.getLogger(NV_thungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NV_thungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NV_thungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NV_thungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NV_thungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_address;
    private javax.swing.JPanel bg_ban;
    private javax.swing.JPanel bg_banhang;
    private javax.swing.JPanel bg_cafe_cake;
    private javax.swing.JPanel bg_cafeomely;
    private javax.swing.JPanel bg_chuquan;
    private javax.swing.JPanel bg_thoat;
    private javax.swing.JPanel bg_thongke;
    private javax.swing.JPanel bg_thucdon;
    private javax.swing.JPanel bg_trangchu7;
    private javax.swing.JPanel bgnv;
    private javax.swing.JButton button_ban;
    private javax.swing.JButton button_banhang;
    private javax.swing.JButton button_dangxuat;
    private javax.swing.JButton button_thongke;
    private javax.swing.JButton button_thucdon;
    private javax.swing.JLabel icon_ban;
    private javax.swing.JLabel icon_banhang;
    private javax.swing.JLabel icon_cafe;
    private javax.swing.JLabel icon_cafe1;
    private javax.swing.JLabel icon_thongke;
    private javax.swing.JLabel icon_thucdon;
    private javax.swing.JLabel icon_trangchu7;
    private javax.swing.JLabel image_cafe_cake;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel sidepane7;
    private javax.swing.JLabel text_cafeomely;
    private javax.swing.JLabel text_cafeomely1;
    private javax.swing.JLabel text_trangchu7;
    // End of variables declaration//GEN-END:variables
}
