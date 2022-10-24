/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DUC
 */
public class chitiettaikhoanbean implements Serializable{
    private long Id;
    private Date NgayRutTien;
    private long SoTienRutRa;
    private String SoTaiKhoan, Ghichu;

    public chitiettaikhoanbean() {
    }

    public chitiettaikhoanbean(long Id, Date NgayRutTien, long SoTienRutRa, String SoTaiKhoan, String Ghichu) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRutRa = SoTienRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
        this.Ghichu = Ghichu;
    }

    public long getId() {
        return Id;
    }

    public Date getNgayRutTien() {
        return NgayRutTien;
    }

    public long getSoTienRutRa() {
        return SoTienRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public void setNgayRutTien(Date NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public void setSoTienRutRa(long SoTienRutRa) {
        this.SoTienRutRa = SoTienRutRa;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    
    
    
}
