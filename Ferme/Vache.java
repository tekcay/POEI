package Ferme;

public class Vache extends Mammifere {

    public Vache(String name) {
        super(name);
    }

    @Override
    public String getNourriture() {
        return "herbe";
    }



}
