package SystemeAmendesInt;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import radars.Voiture;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SystemeAmendes{
    @WebMethod void enregistrer(Voiture v);
    @WebMethod void signaler(String immatriculation, String modele, int tarif);
    @WebMethod void lister(String immatriculation);
    @WebMethod void payer(int numero, String nom, String prenom);
}
