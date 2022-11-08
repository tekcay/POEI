package Ferme;

public abstract class Animal {

    private String name;
    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return "";
    }

    public String getFamille() {
        return "";
    }

    public String getNourriture() {
        return "";
    }

    public void print() {
        System.out.printf("Je m'appelle %s", this.name);
    }




}
