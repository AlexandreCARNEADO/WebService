package calculette;

import javax.jws.WebService;

import calculetteInt.Calculette;

@WebService(endpointInterface = "calculette.calculetteInt")
public class CalculetteImpl implements Calculette {
	

public int ajouter(int n1, int n2){
	
	int result = n1 + n2;
	return result;
}

public int soustraire(int n1, int n2){
	
	int result = n1 - n2;
	return result;
}


}
