package pack1;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // comparer deux nb
        /*System.out.println("Entrer deux nombres reels : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        double max = 0; 
        if (a>b){
            max = a; 
        }else{
            max=b;
        }

        System.out.println("le max est :"+max); 

        // comparer trois nb
        System.out.println("Entrer trois nb : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double max1; 

        max1 = n1; 
        if(n2>n1){
            max1 = n2;
        }else if (n3>n2){
            max1 = n3; 
        }
        System.out.println("le max est "+max1); */

    
         //comparer trois nb avec les operateur logique
         System.out.println("Entrer trois nb : ");
        double nb1 = sc.nextDouble();
        double nb2 = sc.nextDouble();
        double nb3 = sc.nextDouble();
        double max2 = 0; 

        if(nb1>nb2 && nb1>nb3){
            max2 = nb1; 
        }else if (nb2>nb1 && nb2>nb3){
            max2 = nb2; 
        }else{
            max2 = nb3; 
        }
        System.out.println("le max est "+max2);

        // tester si deux des trois nb sont egaux

        if (nb1==nb2 || nb1 == nb3 || nb2 == nb3){
            System.out.println("deux des trois nb sont egaux");
        }else{
            System.out.println("aucun 2 nb des 3 sont agaux");
        }


        sc.close();
    }
}
