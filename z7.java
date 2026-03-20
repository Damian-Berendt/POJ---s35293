import java.util.Scanner;

public class z7 {
  public static void main(String[] args) {
    try {
        Scanner scanner = new Scanner(System.in);
        int[] tab1;
        int[] tab2;
        System.out.println("Podaj n i m: ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("BŁĄD");
            return;
        }
        int m = scanner.nextInt();
        if (m < 0){
            System.out.println("BŁĄD");
          return;
        }
        if (n == m){
            tab1 = new int[n];
            tab2 = new int[m];
            System.out.println("Podaj " + n + " liczb/y: ");
            for (int i = 0; i <n; i++){
                tab1[i] = scanner.nextInt();
            }
            System.out.println("Podaj " + m + " liczb/y: ");
            for (int i = 0; i <m; i++){
                tab2[i] = scanner.nextInt();
            }
            int iloczynSkalarny = 0;
            for (int i = 0; i < n; i++){
                iloczynSkalarny += tab1[i] * tab2[i];
            }
            System.out.println("Wynik: " + iloczynSkalarny);
        }
        else {
            System.out.println("BŁĄD. Nie można policzyc iloczynu skalarnego dla dwóch wektorów (tutaj tablic) o innej liczbie współrzednych");
        }
    } catch (Exception e) {
        System.out.println("BŁĄD");  
      }
    }
  }


