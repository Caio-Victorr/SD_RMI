package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Servicos extends Remote{

    public void dobro(double valor) throws RemoteException;
    
    public void triplo(double valor) throws RemoteException;
    
    public void quadruplo(double valor) throws RemoteException;

}
