/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DUC
 */
public class KetNoi {
    public Connection cn;
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
        KetNoi kn = new KetNoi();
        kn.KetNoi();
    }
}
