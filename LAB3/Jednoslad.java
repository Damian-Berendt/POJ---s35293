
public class Jednoslad extends Pojazd {
    public enum TypJednosladu {
        ROWER, MOTOCYKL, HULAJNOGA_ELEKTRYCZNA, JEDNOKOLOWIEC, MONOCYKL, MOTOROWER
    }

    protected TypJednosladu typJednosladu;

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, TypJednosladu typJednosladu) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typJednosladu = typJednosladu;
    }

    public Jednoslad(String marka, String nazwa, TypJednosladu typJednosladu) {
        super(marka, nazwa, 0, null, 0, 0);
        this.typJednosladu = typJednosladu;
    }

    @Override
    public void wyswietl() {
        System.out.println("=== JEDNOSLAD ===");
        System.out.println(" - Pojazd: " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println(" - Marka: " + marka);
        System.out.println(" - Nazwa: " + nazwa);
        if (pojemnoscSilnika != 0) {
            System.out.println(" - Pojemnosc Silnika: " + pojemnoscSilnika);
        }
        if (rodzajSilnika != null) {
            System.out.println(" - Rodzaj Silnika: " + rodzajSilnika);
        }
        if (moc != 0) {
            System.out.println(" - Moc : " + moc);
        }
        if (momentObrotowy != 0) {
            System.out.println(" - Moment Obrotowy: " + momentObrotowy);
        }
        System.out.println(" - Typ jednosladu: " + typJednosladu);
        System.out.println("");
    }

}

