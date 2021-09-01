package pack1;

import java.util.Scanner;
public class ScanUser {

    public static void main(String[] args) {
        

        // create scanner object (in java.utile)

        Scanner sc = new Scanner (System.in); 

        // ask user to enter the input
        System.out.println("Enter your name please: ");

        // create var that w'll stock user input
        String name; 
        name = sc.nextLine();
        // print the var

        System.out.println("Your name is : "+name);

        // Exercice : pg ask two numbers ==> computesum, pdt, qu, mpdulo => print results

        System.out.println("Entrer deux nombres : ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();

        int sum = a+b; 
        int prd = a*b; 
        int qu = a/b; 
        int mod = a%b; 

        System.out.println("sum : "+sum+"\n prd : "+prd+"\n quotient : "+qu+"\n modulo : "+mod);
        

        sc.close();



    }
    
}
