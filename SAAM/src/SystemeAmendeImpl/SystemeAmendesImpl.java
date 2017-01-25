package SystemeAmendeImpl;

import java.util.HashSet;
import java.util.Set;

import SystemeAmendesInt.SystemeAmendes;
import radars.Amende;
import radars.Voiture;

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
	}

	@Override
	public int signaler(String immatriculation, String modele, int tarif) {
		
		Amende a = null;
		int numero = -1;
		
		for(Voiture v: listeVoitures){
			if(v.getImmatriculation().equals(immatriculation)&& v.getModele().equals(modele)){
				 a = new Amende(immatriculation,tarif);		
				 numero = a.getNumero();
			}
		}	
			return numero;		
	}

	@Override
	public Amende[] lister(String immatriculation) {
		
		return null;
		
		
	}

	@Override
	public void payer(int numero, String nom, String prenom) {
		// TODO Auto-generated method stub
		
	}
	
	

}
