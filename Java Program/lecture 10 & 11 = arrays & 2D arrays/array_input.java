import java.util.*;

public class array_input {

    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       
       int size = Sc.nextInt();
       
       int [] number = new int [size];

       //Input...........................................................

       for(int i = 0 ; i<size; i++){
            number [i] = Sc.nextInt();
       }

       //Output..........................................................

       for(int i = 0 ; i<size; i++){
        System.out.println(number[i]);
       }


       Sc.close();
    }
}

