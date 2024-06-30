
public class fibonacci_series {

    public static void printFib(int a, int b , int n){
        if(n==0){
            return;
        }

        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, 10);

    }
}