package Ecole;

import Ecole.Personnes.Eleve;
import Ecole.Personnes.Personne;
import Ecole.Personnes.Salaries.Salarie;

import java.util.ArrayList;

public class Main {



    public static void main (String[] args) {

        Ecole ecole1 = new Ecole(new ArrayList<Personne>());

        ecole1.addEleve(new Eleve("Toto", "3e"));
        ecole1.addEleve(new Eleve("Tata", "4e", 15));

        ecole1.addSalarie(new Salarie("Tonton", 1500));

        ecole1.printSalaries();
        ecole1.printEleves();
        ecole1.printElevesInClasse("3e");

    }

}
