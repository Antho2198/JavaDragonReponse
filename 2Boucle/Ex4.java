import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre");
        Scanner clavier = new Scanner(System.in);
        int nombre = clavier.nextInt();
        while (nombre != 0) {
            System.out.println("Entre un autre nombre");
            nombre = clavier.nextInt();
        }
        System.out.println("Au revoir");
    }
}