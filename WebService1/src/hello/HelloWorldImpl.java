package hello;

import javax.jws.WebService;

import fr.paris10.miage.procs.exercice1.HelloWorld;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}
