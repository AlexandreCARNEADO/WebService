package systemeamendesclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import SystemeAmendesInt.SystemeAmendes;
import radars.Amende;
import radars.Personne;
import radars.Voiture;


public class SystemeAmendesClient {
	
	public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/saam?wsdl");
        QName qname = new QName("http://SystemeAmendeImpl/", "SystemeAmendesImplService");
        Service service = Service.create(url, qname);
        
        SystemeAmendes sa = service.getPort(SystemeAmendes.class);
        int result = -1;
        
        Amende[] a = null;
        
        Voiture v1 = new Voiture("AB 123 CD","Clio 3");
        Personne p1 = new Personne("Sponge","Bob","");
        v1.setProprietaire(p1);
        
        sa.enregistrer(v1);
        
        
        Voiture v2 = new Voiture("AB 124 CD","Punto");
        Personne p2 = new Personne("Haddock","Capitaine","");
        v2.setProprietaire(p2);
        
        sa.enregistrer(v2);
        
        result = sa.signaler("AB 123 CD","Clio 3",90);
        System.out.println("Amende n°"+result+"\t enregistrée");
        result = sa.signaler("AB 123 CD","Tracteur",90);
        System.out.println("Amende n°"+result+"\t enregistrée");
        result = sa.signaler("AB 123 CD","Clio 3",140);
        System.out.println("Amende n°"+result+"\t enregistrée");
        
        System.out.println("Listing des amendes de AB 123 CD");
        a = sa.lister("AB 123 CD");
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i].toString());
        }
        
        sa.payer(1, "Haddock", "Capitaine");
        
        System.out.println("Listing des amendes de AB 123 CD");
        a = sa.lister("AB 123 CD");
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i].toString());
        }
        
        sa.payer(1, "Sponge","Bob");
        
        System.out.println("Listing des amendes de AB 123 CD");
        a = sa.lister("AB 123 CD");
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i].toString());
        }
        
        
        
        
        
        
    }

}
