/* Damian Berendt - zadanie 2
Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność (wyrażonej w procentach) oceny z POJ (typu int).
 Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko, pola powinny być ustawione wartością "Unknown".
  Dodaj odpowiednie metody set i get do wszystkich pól klasy. Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2.
  Przetestuj program, tworząc trzy różne obiekty klasy Student. */

class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private int ocenaPOJ;
    private double obecnosc;

    public Student(String imie, String nazwisko, int numerIndeksu, double obecnosc, int ocenaPOJ) {
        this.imie = (imie == null || imie.length() == 0) ? "Unknown" : imie;
        this.nazwisko = (nazwisko == null || nazwisko.length() == 0) ? "Unknown" : nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.obecnosc = obecnosc;
        this.ocenaPOJ = obecnosc < 50 ? 2 : ocenaPOJ;
    }

    public Student(int numerIndeksu, double obecnosc, int ocenaPOJ) {
        this.imie = "Unknown";
        this.nazwisko = "Unknown";
        this.numerIndeksu = numerIndeksu;
        this.obecnosc = obecnosc;
        this.ocenaPOJ = obecnosc < 50 ? 2 : this.ocenaPOJ;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = (imie == null || imie.length() == 0) ? "Unknown" : imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = (nazwisko == null || nazwisko.length() == 0) ? "Unknown" : nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
        if (obecnosc < 50) {
            this.ocenaPOJ = 2;
        }
    }

    public int getOcenaPOJ() {
        return ocenaPOJ;
    }

    public void setOcenaPOJ(int ocenaPOJ) {
        if (obecnosc >= 50) {
            this.ocenaPOJ = ocenaPOJ;
        }
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        Student student1 = new Student("Damian", "Berendt", 1, 100, 5);
        Student student2 = new Student("Jan", null, 2, 80, 4);
        Student student3 = new Student(3, 40, 3);
        System.out.println("Wyświetlenie stworzonych studentów: ");
        System.out.println(student1.getImie() + " " + student1.getNazwisko() + " " + student1.getNumerIndeksu() + " " + student1.getObecnosc() + " " + student1.getOcenaPOJ());
        System.out.println(student2.getImie() + " " + student2.getNazwisko() + " " + student2.getNumerIndeksu() + " " + student2.getObecnosc() + " " + student2.getOcenaPOJ());
        System.out.println(student3.getImie() + " " + student3.getNazwisko() + " " + student3.getNumerIndeksu() + " " + student3.getObecnosc() + " " + student3.getOcenaPOJ());
        student3.setImie("Bartek");
        student3.setNazwisko("Statek");
        System.out.println("Wyświetlenie zmienionego studenta3: ");
        System.out.println(student3.getImie() + " " + student3.getNazwisko() + " " + student3.getNumerIndeksu() + " " + student3.getObecnosc() + " " + student3.getOcenaPOJ());

    }
}
