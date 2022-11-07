/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
