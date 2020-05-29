/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author MSI2
 */
public class QuanLyNV_BLL {
    NhanVienDAL nv_DAL = new NhanVienDAL();
    public ArrayList<NhanVienDTO> getAllNhanVien()
    {
        return nv_DAL.getALLNhanVien();
    }
    
    public ArrayList<NhanVienDTO> getNhanVien(String TT_NV)
    {
        return nv_DAL.getNhanVien(TT_NV);
    }
    
    public boolean ThemNV(NhanVienDTO nv, TaiKhoanDTO TK)
    {
        return nv_DAL.ThemNV(nv,TK);
    }
}
