package pack1;

import java.util.Scanner;

public class Methods{
    static int n1,n2;
    public static void main(String[] args) {
        read();
        minus(n1, n2);
        add(n1, n2);
        System.out.println("Moyenne est : "+average(n1, n2)); 
    }




    public static void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer deux nombres : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
    }
    public static void add(int n1, int n2){
        int res = n1+ n2; 
        System.out.println("Addition : "+res);
    }
    public static void minus(int n1, int n2){
        int res = n1- n2; 
        System.out.println("Substraction : "+res);
    }
    // method that return double
    public static double average(int n1, int n2){
        double avg = (double)(n1+n2)/2;
        return avg; 
    }
    // surchage : same method name 
    public static void add(double n1, double n2){
        double res = n1+ n2; 
        System.out.println("Addition : "+res);
    }
    

    
}