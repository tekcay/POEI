package Ecole.Personnes;

import static Ecole.Ecole.personnes;

public class Personne {

    private String name;

    public Personne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getFiche() {
        System.out.printf("Je m'appelle %s", this.name);
    }

}
