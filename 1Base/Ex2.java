import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre nom");
        String nom = clavier.nextLine();
        System.out.println("Entrez votre âge");
        int age = clavier.nextInt();
        
          if(nom.equals("")){
            System.out.println("Entre un nom chef");
        } else if (age < 0) {
            System.out.println("T'es pas né chef, tu me prends pour un jambon toi");
        } else if (age <= 17) {
            System.out.println("Bonjour  " + nom  + " vous êtes mineur, allez jouer à Diablo.");
        } else if (age <= 100) {
            System.out.println("Allé rentre bg");
        } else if (age > 100) {
            System.out.println("Bonjour  " + nom + ", "
                    + "vous êtes majeur mais sans doute mort à moins que vous soyez la Reine d'Anglettere ;)");
        }
    }
}
