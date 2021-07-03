import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez votre nom");
        String nom = clavier.nextLine();

        while (nom.equals("")) {
            System.out.println("Recommence bg");
            nom = clavier.nextLine();
        }
        System.out.println("Entrez votre âge");
        int age = clavier.nextInt();

        while (age < 0 || age > 120) {
            System.out.println("T'abuses du bail chacal, recommence.");
            age = clavier.nextInt();
        }
        if (age > 18) {
            System.out.println("Bonjour " + nom + " tu peux rentrer.");
        } else {
            System.out.println("Bonjour " + nom + " tu peux pas rentrer.");

        }
    }
}