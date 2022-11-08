package Ferme;

public class Main {

    public static void main (String[] args) {

        Vache tata = new Vache("tata");

        System.out.printf("je suis %s, je suis un %s et je mange de l'%s", tata.getName(), tata.getFamille(), tata.getNourriture());

    }

}
