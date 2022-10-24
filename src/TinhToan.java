
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
    
}
