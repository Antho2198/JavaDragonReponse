import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre");
        Scanner clavier = new Scanner(System.in);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.println("Entre un entier chef");
        }
        int i = clavier.nextInt();
        while (i != 0) {
            System.out.println("Vous devez entrer 0");
            while (!clavier.hasNextInt()) {
                clavier.next();
                System.out.println("Entre un entier chef");
            }
            i = clavier.nextInt();
        }
        System.out.println("Bravo.");
    }
}
