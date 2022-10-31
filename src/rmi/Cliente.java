package rmi;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {

        String objName = "rmi://localhost:1099/Funcoes";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        double valor = entrada.nextDouble();
        
        Servicos funcoes = (Servicos) Naming.lookup(objName);
        funcoes.dobro(valor);
        funcoes.triplo(valor);
        funcoes.quadruplo(valor);    
    }

}
