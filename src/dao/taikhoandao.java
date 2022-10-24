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
            KetNoi kn = new KetNoi();
            kn.KetNoi();
//			   b2: Lay du lieu ve
            String sql = "select * from taikhoan";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    ResultSet rs = cmd.executeQuery();
            while(rs.next()) {
                String SoTaiKhoan = rs.getString("SoTaiKhoan");
                String HoTen = rs.getString("HoTen");
                long SoTien = rs.getLong("SoTien");
                String MatKhau =rs.getString("MatKhau");
                dstaikhoan.add(new taikhoanbean(SoTaiKhoan, HoTen, SoTien, MatKhau));
            }
            
            rs.close();
            kn.cn.close();
			   
            return dstaikhoan;
	} catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
	}
    }
}
