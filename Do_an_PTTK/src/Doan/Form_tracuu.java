/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doan;

import BLL.BanBLL;
import BLL.NguyenLieuBLL;
import BLL.NhapHangBLL;
import BLL.QuanLyKH_BLL;
import BLL.QuanLyNV_BLL;
import BLL.ThucDonBLL;
import DTO.Ban_DTO;
import DTO.KhachHangDTO;
import DTO.NguyenLieuDTO;
import DTO.NhanVienDTO;
import DTO.NhapHangDTO;
import DTO.ThucDonDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI2
 */
public class Form_tracuu extends javax.swing.JFrame {
    static public String str;
    private String tentk;

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }
    
    /**
     * Creates new form Form_tracuu
     */
    public Form_tracuu( ) {
        initComponents();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        Form_tracuu.str = str;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_thoat = new javax.swing.JButton();
        ma_trcuu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_tim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jPanel2.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông báo nhập thông tin mã tra cứu");

        bt_thoat.setBackground(new java.awt.Color(85, 65, 118));
        bt_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doan/icon/icons8_cancel_48px_1.png"))); // NOI18N
        bt_thoat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(bt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ma_trcuu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ma_trcuu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập mã cần tra cứu");

        bt_tim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_tim.setText("Tìm");
        bt_tim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        bt_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ma_trcuu)))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ma_trcuu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(bt_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thoatActionPerformed
        // TODO add your handling code here:
        if(this.str.equals("Tim nhan vien"))
        {
            QL_NV_GUI ql_nvGUI = new QL_NV_GUI();
            ql_nvGUI.setVisible(true);
            ql_nvGUI.setTentk(tentk);
            ql_nvGUI.setDefaultNhanVien();
            this.dispose();
        }
        if(this.str.equals("Tim khach hang"))
        {
            QL_KH_GUI ql_khGUI = new QL_KH_GUI();
            ql_khGUI.setTentk(tentk);
            ql_khGUI.setVisible(true);
            ql_khGUI.setDefaultKH();
            this.dispose();
        }
        if(this.str.equals("Tim thuc don"))
        {
            Thuc_don_GUI thd = new Thuc_don_GUI();
            thd.setTentk(tentk);
            thd.setVisible(true);
            thd.setALLTable();
            this.dispose();
        }
        if(this.str.equals("Tim nguyen lieu"))
        {
            NguyenLieu_GUI nl = new NguyenLieu_GUI();
            nl.setTentk(tentk);
            nl.setVisible(true);
            nl.setAllTable();
            this.dispose();
        }
        if(this.str.equals("Tim don hang"))
        {
            NhapHang_GUI nh_gui = new NhapHang_GUI();
            nh_gui.setAllTable();
            nh_gui.setTentk(tentk);
            nh_gui.setVisible(true);
            this.dispose();
        }
        if(this.str.equals("Tim ban"))
        {
            Ban_GUI ban = new Ban_GUI();
            ban.setALLTable();
            ban.setTentk(tentk);
            ban.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_bt_thoatActionPerformed

    private void bt_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timActionPerformed
        // TODO add your handling code here:
        if(this.str.equals("Tim nhan vien"))
        {
            QuanLyNV_BLL ql_nv = new QuanLyNV_BLL();
            NhanVienDTO nv = ql_nv.getNhanVien(this.ma_trcuu.getText());
            QL_NV_GUI ql_nvGUI = new QL_NV_GUI();
            ql_nvGUI.setTentk(tentk);
            ql_nvGUI.setVisible(true);
            ql_nvGUI.setTable_tracuu(nv);
            this.dispose();
        }

         if(this.str.equals("Tim khach hang"))
        {
            QuanLyKH_BLL ql_kh = new QuanLyKH_BLL();
            KhachHangDTO nv = ql_kh.getKhachHang(this.ma_trcuu.getText());
            QL_KH_GUI ql_khGUI = new QL_KH_GUI();
            ql_khGUI.setTentk(tentk);
            ql_khGUI.setVisible(true);
            ql_khGUI.setTable_tracuu(nv);
            this.dispose();
        }
         
        if(this.str.equals("Tim thuc don"))
        {
            ThucDonBLL td = new ThucDonBLL();
            int ma_td = Integer.parseInt(this.ma_trcuu.getText());
            ThucDonDTO td_dto = td.getThucDon(ma_td);
            if(td_dto.getMaMon() != 0)
            {
                Thuc_don_GUI thd = new Thuc_don_GUI();
                thd.setTracuu(td_dto);
                thd.setTentk(tentk);
                thd.setVisible(true);
                this.dispose();
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Không có kết quả cần tìm !", "Thông báo", JOptionPane.NO_OPTION);
            Thuc_don_GUI thd = new Thuc_don_GUI();
            thd.setTentk(tentk);
            thd.setVisible(true);
            this.dispose();
        }
        
        if(this.str.equals("Tim nguyen lieu"))
        {
            NguyenLieuBLL nl = new NguyenLieuBLL();
            int manl = Integer.parseInt(this.ma_trcuu.getText());
            NguyenLieuDTO nl_dto = nl.getNL(manl);
            if(nl_dto.getMaNL()!= 0)
            {
                NguyenLieu_GUI nl_gui = new NguyenLieu_GUI();
                nl_gui.setTracuu(nl_dto);
                nl_gui.setTentk(tentk);
                nl_gui.setVisible(true);
                this.dispose();
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Không có kết quả cần tìm !", "Thông báo", JOptionPane.NO_OPTION);
            NguyenLieu_GUI nl_gui = new NguyenLieu_GUI();
            nl_gui.setTentk(tentk);
            nl_gui.setVisible(true);
            this.dispose();
        }
        
        if(this.str.equals("Tim don hang"))
        {
            NhapHangBLL nh = new NhapHangBLL();
            String mactn = this.ma_trcuu.getText();
            NhapHangDTO nh_dto = nh.getDonHang(mactn);
            if(nh_dto.getMaCTN() != null)
            {
                NhapHang_GUI nh_gui = new NhapHang_GUI();
                nh_gui.setTracuu(nh_dto);
                nh_gui.setTentk(tentk);
                nh_gui.setVisible(true);
                this.dispose();
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Không có kết quả cần tìm !", "Thông báo", JOptionPane.NO_OPTION);
            NhapHang_GUI nh_gui = new NhapHang_GUI();
            nh_gui.setTentk(tentk);
            nh_gui.setVisible(true);
            this.dispose();
        }
        if(this.str.equals("Tim ban"))
        {
            BanBLL ban = new BanBLL();
            String mactn = this.ma_trcuu.getText();
            Ban_DTO ban_dto = ban.getBan(mactn);
            if(ban_dto.getMaban() != null)
            {
                Ban_GUI ban_gui = new Ban_GUI();
                ban_gui.setTableTracuu(ban_dto);
                ban_gui.setTentk(tentk);
                ban_gui.setVisible(true);
                this.dispose();
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Không có kết quả cần tìm !", "Thông báo", JOptionPane.NO_OPTION);
            Ban_GUI ban_gui = new Ban_GUI();
            ban_gui.setTentk(tentk);
            ban_gui.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_bt_timActionPerformed

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
            java.util.logging.Logger.getLogger(Form_tracuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_tracuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_tracuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_tracuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_tracuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_thoat;
    private javax.swing.JButton bt_tim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ma_trcuu;
    // End of variables declaration//GEN-END:variables
}
