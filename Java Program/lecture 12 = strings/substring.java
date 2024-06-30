
public class substring {

    public static void main(String[] args) {
        
        String name = "TonyStark";
        String takenWord = name.substring(0, 5);

    
        //NOTE: (0,6) real means --> (0,5)
        //      (a,n) real means --> (a, n-1)
        //(a, name.length()) real means --> (a, [name.length()-1])

        
        System.out.println(takenWord);

    }
}