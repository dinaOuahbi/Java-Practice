package pack1;

import java.util.Scanner;

public class LoopEx{
    public static void main(String[] args) {
        //////////////////////////////////// ask for negative number////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int a; 
        do{
            System.out.println("Entrer un nb negative : ");
            a = sc.nextInt();
        }while (a>0);

        System.out.println("ok, merci !");

        //////////////////////////////////// ask for sum of integer from 1 to 100 ////////////////////////////////////
        int sum=0;
        for (int i=1; i<=100; i++){
            sum+=i; 
        }
        System.out.println("somme 1========>100 : "+sum); 
        ////////////////////////////////////// calcule la puissance en boucle for////////////////////////////////////
        System.out.println("Saisir deux nb entiers positifs : ");
        int base = sc.nextInt();
        int puissance = sc.nextInt();
        int result = 1; 

        for (int i=1; i<=puissance; i++){
            result*=base; 
        }
        System.out.println(base+" puissance "+puissance+" egal a "+result); 

        ////////////////////////////////////// table de multiplication d'un nb entrer par lútilisateur////////////////////////////////////

        System.out.println("Saisir un nb entier : ");
        int nb = sc.nextInt();
        int res = 1; 
        for (int i=1; i<11; i++){
            res = i*nb;
            System.out.println(i+" X "+nb+" ==> "+res); 
        }
              
        ////////////////////////////////////// pg qui demande un entier, quand l'ser ente un 0, pg s'arrete et lui affiche le max 
        int x;
        int max = 0;
        do{
            System.out.print("Saisir un entier ==============> ");
            x = sc.nextInt();
            if(x>max){
                max = x; 
            }
        }while(x!=0);
        System.out.println("Le max est : "+max); 

        ////////////////////////////////////// calcule la factorielle d'un nb saisit////////////////////////////////////

        System.out.println("votre nb ===> ");
        int y = sc.nextInt();
        int fact = 1; 

        for (int i=1; i<=y; i++){
            fact*=i;
        }
        System.out.println("Factorielle de "+y+" est : "+fact); 

        ////////////////////////////////////// affichage de nb de 20 a 1 (3 par 3)////////////////////////////////////

        for (int i=20; i>=0; i--){
            if(i<10)
                System.out.print(" "+i+" ");
            else
                System.out.print(i+" ");
            
            if(i%3==0){
                System.out.println();
            }
            
        }
         
        sc.close();
        
        ////////////////////////////////////FIN////////////////////////////////////


        
    }
}