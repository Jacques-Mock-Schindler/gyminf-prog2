package immobilien;

public class Firma{
    public static void main(String[] args) {
        Immobilie i1 = new Immobilie("Hans", 1970, 605000);
        i1.print();
        Wohnhaus w1 = new Wohnhaus("Hans", 1970, 650000, 6);
        w1.print();
        Geschaeftshaus g1 = new Geschaeftshaus("Hans", 1965, 750000, 2000, 150);
        g1.print();
    }
}
