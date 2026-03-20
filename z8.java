import java.util.Scanner;

public class z8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj n: ");
    int n;
    while (true){
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
            if (n >=0){
                break;
            }
            else{
                System.out.println("Błąd - liczba naturalna nie może być ujemna: ");
            }
        }
        else{
            System.out.println("Błąd - podaj liczbę naturalną: ");
            scanner.nextLine();
        }
    }

    for (int i = 1; i <= n; i++){
        for (int j = 0; j < i; j++){
            System.out.printf("*");
        }
        System.out.println();
    }
    for (int i = n; i >= 1; i--){
        for (int j = 0; j < i; j++){
            System.out.printf("*");
        }
    System.out.println();
    }
    String space = " ";
    String star = "*";
    for (int i = 0; i < n; i++){
        System.out.println(space.repeat(i) + star.repeat(n-i));
    }
    for (int i = 1; i<=n; i++){
        System.out.println(space.repeat(n-i) + star.repeat(i));
    }
 
    
  }
   
  }
