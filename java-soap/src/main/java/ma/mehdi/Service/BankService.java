package ma.mehdi.Service;

import ma.mehdi.Entity.Compte;

import javax.jws.WebService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebService
public class BankService {

    public double conversion(double mt){
        return mt*10.54;
    }
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*5499,new Date());
    }
    public List<Compte> listComptes(){
        //java>9 -> List.of()
        return Arrays.asList(
                new Compte(1,Math.random()*5499,new Date()),
                new Compte(2,Math.random()*5499,new Date()),
                new Compte(3,Math.random()*5499,new Date())
        );
    }
}
