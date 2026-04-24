public class Lokomotywa extends Maszyna {
    public enum TypLokomotywy {
        PASAZERSKA, TOWAROWA, MANEWROWA, UNIWERSALNA
    }

    private int ileCzlonowa;
    private TypLokomotywy typLokomotywy;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, TypLokomotywy typLokomotywy, int ileCzlonowa) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.typLokomotywy = typLokomotywy;
        this.ileCzlonowa = ileCzlonowa;
    }

    public void wyswietl() {
        System.out.println("=== LOKOMOTYWA ===");
        System.out.println(" - Marka: " + marka);
        System.out.println(" - Nazwa: " + nazwa);
        System.out.println(" - Pojemnosc Silnika: " + pojemnoscSilnika);
        System.out.println(" - Rodzaj Silnika: " + rodzajSilnika);
        System.out.println(" - Typ Lokomotywy: " + typLokomotywy);
        System.out.println(" - Ile Czlonowa: " + ileCzlonowa);
        System.out.println("");
    }


}
