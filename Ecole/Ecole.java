package Ecole;

import Ecole.Personnes.Eleve;
import Ecole.Personnes.Personne;
import Ecole.Personnes.Salaries.Salarie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Ecole {

    private ArrayList<Personne> personnes  = new ArrayList<>();

    public Ecole(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public void addEleve(String name, String classe) {
        this.personnes.add(new Eleve(name, classe));
    }

    public void addEleve(Eleve eleve) {
        this.personnes.add(eleve);
    }

    public void addSalarie(String name, int salaire) {
        this.personnes.add(new Salarie(name, salaire));
    }

    public void addSalarie(Salarie salarie) {
        this.personnes.add(salarie);
    }

    private List<Salarie> getSalaries() {
        return this.personnes.stream()
                .filter(personne -> personne instanceof Salarie)
                .map(personne -> (Salarie)personne)
                .toList();
    }

    private List<Eleve> getEleves() {
        return this.personnes.stream()
                .filter(personne -> personne instanceof Eleve)
                .map(personne -> (Eleve)personne)
                .toList();
    }


    private List<Eleve> getElevesInClasses(String classe) {
        return this.personnes.stream()
                .filter(personne -> personne instanceof Eleve)
                .map(personne -> (Eleve)personne)
                .filter(eleve -> eleve.getClasse().equals(classe))
                .toList();
    }

    public void printSalaries() {
        this.getSalaries().forEach(Salarie::getFiche);
    }

    public void printEleves() {
        this.getEleves().forEach(Personne::getFiche);
    }

    public void printElevesInClasse(String classe) {
        this.getElevesInClasses(classe).forEach(Personne::getFiche);
    }


}
