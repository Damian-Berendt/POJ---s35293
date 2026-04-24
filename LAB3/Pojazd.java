
public class Pojazd extends Maszyna {

    protected double moc;
    protected double momentObrotowy;

    protected static int maxLiczbaPojazdow = 0;
    protected int nrPojazdu;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;

        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;

    }

    public void wyswietl() {
        System.out.println("=== POJAZD ===");
        System.out.println(" - Pojazd: " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println(" - Marka: " + marka);
        System.out.println(" - Nazwa: " + nazwa);
        System.out.println(" - Pojemnosc Silnika: " + pojemnoscSilnika);
        System.out.println(" - Rodzaj Silnika: " + rodzajSilnika);
        System.out.println(" - Moc : " + moc);
        System.out.println(" - Moment Obrotowy: " + momentObrotowy);
        System.out.println("");
    }


}
