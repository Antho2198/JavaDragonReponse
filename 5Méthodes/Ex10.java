import java.util.Scanner;

public class Ex10 {
    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
         demanderEntier();
         entreeEntier();
    }

    public static void demanderEntier() {
        System.out.println("Entrez un entier");
        while (!clavier.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plaît.");
            clavier.next();
        }
            clavier.nextInt();
    }

    public static void entreeEntier() {
        int entree;
        System.out.println("Entrez un entier, entrez 0 si vous voulez quitter.");
        while (!clavier.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plaît.");
            clavier.next();
        }
        entree = clavier.nextInt();
        while (!estNull(entree)) {
            System.out.println("Entrez un autre entier, entrez 0 si vous voulez quitter.");
            while (!clavier.hasNextInt()) {
                System.out.println("Entrez un entier s'il vous plaît.");
                clavier.next();
            }
            entree = clavier.nextInt();
        }

    }
    public static boolean estNull(int entree) {
        return (entree == 0);
    }
}
