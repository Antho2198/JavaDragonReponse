import java.util.Scanner;

public class TrouveMoiSiTuPeux {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("v1.2");
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
        System.out.println(solution);
        int vie = 5;
        if (niveau <= 10) {
            vie = 2;
        } else if (niveau <= 30) {
            vie = 3;
        } else if (niveau <= 60) {
            vie = 4;
        }
        int nbreEssai = 0;
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
        nbreEssai++;
        while (essai != solution && vie > 1) {
            if (essai < solution) {
                System.out.println("C'est trop petit ressaye et il te reste : " + --vie + " vie"
                        + ((vie == 2) ? ("s") : "") + ".");
            } else {
                System.out.println("C'est trop grand ressaye et il te reste : " + --vie + " vie"
                        + ((vie == 2) ? ("s") : "") + ".");
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
                }
                essai = clavier.nextInt();
            }
            nbreEssai++;
        }
        if (solution == essai) {
            System.out.println("BRAVOOOOO CHAMPION, vous avez trouvé en " + nbreEssai + " coup"
                    + ((nbreEssai == 1) ? ("") : ("s")) + "");
        } else {
            System.out.println("Dommage la bonne réponse était : " + solution);
        }
    }
}