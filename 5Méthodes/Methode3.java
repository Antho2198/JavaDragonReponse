import java.util.Scanner;
public class Methode3 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderPrenom();
        afficherResultat(prenom, demanderNom(prenom), demanderQtt());
    }

    public static String demanderPrenom() {
        System.out.println("Entrez votre prenom");
        return kb.nextLine();
    }

    public static String demanderNom(String prenom) {
        System.out.println("Bonjour " + prenom + ", quel est votre nom de famille ?");
        return kb.nextLine();
    }

    public static void afficherResultat(String prenom, String nom, int qtt) {
        if (qtt > 25) {
            System.out.println("Désole  " + prenom + " " + nom + ", nous n'avons plus assez de stock");

        } else {
            System.out.println("Biensur, votre commande sera prete dans 30 minutes.");
        }

    }

    public static int demanderQtt() {
        System.out.println("Quelle quantite voulez vous commander ?");
        return kb.nextInt();
    }

}
