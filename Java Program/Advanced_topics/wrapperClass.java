package Advanced_topics;

public class wrapperClass {
    public static void main(String[] args) {
        
        int a = 10;
        
        @SuppressWarnings("removal")
        Integer b = new Integer(a);   //boxing
        Integer c = a;   // Auto-boxing

        System.out.println(b);
        System.out.println(c);
        
        int d = c.intValue(); //unboxing
        int e = c; //auto-unboxing
        
        System.out.println(d);
        System.out.println(e);


    }
}
