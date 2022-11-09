package Ecole;

import Ecole.Personnes.Eleve;
import Ecole.Personnes.Personne;
import Ecole.Personnes.Salaries.Salarie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Ecole {

    public static ArrayList<Personne> personnes = new ArrayList<>();

    public Ecole() {

    }


    private static List<Salarie> getSalaries() {
        return personnes.stream()
                .filter(personne -> personne instanceof Salarie)
                .map(personne -> (Salarie)personne)
                .toList();
    }

    private static List<Eleve> getEleves() {
        return personnes.stream()
                .filter(personne -> personne instanceof Eleve)
                .map(personne -> (Eleve)personne)
                .toList();
    }

    private static List<Eleve> getElevesInClasses(String classe) {
        return personnes.stream()
                .filter(personne -> personne instanceof Eleve)
                .map(personne -> (Eleve)personne)
                .filter(eleve -> eleve.getClasse().equals(classe))
                .toList();
    }

    public static void printSalaries() {
        getSalaries().forEach(Salarie::getFiche);
    }

    public static void printEleves() {
        getEleves().forEach(Personne::getFiche);
    }

    public static void printElevesInClasse(String classe) {
        getElevesInClasses(classe).forEach(Personne::getFiche);
    }


}
