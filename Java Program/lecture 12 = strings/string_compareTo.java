
public class string_compareTo {
    public static void main(String[] args) {
        
        String n = "a";
        String m = "B";
        if(n.compareTo(m)==0){
            System.out.println("n=m");
        }
        else if(n.compareTo(m)>0){
            System.out.println("n>m");
        }
        else{
            System.out.println("n<m");
        }

    }
    
}