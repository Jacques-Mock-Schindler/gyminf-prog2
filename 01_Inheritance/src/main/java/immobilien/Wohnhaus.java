package immobilien;

public class Wohnhaus extends Immobilie{
    int wohnungen;

    public Wohnhaus(String besitzer, int baujahr, double preis, int wohnungen) {
        super(besitzer, baujahr, preis);
        this.wohnungen = wohnungen;
    }

    public int getWohnungen() {
        return wohnungen;
    }

    public void setWohnungen(int wohnungen) {
        this.wohnungen = wohnungen;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Die Liegenschaft hat " + wohnungen + " Wohnungen.");
    }

    public static void main(String[] args) {
        Wohnhaus testwohnung = new Wohnhaus("Hans", 1970, 650000, 5);
        testwohnung.print();
    }
}
