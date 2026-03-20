import java.util.Scanner;

public class z4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Podaj a, b i c: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    if (a < 0 || b < 0 || c < 0){
        System.out.println("BŁĄD");
    }
    else if ( (a + b > c) && (a + c > b) && (b + c > a)){
        System.out.printf("TAK");
    }
    else{
        System.out.printf("NIE");
    }
  }
}
