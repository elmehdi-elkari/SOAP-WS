package ma.mehdi.Client;

import ma.mehdi.Client.proxy.BankService;
import ma.mehdi.Client.proxy.BankWs;
import ma.mehdi.Client.proxy.Compte;

public class JavaClient {
    public static void main(String[] args) {
        BankService stub = new BankWs().getBankServicePort();
        for(Compte c : stub.listComptes()){
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println("------------------------------");
        }
    }
}
