package Ecole.Personnes.Salaries;

import Ecole.Personnes.Personne;

public class Salarie extends Personne {

    private int salaire;

    public Salarie(String name, int salaire) {

        super(name);
        this.salaire = salaire;

    }

    @Override
    public void getFiche() {
        super.getFiche();
        System.out.printf(", mon salaire est de %d euros.", this.salaire);
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }


}

