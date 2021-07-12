import java.util.Scanner;

public class Methodes {
    static Scanner clv = new Scanner(System.in);
    public static void main(String[] args) {

        // Exemple 1
        String prenom= demanderPrenom();
        afficherBonjour(prenom);
        //Exemple 2 (ca fait la meme chose)
        afficherBonjour(demanderPrenom());
        // Exemple 3
        System.out.println("Entrez votre prenom");
        afficherBonjour(clv.nextLine());
    }

    public static String demanderPrenom() {
        System.out.println("Entrez votre prenom ");
        return clv.nextLine();
    }

    public static void afficherBonjour(String pseudo) {
        System.out.println("Bonjour " + pseudo);
    }

}
