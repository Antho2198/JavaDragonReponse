import java.util.Scanner;
import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Bonjour veuillez entrer un entier entre 3 et 9 s'il vous plaît.");
        Scanner kb = new Scanner(System.in);
        while (!kb.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plaît .");
            kb.next();
        }
        int entier = kb.nextInt();
        while (entier < 3 || entier > 9) {
            System.out.println("Un entier entre 3 et 9.");
            while (!kb.hasNextInt()) {
                System.out.println("Entrez un entier s'il vous plaît .");
                kb.next();
            }
            entier = kb.nextInt();
        }
        int tab1[] = new int[entier];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i;
        }
        System.out.println(Arrays.toString(tab1));
    }
}
