package pack1;
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        // condition if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une note : ");
        double n = sc.nextDouble();

        if (n>=10){
            System.out.println("vous avez la moyenne");
        }else{
            System.out.println("vous n'avez pas de moyenne");
        }

        //// calcules
        System.out.println("Entrer un nb : ");
        double nb = sc.nextDouble();

        System.out.println("le double de "+nb+" est "+2*nb);
        System.out.println("le carre de "+nb+" est "+nb*nb);
        System.out.println("le cube de "+nb+" est "+nb*nb*nb);

      
        /// exercice
        System.out.println("Entrer 2 nb : ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble(); 

        if (n1>n2){
            System.out.println(n1+" sup a "+n2);

        }else if (n1==n2){
            System.out.println(n1+" et "+n2+" sont egaux");
        }else{
            System.out.println(n1+" inf a "+n2);
        }

        sc.close();




    }
}
