package pack1;

import java.util.Random;
import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {
        /* l'utilisateur saisit un nb, le generateur random genere un nb (1-100), 
        l'utilisateur doit tomber sur le nb aleatoire sinon le pg lui redemande de saisir un nb. entre tempss le nb de tentative est
        incrementer apres chaque saisie */
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int r, nb;
        int tentative = 0; 

        r = rd.nextInt(100)+1;

        do{
            System.out.println("Entrer un nb positif entre 1 est 100 : ");
            nb = sc.nextInt();
            tentative++;
            if(r==nb)
                System.out.println("Bravo! vous avez gagner au bout de "+tentative+" tentatives");
            else if(nb<r)
                System.out.println("Votre nb est plus petit");
            else{
                System.out.println("Votre nb est plus grand");
            }

        }while(r!=nb);

        sc.close();
        
    }
}
