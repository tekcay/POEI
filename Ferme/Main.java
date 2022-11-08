package Ferme;

import Ferme.Mammifere.Vache;

public class Main {

    public static void main (String[] args) {

        Vache tata = new Vache("tata");

        Ferme ferme = new Ferme();

        ferme.addAnimal(new Vache("tata"));

        ferme.printAnimaux();

        //System.out.printf("je suis %s, je suis une %s de la famille des %s et je mange de l'%s.", tata.getName(), tata.getAnimalName(), tata.getFamille(), tata.getNourriture());

    }

}
