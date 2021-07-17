import java.util.Scanner;

public class Ex11 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("v1.3");
        System.out.println("Bonjour");
        int niveau = demanderNiveau();
        int solution = nombreHasard(niveau);
        System.out.println(solution);
        int tentative = demanderEntierEntre(1, niveau);
        while (tentative != solution) {
            if (tentative < solution) {
                System.out.println("Ressayez c'est plus grand");
            }else{
                System.out.println("Ressayez c'est plus petit");
            }
           tentative = kb.nextInt();
            }
            if (tentative == solution) {
                System.out.println("BRAVOOOO champion!");
        }
    }

    public static int demanderEntierEntre(int min, int max) {
        while (!kb.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plait.");
            kb.next();
        }
        int resultat = kb.nextInt();
        while (resultat < min || resultat > max) {
            System.out.println("Entre " + min + " et " + max);
            while (!kb.hasNextInt()) {
                System.out.println("Entrez un entier s'il vous plait.");
                kb.next();
            }
            resultat = kb.nextInt();
        }
        return resultat;
    }

    public static int demanderNiveau() {
        System.out.println("Entrez un niveau de difficulté entre 5 et 100");
        return demanderEntierEntre(5, 100);
    }

    public static int nombreHasard(int niveau) {
        return (int) ((Math.random() * niveau) + 1);
    }

}
