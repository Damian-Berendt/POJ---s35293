import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwa ciągi tekstowe (rozdzielone spacją: )");
        String napis1 = scanner.next();
        String napis2 = scanner.next();
        System.out.println("\"%" + napis2 + " " + napis1 + "%\"");

    }
}
