package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Funcoes extends UnicastRemoteObject implements Servicos{
    
    public Funcoes() throws RemoteException{
        super();
    }

    public void dobro (double valor) throws RemoteException {
            System.out.println("o dobro do valor é: " + valor * 2);
    }

   
    public void triplo(double valor) throws RemoteException {
            System.out.println("o triplo do valor é: " + valor * 3);   
    }

    
    public void quadruplo(double valor) throws RemoteException {
            System.out.println("o quadruplo do valor é: " + valor * 4); 
    }   
}
