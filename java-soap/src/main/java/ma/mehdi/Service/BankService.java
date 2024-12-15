package ma.mehdi.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.mehdi.Entity.Compte;

//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWs")
public class BankService {

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "amount") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code){
        return new Compte(code,Math.random()*5499,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        //java>9 -> List.of()
        return Arrays.asList(
                new Compte(1,Math.random()*5499,new Date()),
                new Compte(2,Math.random()*5499,new Date()),
                new Compte(3,Math.random()*5499,new Date())
        );
    }
}
