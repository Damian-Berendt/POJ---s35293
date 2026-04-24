
public abstract class Maszyna {
    public enum RodzajSilnika {
        SPALINOWY, ELEKTRYCZNY, HYBRYDOWY, PAROWY
    }

    ;
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;

    public Maszyna(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

    public abstract void wyswietl();

}