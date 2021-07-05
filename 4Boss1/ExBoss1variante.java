import java.util.Scanner;

public class ExBoss1variante {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Choisissez le niveau de difficulte entre 5 et 100");
        while (!clavier.hasNextInt()) {
            System.out.println("Entrez un entier");
            clavier.next();
        }
        int niveau = clavier.nextInt();
        while (niveau > 100 || niveau < 5) {
            System.out.println("Entre 5 et 100 j'ai dit");
            while (!clavier.hasNextInt()) {
                System.out.println("Entrez un entier ");
                clavier.next();
            }
            niveau = clavier.nextInt();
        }
        final int solution = (int) ((Math.random() * niveau) + 1);
        System.out.println("C'est parti, trouve le nombre entre 1 et " + niveau);
        while (!clavier.hasNextInt()) {
            System.out.println("Entrez un entier ");
            clavier.next();
        }
        int essai = clavier.nextInt();
        while (essai < 1 || essai > niveau) {
            System.out.println("Entre 1 et " + niveau + " j'ai dit");
            while (!clavier.hasNextInt()) {
                System.out.println("Entrez un entier ");
                clavier.next();
            }
            essai = clavier.nextInt();
        }
        int vie = 2;
        while (essai != solution) {
            if (essai < solution && vie > 0) {
                System.out.println("Reessaye c'est plus grand et il te reste : " + vie-- + " vies");
            } else {
                System.out.println("Ressaye c'est plus petit et il te reste : " + vie-- + " vies");
            } if(vie ==-1){
                System.out.println("Perdu la bonne réponse était : "+solution);
                System.exit(0);
            }
            while (!clavier.hasNextInt()) {
                System.out.println("Entrez un entier ");
                clavier.next();
            }
            essai = clavier.nextInt();
            while (essai < 1 || essai > niveau) {
                System.out.println("Entre 1 et " + niveau + " j'ai dit");
                while (!clavier.hasNextInt()) {
                    System.out.println("Entrez un entier ");
                    clavier.next();
                    System.out.println("C'est perdu, la bonne réponse était :" + solution); 
                }
                essai = clavier.nextInt();
            }
        }
        System.out.println("BRAVOOOOO CHAMPION");
    }
}