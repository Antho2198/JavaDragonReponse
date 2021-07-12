import java.util.Scanner;

public class Methode4 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderPrenom();
        String adresse = demanderAdresse(prenom);
        boolean estValide = validerAdresse(adresse);
        afficherAurevoir(prenom, estValide);
    }

    public static String demanderAdresse(String prenom) {
        System.out.println("Bonjour " + prenom + ", quelle est ton adresse ?");
        return kb.nextLine();
    }

    public static boolean validerAdresse(String adresse) {
        System.out.println("Ton adresse est bien : " + adresse + " ?");
        System.out.println("Entrez 1 si oui ou autre chiffre si c'est non");
        return kb.nextInt() == 1;

    }

    public static void afficherAurevoir(String prenom, boolean valide) {
        if (valide) {
            System.out.println("D'accord c'est note, au revoir " + prenom);

        } else {
            System.out.println("Désolé, nous ne trouvons pas votre adresse " + prenom);
        }
    }

    public static String demanderPrenom() {
        System.out.println("Bonjour, quel est ton prenom ?");
        return kb.nextLine();
    }

}
