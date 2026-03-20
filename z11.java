
public class z11 {
    public static boolean czyPanagram(String tekst){
        tekst = tekst.toLowerCase();
        boolean[] alfabet = new boolean[26];
        for (int i = 0; i < tekst.length(); i++){
            char litera = tekst.charAt(i);
            int pozycja = litera - 'a';
            if (pozycja >= 0 && pozycja < 26){
                alfabet[pozycja] = true;
            }
        }
        for (int i = 0; i < 26; i++){
            if (!alfabet[i]){
                return false;
            }
        }
    return true;
    }
    
  public static void main(String[] args) {
    String tekst = "The quick brown fox jumps over the lazy dog";
    System.out.println(czyPanagram(tekst));
  }
}


