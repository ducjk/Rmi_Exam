
import bean.chitiettaikhoanbean;
import bean.taikhoanbean;
import dao.chitiettaikhoandao;
import dao.taikhoandao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TinhToan extends UnicastRemoteObject implements ITinhToan{
    public TinhToan() throws RemoteException{}
    @Override
    public int Cong(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int Tru(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int Nhan(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int Chia(int a, int b) throws RemoteException {
        return a / b;
    }
    taikhoandao tkdao = new taikhoandao();
    chitiettaikhoandao cttk = new chitiettaikhoandao();
    @Override
    public taikhoanbean KtDn(String SoTaiKhoan, String MatKhau) throws Exception {
        return tkdao.ktdn(SoTaiKhoan, MatKhau);
    }

    @Override
    public int RutTien(String SoTaiKhoan, long SoTienRut) throws Exception {
        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        Date ngay = dd.parse(dd.format(d));
        int themcttk = cttk.Them(ngay, SoTienRut, SoTaiKhoan, "Rut Tien");
        return tkdao.Ruttien(SoTienRut, SoTaiKhoan);
        
    }

    @Override
    public int ChuyenTien(String SoTaiKhoanChuyen, long SoTienChuyen, String SoTaiKhoanNhan, Date ngaychuyen, String GhiChu) throws Exception {
        int ruttienchuyen = tkdao.Ruttien(SoTienChuyen, SoTaiKhoanChuyen);
        int congtienchuyen = 0;
        int themcttk = 0;
        if (ruttienchuyen != 0){
            congtienchuyen = tkdao.CongTien(SoTaiKhoanNhan, SoTienChuyen);
        }
        if (congtienchuyen != 0){
            themcttk = cttk.Them(ngaychuyen, SoTienChuyen, SoTaiKhoanChuyen, GhiChu);
        }
        return themcttk;
    }

    @Override
    public taikhoanbean DoiMatKhau(String SoTaiKhoan, String MatKhauCu, String MatKhauMoi) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
