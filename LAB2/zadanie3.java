/* Damian Berendt - zadanie 3
 Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year (type int).
Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
 Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem
 "/", np 21/03/2051. Przetestuj zaimplementowaną klasę.*/

class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = (day >= 0 && day <= 31) ? day : 1;
        this.month = (month >= 0 && month <= 12) ? month : 1;
        this.year = (year >= 1990 && year <= 2050) ? year : 1990;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = (day >= 0 && day <= 31) ? day : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = (month >= 0 && month <= 12) ? month : 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = (year >= 1990 && year <= 2050) ? year : 1990;
    }

    public void displayDate() {
        String dayToString = Integer.toString(day);
        String tempDay = dayToString.length() == 1 ? "0" + dayToString : dayToString;
        String monthToString = Integer.toString(month);
        String tempMonth = dayToString.length() == 1 ? "0" + monthToString : monthToString;
        System.out.println(tempDay + "/" + tempMonth + "/" + year);
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        MyDate mydate1 = new MyDate(12, 10, 2000);
        System.out.println("Wyświetlenie stworzonej pierwszej daty: ");
        mydate1.displayDate();
        System.out.println("Wyświetlenie stworzonej drugiej daty: ");
        MyDate mydate2 = new MyDate(3, 15, 1300);
        mydate2.displayDate();
        mydate2.setMonth(2);
        mydate2.setYear(2005);
        System.out.println("Wyświetlenie zmieniionej drugiej daty");
        mydate2.displayDate();
    }
}
