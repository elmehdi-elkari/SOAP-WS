package ma.mehdi;

import jakarta.xml.ws.Endpoint;
import ma.mehdi.Service.BankService;

//import javax.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:1010/",new BankService());
    }
}