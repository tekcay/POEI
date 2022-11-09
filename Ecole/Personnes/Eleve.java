package Ecole.Personnes;

import Ecole.Personnes.Personne;

public class Eleve extends Personne {

    private int note = -1;
    private String classe;

    public Eleve(String name, String classe) {
        super(name);
        this.classe = classe;
    }

    public Eleve(String name, String classe, int note) {
        super(name);
        this.classe = classe;
        this.note = note;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public void getFiche() {
        super.getFiche();
        System.out.printf(", je suis en %s et ma note est %d.\n", this.classe, this.note);
    }


}

