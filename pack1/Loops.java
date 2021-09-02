package pack1;

public class Loops {
    public static void main(String[] args) {
        // Boucle while
        int n = 0;
         
        while(n<=10){  // display n from 0 to 10
            System.out.println(n+"\n");
            n++;
        }

        // Boucle do while : le pg entre au moins une fois dans la boucle

        int x = 2; 
        do {
            System.out.println(x);
        }while(x>3);

        // Boucle for 
        for(int i=0; i<=5; i++){
            System.out.println(i+"\t");
        }

        // boucle for fait a la fois línitialisation, la condition et líncrementation

    }
}
