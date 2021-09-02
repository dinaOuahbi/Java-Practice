package pack1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, result=0;
        int operator;
        System.out.println("Entrer deux nb : ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Choisir operateur :\n- 1 ==> add \n- 2 ==> sous \n- 3 ==> div \n- 4 ==> prod \n- 5 ==> mod ");
        operator = sc.nextInt();

        switch (operator){
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2; 
                break;
            case 3:
                result = n1 / n2;
                break;
            case 4:
                result = n1 * n2;
                break;
            case 5:
                result = n1 % n2;
                break; 
        }

        System.out.println("Resultat : "+result);
        sc.close();

    }
}
