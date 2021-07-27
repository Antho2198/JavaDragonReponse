import java.util.Scanner;

public class entrainement {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Votre somme est : " + addition());
    }

    public static int demanderEntier() {
        System.out.println("entrez un entier");
        while (!kb.hasNextInt()) {
            System.out.println("Un entier svp");
            kb.next();
        }
        return kb.nextInt();
    }

    public static int addition() {
        int nbre1 = demanderEntier();
        int nbre2 = demanderEntier();
        return nbre1 + nbre2;
    }
}
