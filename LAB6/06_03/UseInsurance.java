import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance selectedInsurance = null;

        System.out.println("Insurance types:");
        System.out.println("1. Life)");
        System.out.println("2. Health");
        System.out.print("Choose your insurance: ");

        String input = scanner.nextLine();

        if (input.equals("1") || input.equals("Life")) {
            selectedInsurance = new Life();
        }
        else if (input.equals("2") || input.equals("Health")) {
            selectedInsurance = new Health();
        }
        else {
            System.out.println("Error");
            System.exit(1);
        }

        selectedInsurance.display();

    }
}