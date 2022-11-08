package Ferme;

import java.util.ArrayList;

public class Ferme {


    private Animal animal;
    public ArrayList<Animal> listeAnimaux = new ArrayList<>();

    public Ferme () {

    }

    public void addAnimal(Animal animal) {
        listeAnimaux.add(animal);
    }

    public void printAnimaux() {
        listeAnimaux.forEach(Animal::print);
    }




}
