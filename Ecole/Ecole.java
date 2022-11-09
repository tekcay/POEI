package Ecole;

import Ecole.Personnes.Eleve;
import Ecole.Personnes.Personne;
import Ecole.Personnes.Salaries.Salarie;

import java.util.ArrayList;
import java.util.List;

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

    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch(ClassCastException e) {
            return null;
        }
    }

    private <T> List<T> getList(Class<T> tClass) {
            return this.personnes.stream()
                    .filter(personne -> personne.getClass().isAssignableFrom(tClass))
                    .map(personne -> (T) personne)
                    .toList();
    }

    public <T> void printType(Class<T> tClass) {
        this.getList(tClass).forEach(t -> ((Personne) t).getFiche());
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
