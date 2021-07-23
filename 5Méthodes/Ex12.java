import java.util.Scanner;

public class Ex12 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderNom();
        int age = demanderAge(prenom);
        ageAutorise(prenom, age);

    }

    public static String demanderNom() {
        System.out.println("Bonjour, quel est votre prénom ?");
        return kb.nextLine();
    }

    public static int demanderAge(String prenom) {
        System.out.println("Bonjour " + prenom + " quel âge as-tu ?");
        while (!kb.hasNextInt()) {
            System.out.println("J'ai demandé un âge chef");
            kb.next();
        }
        return kb.nextInt();
    }

    public static void ageAutorise(String prenom, int age) {
        if (age < 18) {
            System.out.println("Désole " + prenom + " mais tu es mineur, au revoir.");
        } else if (age > 17) {
            System.out.println("Super !" + prenom
                    + " tu es majeur tu peux donc jouer à cette liste de jeux : Roulette,blackJack, poker");
        }
    }
}
