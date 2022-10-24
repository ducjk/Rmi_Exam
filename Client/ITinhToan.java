
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITinhToan extends Remote{
    public int Cong(int a, int b) throws RemoteException;
    public int Tru(int a, int b) throws RemoteException;
    public int Nhan(int a, int b) throws RemoteException;
    public int Chia(int a, int b) throws RemoteException;
}
