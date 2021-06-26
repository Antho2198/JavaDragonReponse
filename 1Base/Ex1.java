import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre nom");
         String nom = clavier.nextLine();
        System.out.println("Entrez votre âge");
        int age = clavier.nextInt();
        

    if(age<=17){
        System.out.println("Bonjour"+" "+nom+" "+"vous êtes mineur, allez jouer à Diablo.");
    }else{
        System.out.println("Bonjour"+"  "+nom+" "+"vous êtes majeur, allez jouer à Docteur Maboul ;)");
    }
    }    

} 
