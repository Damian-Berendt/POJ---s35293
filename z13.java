import java.util.Scanner;

public class z13{
    public static int maxElementTablicy(int[] tab, int i){
        if (i<=0){
            return tab[i];
        }
        int max = maxElementTablicy(tab, i - 1);

        return Math.max(tab[i], max);
    }

    public static void main(String[] args) {

        int[] tab = {5, 1, 2, 4, 7, 3};

        System.out.println(maxElementTablicy(tab,tab.length - 1));
    }
}
