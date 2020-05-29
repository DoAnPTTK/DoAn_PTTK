/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.Database.conectionJDBC;
import java.sql.ResultSet;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import com.sun.jdi.connect.spi.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MSI2
 */
public class NhanVienDAL {
    public ArrayList<NhanVienDTO> getALLNhanVien()//Hiển thị tất cả nhân viên có trong quán lên table
    {
        ArrayList<NhanVienDTO> AL = new ArrayList<NhanVienDTO>();
        String sql = "select * from NHANVIEN";
        ResultSet rs = Database.getData(conectionJDBC (),sql);
        try 
        {
            while(rs.next())
            {
                NhanVienDTO nv_DTO = new NhanVienDTO();
                nv_DTO.setMaNV(rs.getString("MANV"));
                nv_DTO.setTenTK(rs.getString("TENTK"));
                nv_DTO.setHoTen(rs.getString("HOTEN"));
                nv_DTO.setCMND(rs.getString("CMND"));
                nv_DTO.setDiaChi(rs.getString("NGAYSINH"));
                nv_DTO.setDiaChi(rs.getString("DIACHI"));
                nv_DTO.setGioiTinh(rs.getString("GIOITINH"));
                nv_DTO.setSDT(rs.getString("SDT"));
                nv_DTO.setMucLuong(rs.getString("MUCLUONG"));
                nv_DTO.setNVL(rs.getString("NVL"));
                AL.add(nv_DTO);
            }
            rs.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AL;
    }
    
    public ArrayList<NhanVienDTO> getNhanVien(String TT_NV)//Chọn những Nhân viên có manv hay hoten là TT_NV
    {
        ArrayList<NhanVienDTO> AL = new ArrayList<NhanVienDTO>();
        String sql = "select * from NHANVIEN where MANV like '%"+ TT_NV +"%' or HOTEN like '%"+ TT_NV +"%'";
        ResultSet rs =Database.getData(conectionJDBC (),sql);
        try 
        {
            while(rs.next())
            {
                NhanVienDTO nv_DTO = new NhanVienDTO();
                nv_DTO.setMaNV(rs.getString("MANV"));
                nv_DTO.setTenTK(rs.getString("TENTK"));
                nv_DTO.setHoTen(rs.getString("HOTEN"));
                nv_DTO.setCMND(rs.getString("CMND"));
                nv_DTO.setDiaChi(rs.getString("DIACHI"));
                nv_DTO.setGioiTinh(rs.getString("GIOITINH"));
                nv_DTO.setSDT(rs.getString("SDT"));
                nv_DTO.setMucLuong(rs.getString("MUCLUONG"));
                nv_DTO.setNVL(rs.getString("NVL"));
            }
            rs.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AL;
    }
    
     public boolean ThemNV(NhanVienDTO nv, TaiKhoanDTO tk){
        String call = "{call Them_Nhan_Vien(?,?,?,?,?,?,?,?,?,?,?)}";
        int n = 0;
        CallableStatement pr;
        try {
            pr = conectionJDBC().prepareCall(call);
            pr.setString(1, nv.getHoTen());
            pr.setString(2, nv.getCMND());
            pr.setString(3, nv.getNgaysinh());
            pr.setString(4, nv.getDiaChi());
            pr.setString(5, nv.getGioiTinh());
            pr.setString(6, nv.getSDT());
            pr.setString(7, nv.getMucLuong());
            pr.setString(8, nv.getNVL());
            pr.setString(9, tk.getTenTK());
            pr.setString(10,tk.getMK());
            pr.setString(11,tk.getRole());
            n = pr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    
}
