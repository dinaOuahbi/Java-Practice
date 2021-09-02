package pack1;

import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tester si un nb est pair ou impair
        System.out.println("Entrer le nb a tester : ");
        int nb = sc.nextInt();

        if (nb%2==0){
            System.out.println(nb+" est paire");
        }else{
            System.out.println(nb+" est impair");
        }

        sc.close();

    }
}
