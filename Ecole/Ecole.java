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

    /**
     *
     * @param tClass the type of {@code Personne} that must be retrieved, e.g. {@code Eleve}.
     * @return a {@code List<T>} where {@code T} is an inheritor of {@code Personne}, e.g {@code List<Eleve>}.
     * @param <T>
     */
    private <T> List<T> getList(Class<T> tClass) {
            return this.personnes.stream()
                    .filter(personne -> personne.getClass().isAssignableFrom(tClass))
                    .map(personne -> (T) personne)
                    .toList();
    }

    /**
     * Prints the "fiche" of each member of a {@code Personne} type, i.e. inheritor such a {@code Eleve}.
     * @param tClass the type of {@code Personne} that must be retrieved, e.g. {@code Eleve}
     * @param <T>
     */
    public <T> void printType(Class<T> tClass) {
        this.getList(tClass).forEach(t -> ((Personne) t).getFiche());
    }



    private List<Eleve> getElevesInClasses(String classe) {
        return this.personnes.stream()
                .filter(personne -> personne instanceof Eleve)
                .map(personne -> (Eleve)personne)
                .filter(eleve -> eleve.getClasse().equals(classe))
                .toList();
    }

    public void printElevesInClasse(String classe) {
        this.getElevesInClasses(classe).forEach(Personne::getFiche);
    }


}
