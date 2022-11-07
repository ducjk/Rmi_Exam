
import bean.taikhoanbean;
import dao.taikhoandao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
    @Override
    public taikhoanbean KtDn(String SoTaiKhoan, String MatKhau) throws Exception {
        return tkdao.ktdn(SoTaiKhoan, MatKhau);
        
    }

    @Override
    public taikhoanbean RutTien(String SoTaiKhoan, long SoTienRut) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public taikhoanbean ChuyenTien(String SoTaiKhoanChuyen, long SoTienChuyen, String SoTaiKhoanNhan) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public taikhoanbean DoiMatKhau(String SoTaiKhoan, String MatKhauCu, String MatKhauMoi) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
