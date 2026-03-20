import java.util.Scanner;

public class z10 {
  public static void main(String[] args) {
    try{
        int[][] tab;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a i b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 0 || b < 0){
            System.out.println("BŁĄD");
            return;
        }
        tab = new int[a][b];
        System.out.println("Podaj liczby: ");
        for (int i=0; i < a; i++){
            for (int j=0; j < b; j++){
                tab[i][j] = scanner.nextInt();
            }
        }
        
        for (int i=0; i < b; i++){
            for (int j=0; j < a; j++){
                System.out.printf(tab[j][i] + " ");
            }
        }        
        
    }
    catch (Exception e){
        System.out.println("BŁĄD");
        return;
    }
    
}
}
