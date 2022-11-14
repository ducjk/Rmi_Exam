
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
              
            new FrmDangNhap().setVisible(true);
        }catch(Exception tt) {
            tt.printStackTrace();
        }
    }
}
