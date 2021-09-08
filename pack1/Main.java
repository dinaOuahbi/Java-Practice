package pack1; // package qui supporte ma class 

// syntaxe sous forme de bloque
public class Main { 
    public static void main(String[] args) {
        /*
        //////////////////////////string////////////////////////////////////////
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.println(txt.length());

        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf('H'));

        // concatenate 
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        // escape a caractere with backslash
        String esc = "We are the so-called \"Vikings\" from the north.";
        System.out.println(esc);
        */

        /////////////////// MATH ///////////////////////////////////////

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Math.max(2,4));
        
        Math.max(numbers[0], numbers[1]);
        for(int i=0; i<numbers.length; i++){
            System.out.println(Math.max(numbers[i], numbers[i+1]));
        }
    }
}
