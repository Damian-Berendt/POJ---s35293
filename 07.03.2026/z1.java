import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, pole;
        System.out.println("Podaj A: ");
        a = scanner.nextInt();
        System.out.println("Podaj B: ");
        b = scanner.nextInt();
        pole = a * b;
        System.out.println("Pole: " + pole);

    }
}
