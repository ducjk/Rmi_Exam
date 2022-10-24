
import java.rmi.RemoteException;

public class TinhToan implements ITinhToan{

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
