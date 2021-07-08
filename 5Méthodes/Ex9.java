import java.util.Scanner;

public class Ex9 {
    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        String prenom = demanderPrenom();
        int age = demanderAge();
        afficherResultat(prenom, age);

    }

    public static int demanderAge() {
        System.out.println("Entrez votre age");
        while (!clavier.hasNextInt()) {
            System.out.println("Entrez un age valide");
            clavier.next();
        }
        int age = clavier.nextInt();
        return age;
    }

    public static String demanderPrenom() {
        System.out.println("Entrez votre prenom");
        String prenom = clavier.nextLine();
        while (prenom.equals("")) {
            System.out.println("Entrez un prénom valide");
            prenom = clavier.nextLine();
        }
        return prenom;
    }

    public static void afficherResultat(String prenom, int age) {
        System.out.println("Bonjour " + prenom + " vous avez : " + age + " ans.");
       while(age>120||age<0){
           System.out.println("Entrez un age valide, menteur");
            age = clavier.nextInt();
            
       }
       
         if (age > 17) {
            System.out.println("Tu es donc majeur, tu peux rentrer");
        } else {
            System.out.println("Tu es donc mineur, tu peux cirer le trottoir dehors.");
        }
    }
}