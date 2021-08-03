import java.util.Scanner;
import java.util.Arrays;
public class Ex15 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int tab[] = new  int [demanderEntierEntre5et15()];
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            tab[i]=demanderEntierEntre5et15();
            System.out.println(Arrays.toString(tab));
        }
    }
    public static int demanderEntierEntre5et15() { 
        System.out.println("Bonjour entrez un entier");
        while (!kb.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plait.");
            kb.next();
        }
        int entier = kb.nextInt();
        while (entier > 15 || entier < 5) {
            System.out.println("Entre 5 et 15 svp.");
            while (!kb.hasNextInt()) {
                System.out.println("Entrez un entier s'il vous plait.");
                kb.next();
                
            }
            entier = kb.nextInt();
            
        }
        return entier;
    }
}
