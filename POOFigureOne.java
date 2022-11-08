class Point {
    protected Integer x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.printf("Point : (%d, %d)%n", this.x, this.y);
    }
}

class Cercle extends Point {
    int rayon;

    public Cercle(int x, int y, int rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.printf("Cercle : (%d, %d) rayon=%d%n", this.x, this.y, this.rayon);
    }
}

class Carre extends Point {
    int cote;

    public Carre(int x, int y, int cote) {
        super(x, y);
        this.cote = cote;
    }

    @Override
    public void affiche() {
        System.out.printf("Carre : (%d, %d) cote=%d%n", this.x, this.y, this.cote);
    }
}

class Rectangle extends Carre {
    int largeur;

    public Rectangle(int x, int y, int cote, int largeur) {
        super(x, y, cote);
        this.largeur = cote;
    }

    @Override
    public void affiche() {
        System.out.printf("Rectangle : (%d, %d) long=%d, lar=%d%n", this.x, this.y, this.cote, this.largeur);
    }
}





class  POOFigureOne {
    // Xavier

    public static void main(String[] args)  {

        Point p1 = new Point(5, 6);
        p1.affiche();
        // (5, 6)

        Cercle c1 = new Cercle(11, 61, 45);
        c1.affiche();
        // (5, 6)

        Carre k1 = new Carre(18, -3, 15);
        k1.affiche();
        // Carre : (5, 6) cote=15
        Rectangle r1 = new Rectangle(3, 19, 99, 18);
        r1.affiche();
        // Rectangle : (5, 6) long=99 lar=18

    }
}