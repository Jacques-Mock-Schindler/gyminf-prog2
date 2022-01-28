package immobilien;

public class Immobilie {
    private String besitzer;
    private int baujahr;
    private double preis;

    public Immobilie(String besitzer, int baujahr, double preis) {
        this.besitzer = besitzer;
        this.baujahr = baujahr;
        this.preis = preis;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void print() {
        System.out.print("Die Immobilie von ");
        System.out.print(besitzer);
        System.out.print(" aus dem Jahr ");
        System.out.print(baujahr);
        System.out.print(" hat einen Wert von CHF ");
        System.out.println(preis + ".");
    }
}