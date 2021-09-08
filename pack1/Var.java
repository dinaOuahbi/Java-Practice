package pack1;
import java.util.Scanner; 
public class Var {

    public static void main(String[] args) {
        /* different type de variable 
        int double float string boolean ...*/
        
        // variable types : 
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        //boolean myBool = true;
        String myText = "Hello";

        System.out.println(myFloatNum+'\t'+myLetter+'\t'+myLetter+'\t'+myText+'\t'+myNum);


        //concatenate two variable
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int age = 3; 
        String pseudo = "dinaton";

        // print variables
        System.out.println(pseudo+" ==> "+age);
        age+=12; 
        System.out.println(pseudo+" ==> "+age);

        // calcule the mean
        int a,b,c;
        a = 12; 
        b=14;
        c=16; 
        int avg = (a+b+c)/3; 
        System.out.println("la moyenne des notes est ==> "+avg); 

        ////////////// CASTING ==> change variable type//////////////////

         int x = 7;
         int y = 2; 
         double result; 
         result = (double) x/ y;
         System.out.println("sum ==> "+result);

        //// permute two values
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer deux valeurs :");
        int x1 = sc.nextInt(); 
        int x2 = sc.nextInt(); 
        System.out.println("Before permutation : \n x1 = "+x1+" \n x2 = "+x2);

        int temp = x1;
        x1 = x2; 
        x2 = temp; 
        System.out.println("after permutation : \n y = "+x1+" \n y = "+x2);

        sc.close();


    }
    
}
