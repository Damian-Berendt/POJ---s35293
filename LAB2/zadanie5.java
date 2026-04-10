/* Damian Berendt - zadanie 5
Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer. Dodaj metody: - sum(),
 zwraca sumę liczb; - average(), zwraca średnią arytmetyczną liczb; - min(), zwraca najmniejszą z liczb; - max(),
 zwraca największą z liczb; - geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program. */

class Numbers {
    private int number1;
    private int number2;
    private int number3;

    public Numbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int sum() {
        return number1 + number2 + number3;
    }

    public double average() {
        return (double) (number1 + number2 + number3) / 3;
    }

    public int max() {
        int max = Math.max(number1, number2);
        max = Math.max(max, number3);
        return max;
    }

    public int min() {
        int min = Math.min(number1, number2);
        min = Math.min(min, number3);
        return min;
    }

    public double geometric() {
        return Math.cbrt(number1 * number2 * number3);
    }
}

public class zadanie5 {
    public static void main(String[] args) {
        Numbers numbers1 = new Numbers(3, 6, 8);
        System.out.println("SUM: " + numbers1.sum());
        System.out.println("AVERAGE: " + numbers1.average());
        System.out.println("MAX: " + numbers1.max());
        System.out.println("MIN: " + numbers1.min());
        System.out.println("GEOMETRIC: " + numbers1.geometric());
    }
}
