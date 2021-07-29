import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import jdk.nashorn.api.tree.ForInLoopTree;

import java.util.Arrays;
public class Ex14 {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int tab[] = new  int [demanderEntier()];
        for (int i = 0; i < tab.length; i++) {
            tab[i]=demanderEntier();
            System.out.println(Arrays.toString(tab));
        }
    }
    public static int demanderEntier() { 
        System.out.println("Bonjour entrez un entier");
        while (!kb.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plait.");
            kb.next();
        }
        int entier = kb.nextInt();
        while (entier > 15 || entier < 5) {
            System.out.println("Entre 5 et 15 svp.");
            while (!kb.hasNextInt()) {
                System.out.println("Entrez un entier s'il vous plait.");
                kb.next();
            }
            entier = kb.nextInt();
        }
        return entier;
    }
}
