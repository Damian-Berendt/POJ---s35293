/* Damian Berendt - zadanie 1
Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart. Klasa powinna przechowywać wartość i kolor: kier,
karo, pik, trefl. W zadaniu użyj typu wyliczeniowego. Napisz program testujący, który stworzy trzy różne obiekty klasy Card. */

class Card {
    public enum Value {
        AS, DWA, TRZY, CZTERY, PIEC, SZESC, SIEDEM, OSIEM, DZIEWIEC, DZIESIEC, WALET, DAMA, KROL
    }

    public enum Color {
        KIER, KARO, PIK, TREFL
    }

    Value value;
    Color color;

    public Card(Value value, Color color) {
        this.value = value;
        this.color = color;
    }


    public String toString() {
        return "Value: " + value + " Color: " + color;
    }
}

public class zadanie1 {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Value.WALET, Card.Color.KARO);
        Card card2 = new Card(Card.Value.PIEC, Card.Color.TREFL);
        Card card3 = new Card(Card.Value.AS, Card.Color.KIER);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}
