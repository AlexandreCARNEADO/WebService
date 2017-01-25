package calculetteInt;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculette{
    @WebMethod int ajouter(int n1, int n2);
    @WebMethod int soustraire(int n1, int n2);
}
