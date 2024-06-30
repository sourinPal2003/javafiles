/**
 * print_n_to_one
 */
public class print_n_to_one {


    public static void printNum(int n){
        if(n==0)
        return;

        System.out.println(n);
        printNum(n-1);

    }



    public static void main(String[] args) {

        int m = 5;
        printNum(m);
        
    }
}