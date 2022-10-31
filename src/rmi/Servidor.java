package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {

        try {
            Servicos funcoes = new Funcoes();
            String objName = "rmi://localhost/Funcoes";
            System.out.println("Registrando object no rmi services... ");

            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, funcoes);
            System.out.println("Aguardando clientes");
        } catch (Exception ex) {
            System.out.println("Erro ao criar servidor! " + ex);
        }
    }
}
