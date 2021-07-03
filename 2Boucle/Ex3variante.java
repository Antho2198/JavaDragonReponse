import java.util.Scanner;

public class Ex3variante {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez votre nom");
        String nom = clavier.nextLine();
        int i = 0;

        while (nom.equals("") && i < 2) {
            System.out.println("Recommence bg");
            nom = clavier.nextLine();
            i++;
        }
        if (nom.equals("")) {
            nom = "invité";
        }
        System.out.println("Entrez votre âge");
        int age = clavier.nextInt();
        i = 0;
        while ((age < 0 || age > 120) && i < 2) {
            System.out.println("T'abuses du bail chacal, recommence.");
            age = clavier.nextInt();
            i++;
        }
        if (age < 0 || age > 120) {

            age = 0;
        }
        if (age > 18) {
            System.out.println("Bonjour " + nom + " tu peux rentrer.");
        } else {
            System.out.println("Bonjour " + nom + " tu peux pas rentrer.");

        }
    }
}
