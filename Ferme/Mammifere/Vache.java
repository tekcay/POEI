package Ferme.Mammifere;

public class Vache extends Mammifere {

    private final String animalName = "vache";
    private final String nourriture = "herbe";

    public Vache(String name) {
        super(name);
    }

    @Override
    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String getNourriture() {
        return nourriture;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(", je suis une %s et je mange de l'%s.", animalName, nourriture);
    }



}
