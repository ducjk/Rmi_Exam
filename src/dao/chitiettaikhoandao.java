/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.chitiettaikhoanbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DUC
 */
public class chitiettaikhoandao {
    public int Them(Date NgayRutTien, long SoTienRutRa, String SoTaiKhoan, String Ghichu) throws Exception{
        
        String sql = "insert into ChiTietTaiKhoan (NgayRutTien, SoTienRutRa, SoTaiKhoan, Ghichu) values (?,?,?,?)";
	PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);    
        
        cmd.setDate(1, new java.sql.Date(NgayRutTien.getTime()));
        cmd.setLong(2, SoTienRutRa);
        cmd.setString(3, SoTaiKhoan);
        cmd.setString(4, Ghichu);
        return cmd.executeUpdate();
    }
    
    public ArrayList<chitiettaikhoanbean> getcttaikhoan(String STK){
        try {
            ArrayList<chitiettaikhoanbean> dscttaikhoan= new ArrayList<chitiettaikhoanbean>();
            String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan = ?";
	    PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
            cmd.setString(1, STK);
	    ResultSet rs = cmd.executeQuery();
            while(rs.next()) {
                long Id = rs.getLong("Id");
                Date NgayRutTien = rs.getDate("NgayRutTien");
                long SoTienRutRa = rs.getLong("SoTienRutRa");
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String Ghichu = rs.getString("Ghichu");
                
                dscttaikhoan.add(new chitiettaikhoanbean(Id, NgayRutTien, SoTienRutRa, SoTaiKhoan, Ghichu));
            }
            
            rs.close();
			   
            return dscttaikhoan;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
}
