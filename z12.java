import java.util.Scanner;

public class z12 {

    public static double obliczWiek(long sekundy, String planeta) {
        final double SEKUNDY_ZIEMSKIE = 31557600;
        double sekundyDlaDanejPlanety;
        switch (planeta.toLowerCase()) {
            case "ziemia":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE;
                break;
            case "merkury":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 0.2408467;
                break;
            case "wenus":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 0.61519726;
                break;

            case "mars":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 1.8808158;
                break;
            case "jowisz":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 11.862615;
                break;
            case "saturn":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 29.447498;
                break;
            case "uran":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 84.016846;
                break;
            case "neptun":
                sekundyDlaDanejPlanety = SEKUNDY_ZIEMSKIE * 164.79132;
                break;
            default:
                return -1;
        }
        return Math.round((sekundy / sekundyDlaDanejPlanety) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sekundy;
        System.out.println("Podaj czas (w sekundach): ");
        if (scanner.hasNextLong()) {
            sekundy = scanner.nextLong();
        }
        else{
            System.out.println("BŁĄD");
            return;
        }

        System.out.println("Podaj planetę: ");
        String planeta = scanner.next().toLowerCase();

        double wynik = obliczWiek(sekundy, planeta);
        if (wynik != -1){
            System.out.println(wynik);
        }
        else{
            System.out.println("BŁĄD");
        }
    }
}
