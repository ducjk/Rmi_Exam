
import bean.chitiettaikhoanbean;
import bean.taikhoanbean;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

public interface ITinhToan extends Remote{
    public int Cong(int a, int b) throws RemoteException;
    public int Tru(int a, int b) throws RemoteException;
    public int Nhan(int a, int b) throws RemoteException;
    public int Chia(int a, int b) throws RemoteException;
    
    public taikhoanbean KtDn(String SoTaiKhoan, String MatKhau) throws Exception;
    public int RutTien(String SoTaiKhoan, long SoTienRut) throws Exception;
    public int ChuyenTien(String SoTaiKhoanChuyen, long SoTienChuyen, String SoTaiKhoanNhan, Date ngaychuyen, String GhiChu) throws Exception;
    public int DoiMatKhau(String SoTaiKhoan, String MatKhauCu, String MatKhauMoi) throws Exception;
    public ArrayList<chitiettaikhoanbean> getdscttk(String taikhoan) throws Exception;
    public ArrayList<taikhoanbean> gettaikhoan() throws Exception;
}
