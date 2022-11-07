/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.taikhoanbean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DUC
 */
public class KetNoi {
    public static Connection cn;
    public void KetNoi() {
        try {
//            Ket noi vao csdl: QLTaiKhoan
            //b1: xac dinh he quan tri csdl
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("xong b1");
            cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-9J4G90P\\SQLEXPRESS:1433;databaseName=QLTaiKhoan;user=sa; password=123456");
            System.out.println("Ok b2");
            System.out.println("Eo co b3 dau");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
            KetNoi kn = new KetNoi();
            kn.KetNoi();
//            Rut tien
//            String st = "2022-10-31";
//            chitiettaikhoandao cttkdao = new chitiettaikhoandao();
//
//            SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
//            Date ngay = dd.parse(st);
//            int them = cttkdao.Them(ngay, 50000, "0966906320", "test");
//Kiem tra dang nhap
//            taikhoandao tkdao = new taikhoandao();
//            taikhoanbean taikhoan = new taikhoanbean();
//            taikhoan = tkdao.ktdn("0966906320", "123456");
//            if (taikhoan.getSoTaiKhoan() != null){
//                System.out.println("Dang nhap thanh cong");
//            }
//            else {
//                System.out.println("dang nhap that bai");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
