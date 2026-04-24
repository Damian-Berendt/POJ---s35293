import java.util.ArrayList;

class ParkMaszynowy {

    public static void main(String[] args) {
        Lokomotywa lokomotywa1 = new Lokomotywa("ŁTZ", "M62 Gagarin", 73.4, Maszyna.RodzajSilnika.SPALINOWY, Lokomotywa.TypLokomotywy.TOWAROWA, 2);
        Lokomotywa lokomotywa2 = new Lokomotywa("Siemens", "Vectron", 6.4, Maszyna.RodzajSilnika.ELEKTRYCZNY, Lokomotywa.TypLokomotywy.PASAZERSKA, 1);

        Kosiarka kosiarka1 = new Kosiarka("Husqvarna", "LC137i", 0.9, Maszyna.RodzajSilnika.ELEKTRYCZNY, false, true, 3);
        Kosiarka kosiarka2 = new Kosiarka("Melekser", "WW23MLKSR", 6.7, Maszyna.RodzajSilnika.SPALINOWY, true, true, 2);

        Pojazd pojazd1 = new Pojazd("Lamborghini", "Traktor2026", 40, Maszyna.RodzajSilnika.SPALINOWY, 200, 1600);
        Pojazd pojazd2 = new Pojazd("TSS", "Stefan Batory", 1000, Maszyna.RodzajSilnika.PAROWY, 8500, 6256);

        Samochod samochod1 = new Samochod("Fiat", "Punto", 3, Maszyna.RodzajSilnika.SPALINOWY, 54, 86, "JYA3UYE08MA010862", Samochod.Segment.B);
        Samochod samochod2 = new Samochod("Ferrari", "12Cilindri", 6.5, Maszyna.RodzajSilnika.SPALINOWY, 830, 9500, "1FTZR45E05PA45253", Samochod.Segment.E);

        Jednoslad jednoslad1 = new Jednoslad("NAVEE ", "V25i PRO", 5.1, Maszyna.RodzajSilnika.ELEKTRYCZNY, 0.6, 50, Jednoslad.TypJednosladu.HULAJNOGA_ELEKTRYCZNA);
        Jednoslad jednoslad2 = new Jednoslad("KELLYS", "Cliff 10", Jednoslad.TypJednosladu.ROWER);

        ArrayList<Maszyna> listaMaszyn = new ArrayList<>();
        listaMaszyn.add(lokomotywa1);
        listaMaszyn.add(lokomotywa2);
        listaMaszyn.add(kosiarka1);
        listaMaszyn.add(kosiarka2);
        listaMaszyn.add(pojazd1);
        listaMaszyn.add(pojazd2);
        listaMaszyn.add(samochod1);
        listaMaszyn.add(samochod2);
        listaMaszyn.add(jednoslad1);
        listaMaszyn.add(jednoslad2);

        for (Maszyna maszyna : listaMaszyn) {
            maszyna.wyswietl();
        }

        kosiarka1.setLiczbaOstrzy(5);
        kosiarka1.wyswietl();
    }

}