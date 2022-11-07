
import bean.taikhoanbean;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITinhToan extends Remote{
    public int Cong(int a, int b) throws RemoteException;
    public int Tru(int a, int b) throws RemoteException;
    public int Nhan(int a, int b) throws RemoteException;
    public int Chia(int a, int b) throws RemoteException;
    
    public taikhoanbean KtDn(String SoTaiKhoan, String MatKhau) throws Exception;
    public taikhoanbean RutTien(String SoTaiKhoan, long SoTienRut) throws Exception;
    public taikhoanbean ChuyenTien(String SoTaiKhoanChuyen, long SoTienChuyen, String SoTaiKhoanNhan) throws Exception;
    public taikhoanbean DoiMatKhau(String SoTaiKhoan, String MatKhauCu, String MatKhauMoi) throws Exception;
}
