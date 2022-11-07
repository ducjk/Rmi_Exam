
import bean.taikhoanbean;
import dao.KetNoi;
import dao.taikhoandao;
import java.rmi.Naming;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUC
 */
public class MyClient {
    public static void main(String[] args) {
        try{
//            ITinhToan tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
//            System.out.println("Tong: " + tt.Cong(10,20));
//            System.out.println("Hieu: " + tt.Tru(25,5));
//            System.out.println("Tich: " + tt.Nhan(25,5));
//            System.out.println("Thuong: " + tt.Chia(25,5));
              
            new FrmDangNhap().setVisible(true);
        }catch(Exception tt) {
            tt.printStackTrace();
        }
    }
}
