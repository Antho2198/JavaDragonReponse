import java.util.Scanner;
public class Methode2 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderPrenom();
        int age = demanderAge(prenom);
        afficherBonjour(prenom, age);

    }

    public static String demanderPrenom() {
        System.out.println("Entrez votre prenom");
        return kb.nextLine();
    }

    public static int demanderAge(String prenom) {
        System.out.println("Bonjour " + prenom + ", quel age as tu?");
        return kb.nextInt();
    }

    public static void afficherBonjour(String prenom, int age) {
        System.out.println("Bonjour " + prenom);
        if (age < 18) {
            System.out.println("Malheuresement " + prenom + ", tu es mineur.");
        } else {
            System.out.println("Heuresement tu es majeur, tu peux entrer " + prenom);
        }
    }
}
