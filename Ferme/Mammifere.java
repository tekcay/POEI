package Ferme;

abstract class Mammifere extends Animal {



    public Mammifere(String name) {
        super(name);
    }

    @Override
    public String getFamille() {
        return "mammifere";
    }




}
