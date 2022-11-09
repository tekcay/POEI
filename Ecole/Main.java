package Ecole;

import Ecole.Personnes.Eleve;
import Ecole.Personnes.Salaries.Salarie;

import static Ecole.Ecole.*;

public class Main {



    public static void main (String[] args) {

        personnes.add(new Eleve("Toto", "3e"));
        personnes.add(new Eleve("Tata", "4e", 15));

        personnes.add(new Salarie("Tonton", 1500));

        printSalaries();
        printEleves();
        printElevesInClasse("3e");

    }

}
