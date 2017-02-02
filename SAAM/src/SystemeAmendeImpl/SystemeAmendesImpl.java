package SystemeAmendeImpl;

import java.util.HashSet;
import java.util.Set;

import javax.jws.WebService;

import SystemeAmendesInt.SystemeAmendes;
import radars.Amende;
import radars.Voiture;

@WebService(endpointInterface = "SystemeAmendesInt.SystemeAmendes")
public class SystemeAmendesImpl implements SystemeAmendes {

	Set<Voiture> listeVoitures;
	Set<Amende> listeAmendes;
	
	public SystemeAmendesImpl(){
		listeVoitures = new HashSet();
		listeAmendes = new HashSet();
	}
	
	@Override
	public void enregistrer(Voiture v) {
		listeVoitures.add(v);		
		System.out.println("Voiture enregistree\n"+v.toString());
	}

	@Override
	public int signaler(String immatriculation, String modele, int tarif) {
		
		Amende a = null;
		int numero = -1;
		
		for(Voiture v: listeVoitures){
			if(v.getImmatriculation().equals(immatriculation)&& v.getModele().equals(modele)){
				 a = new Amende(immatriculation,tarif);	
				 listeAmendes.add(a);
				 numero = a.getNumero();
				 System.out.println("Amende enregistrée\n"+a.toString());
			}
			else{
				numero = -1;
			}
		}	
			return numero;		
	}

	@Override
	public Amende[] lister(String immatriculation) {
		
		Voiture voiture = new Voiture(immatriculation,"");
		int compteur = 0;
		
		for(Amende a: listeAmendes){
			if(a.getImmatriculation().equals(immatriculation)){
				compteur++;
			}
		}
		
		Amende[] amendes = new Amende[compteur];
		
		compteur = 0;
		
		for(Amende a: listeAmendes){
			if(a.getImmatriculation().equals(voiture.getImmatriculation())){
				amendes[compteur] = a;
				compteur ++;
			}
		}
		
		return amendes;
		
		
	}

	@Override
	public void payer(int numero, String nom, String prenom) {
		
		Amende amende = new Amende();
		
		for(Amende a: listeAmendes){
			if(a.getNumero()==numero){
				for(Voiture v: listeVoitures)
				if(v.getProprietaire().getNom().equals(nom) && v.getProprietaire().getPrenom().equals(prenom)){
					amende = a;
				}
				
			}
		}
		
		if(amende!=null){
			listeAmendes.remove(amende);
		}
		
	}
	
	

}
