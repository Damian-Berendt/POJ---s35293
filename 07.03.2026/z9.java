import java.util.Scanner;

public class z9 {
    
    public static void czyPalindrom(char[] tab, int dlugosc){
        for (int i = 0; i<dlugosc; i++){
            if (tab[i] != tab[dlugosc - 1 - i]){
                System.out.println("NIE");
                return;
            }
        }
        System.out.println("TAK");
    }
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] tab = new char[100];
    System.out.printf("Podaj slowo: ");
    if (scanner.hasNext()){
        String slowo = scanner.next();
        
        for (int i = 0; i < slowo.length(); i++){
            tab[i] = slowo.charAt(i);
        }
        
        
        czyPalindrom(tab, slowo.length());
    }
    
    
  }
}
