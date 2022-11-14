/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.taikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class taikhoandao {
    public ArrayList<taikhoanbean> gettaikhoan(){
        try {
            ArrayList<taikhoanbean> dstaikhoan= new ArrayList<taikhoanbean>();
//			   b1: ket noi vao csdl
            
//			   b2: Lay du lieu ve
            String sql = "select * from taikhoan";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
	    ResultSet rs = cmd.executeQuery();
            while(rs.next()) {
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTen = rs.getString("HoTen");
                long SoTien = rs.getLong("SoTien");
                String MatKhau =rs.getString("MatKhau");
                dstaikhoan.add(new taikhoanbean(SoTaiKhoan, HoTen, SoTien, MatKhau));
            }
            
            rs.close();
			   
            return dstaikhoan;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
    
    public taikhoanbean ktdn(String taikhoan, String matkhau){
        try {
//			   b2: Lay du lieu ve
            String sql = "select * from taikhoan where SoTaiKhoan = ? and MatKhau = ?";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
	    cmd.setString(1, taikhoan);
            cmd.setString(2, matkhau);
            ResultSet rs = cmd.executeQuery();
            taikhoanbean tk = new taikhoanbean();
            if(rs.next()) {
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTen = rs.getString("HoTen");
                long SoTien = rs.getLong("SoTien");
                String MatKhau =rs.getString("MatKhau");
                tk = new taikhoanbean(SoTaiKhoan, HoTen, SoTien, MatKhau);
            }
            
            rs.close();
			   
            return tk;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
    
    public int Ruttien(long SoTienRut, String SoTaiKhoan) throws Exception{
        
        String sql = "update TaiKhoan set SoTien = SoTien - ? where SoTaiKhoan = ?";
	PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);    
        
        cmd.setLong(1, SoTienRut);
        cmd.setString(2, SoTaiKhoan);
        
        
        return cmd.executeUpdate();
    }
    
    public int CongTien(String SoTaiKhoan, long SoTienCong) throws Exception {
        String sql = "update TaiKhoan set SoTien = SoTien + ? where SoTaiKhoan = ?";
	PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);    
        
        cmd.setLong(1, SoTienCong);
        cmd.setString(2, SoTaiKhoan);
        
        
        return cmd.executeUpdate();
    }
    
    public int DoiMatKhau(String SoTaiKhoan, String MatKhauCu, String MatKhauMoi) throws Exception {
        String sql = "update TaiKhoan set MatKhau = ? where SoTaiKhoan = ? and MatKhau = ?";
	PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);    
        
        cmd.setString(1, MatKhauMoi);
        cmd.setString(2, SoTaiKhoan);
        cmd.setString(3, MatKhauCu);
        
        
        return cmd.executeUpdate();
    } 
    
}