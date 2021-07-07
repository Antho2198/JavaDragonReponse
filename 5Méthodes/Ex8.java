import java.util.Scanner;

public class Ex8 {
    static Scanner clv = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderPseudo();
        int age = demanderAge();
        repondre(age, prenom);
    }

    public static String demanderPseudo() {
        System.out.println("Bonjour entrez votre prenom ");
        String prenom = clv.nextLine();
        while (!checkPrenom(prenom)) {
            System.out.println("Entrez un prénom valide");
            prenom = clv.nextLine();
        }
        return prenom;
    }

    public static int demanderAge() {
        System.out.println("Entrez votre age");
        int age = clv.nextInt();
        while(!checkAge(age)){
            System.out.println("Entrez un âge valide");
            age=clv.nextInt();
        }
        return age;
    }

    public static void repondre(int age, String prenom) {
        if (age <= 17) {
            System.out.println("Bonjour " + prenom + " vous êtes mineur, allez jouer à Diablo.");
        } else {
            System.out.println("Bonjour " + prenom + " vous êtes majeur, allez jouer à Docteur Maboul ;)");
        }
    }

    public static boolean checkPrenom(String prenom) {
        return !(prenom.equals(""));
    }

    public static boolean checkAge(int age) {
        return !(age < 0 || age > 120);
    }
}