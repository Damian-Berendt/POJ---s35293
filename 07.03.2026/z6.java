import java.util.Scanner;

public class z6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Podaj 3 liczby rzeczywiste: ");
    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();
    double number3 = scanner.nextDouble();
    double temporary;
    if (number1 < number2){
        temporary = number1;
        number1 = number2;
        number2 = temporary;
    }
    if (number1 < number3){
        temporary = number1;
        number1 = number3;
        number3 = temporary;
    }
    
    if (number2 < number3){
        temporary = number2;
        number2 = number3;
        number3 = temporary;
    }
    
    System.out.println(number3 + " " + number2 + " " + number1);
    System.out.println(number1 + " " + number2 + " " + number3);
  }
}
