
public class Samochod extends Pojazd {
    public enum Segment {
        A, B, C, D, E, F, G, H
    }

    protected String vin;
    protected Segment segment;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, String vin, Segment segment) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.vin = vin;
        this.segment = segment;

    }


    @Override
    public void wyswietl() {
        System.out.println("=== SAMOCHOD ===");
        System.out.println(" - Pojazd: " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println(" - Marka: " + marka);
        System.out.println(" - Nazwa: " + nazwa);
        System.out.println(" - Pojemnosc Silnika: " + pojemnoscSilnika);
        System.out.println(" - Rodzaj Silnika: " + rodzajSilnika);
        System.out.println(" - Moc : " + moc);
        System.out.println(" - Moment Obrotowy: " + momentObrotowy);
        System.out.println(" - VIN : " + vin);
        System.out.println(" - Segment: " + segment);
        System.out.println("");
    }
}
