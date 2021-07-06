import java.util.Scanner;

public class Ex7 {
    static Scanner clv = new Scanner(System.in);
    public static void main(String[] args) {
        String prenom = demanderPseudo();
        int age = demanderAge();
        repondre(age, prenom);
    }
    public static  String demanderPseudo() {
        System.out.println("Bonjour entrez votre prenom ");
        return clv.nextLine();
    }
    public static int demanderAge(){
        System.out.println("Entrez votre age");
        return clv.nextInt();
    }
    public static void repondre(int age , String prenom){
        if (age <= 17) {
            System.out.println("Bonjour " + prenom  + " vous êtes mineur, allez jouer à Diablo.");
        } else {
            System.out.println("Bonjour " + prenom  + " vous êtes majeur, allez jouer à Docteur Maboul ;)");
        }
    }
}