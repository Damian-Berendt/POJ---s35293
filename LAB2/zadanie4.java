/*Damian Berendt - zadanie 4
Zaimplementuj klasę Clock. Klasa zawierać będzie pola: hours, minutes, seconds. Zmienna hours przyjmuje wartości z zakresu 0-23, minutes z zakresu 0-59, seconds 0-59. Dodaj trzy konstruktor: - domyślny -
 inicjalizuje godzinę 12:00:00; - konstruktor zawierający trzy parametry: hours, minutes, seconds, - konstruktor z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól: hours, minutes, seconds.
  Dodaj metody: - getHours(), getMinutes(), getSeconds(), bez parametrów, które zwracają odpowiednie wartości; - setHours(), setMinutes(), setSeconds(), z jednym parametrem, który ustawia odpowiednie wartości; - tick(), bez parametrów,
   która inkrementuje wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02; wartość 00:59:59 zmieni się na 01:00:00; - tickDown(), zmniejsza wartość sekund o jedno; analogiczna do tick(); - toString(), bez parametrów,
   zwraca reprezentację obiektu w postaci "[hh-mm-ss]", uzupełnioną o nieznaczące zera, na przykład: "[03:12:56]". Przetestuj zaimplementowany program.

 */
class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    private void setTimeFromSeconds(int timeInSeconds) {
        if (timeInSeconds < 0) {
            timeInSeconds += 86400;
        }
        timeInSeconds = timeInSeconds % 86400;
        this.hours = timeInSeconds / 3600;
        int remainingSeconds = timeInSeconds % 3600;
        this.minutes = remainingSeconds / 60;
        this.seconds = remainingSeconds % 60;
    }

    public Clock(int timeInSeconds) {
        setTimeFromSeconds(timeInSeconds);
    }

    public void tick() {
        int currentTimeInSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        setTimeFromSeconds(currentTimeInSeconds + 1);
    }

    public void tickdown() {
        int currentTimeInSeconds = (this.hours * 3600) + (this.minutes * 60) + this.seconds;
        setTimeFromSeconds(currentTimeInSeconds - 1);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 24) {
            this.hours = hours;
        } else {
            System.out.println("BŁĄD - godziny poza zakresem (ustawiona wartość: 12");
            this.hours = 12;
        }
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("BŁĄD - minuty poza zakresem (ustawiona wartość: 0");
            this.minutes = 0;
        }
    }


    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("BŁĄD - sekundy poza zakresem (ustawiona wartość: 0");
            this.seconds = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }

}


public class zadanie4 {
    public static void main(String[] args) {

        System.out.println("konstruktor domyślny: ");
        Clock clock1 = new Clock();
        System.out.println(clock1);

        System.out.println("konstruktor z 3 parametrami + tick() i tickdown(): ");
        Clock clock2 = new Clock(23, 59, 59);
        System.out.println(clock2);
        clock2.tick();
        System.out.println(clock2);
        clock2.tickdown();
        System.out.println(clock2);

        System.out.println("konstruktor z 1 parametrem: ");
        Clock clock3 = new Clock(3661);
        System.out.println(clock3);

        System.out.println("konstruktor z blędnymi wartościami: ");
        Clock clock4 = new Clock(60, 20, 120);
        System.out.println(clock4);
    }
}
