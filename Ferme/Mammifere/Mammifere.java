package Ferme.Mammifere;

import Ferme.Animal;

abstract class Mammifere extends Animal {

    private final String famille = "mammifères";

    public Mammifere(String name) {
        super(name);
    }

    @Override
    public String getFamille() {
        return famille;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(", je suis de la famille des %s", famille);
    }




}
