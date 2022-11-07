/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.taikhoanbean;
import dao.taikhoandao;
import java.util.ArrayList;

/**
 *
 * @author DUC
 */
public class taikhoanbo {
    ArrayList<taikhoanbean> ds;
    public void getds() {
        taikhoandao tkdao = new taikhoandao();
        ds = tkdao.gettaikhoan();
    }
}
