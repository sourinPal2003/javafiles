/**
 * Factorial_n_by_recursion
 */
public class Factorial_n_by_recursion {
    
    public static int factorials(int n){

        if(n==1|| n==0){
            return 1;
        }

        int factorial_n = n*factorials(n-1);
        return factorial_n;

    }
    public static void main(String[] args) {
        int ans = factorials(10);
        System.out.println(ans);
    }
}