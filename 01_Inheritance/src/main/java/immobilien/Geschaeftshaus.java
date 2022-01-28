package immobilien;

public class Geschaeftshaus extends Immobilie {
    private double lagerFlaeche;
    private double bueroFlache;

    public Geschaeftshaus(String besitzer, int baujahr, double preis, double lagerFlaeche, double bueroFlache) {
        super(besitzer, baujahr, preis);
        this.lagerFlaeche = lagerFlaeche;
        this.bueroFlache = bueroFlache;
    }

    public double getLagerFlaeche() {
        return lagerFlaeche;
    }

    public void setLagerFlaeche(double lagerFlaeche) {
        this.lagerFlaeche = lagerFlaeche;
    }

    public double getBueroFlache() {
        return bueroFlache;
    }

    public void setBueroFlache(double bueroFlache) {
        this.bueroFlache = bueroFlache;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("Sie hat " + lagerFlaeche + "m^2 Lagerfläche und " + bueroFlache + "m^2 Bürofläche.");
    }

    public static void main(String[] args) {
        Geschaeftshaus testliegenschaft = new Geschaeftshaus("Hans", 1970, 650000, 2000, 200);

        testliegenschaft.print();
    }
}
