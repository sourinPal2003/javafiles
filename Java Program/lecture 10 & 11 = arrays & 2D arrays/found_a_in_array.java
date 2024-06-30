import java.util.*;

public class found_a_in_array{
    

    
    public static void main(String[]args){
        
        Scanner Sc = new Scanner(System.in);
        
        int size = Sc.nextInt();
        int [] number = new int [size];

        //input........................................

        for(int i = 0; i<number.length; i++ ){

          number [i] = Sc.nextInt();
        }
        
      
        int a = Sc.nextInt();
        Sc.close();

        //output........................................


       for(int i = 0; i<number.length; i++ ){
            if(number[i]==a){
                System.out.println(a + " is found at index :- " + i);

            }
       }
        
        
    }
       
    
    
    
    
}
