
public class reverse_the_word_ {

    public static void printRev(String str , int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
       System.out.print(str.charAt(index));
       printRev(str, index-1); 
    }

    public static void main(String[] args) {

        String str = "amader choto nodi chole ake beke";

      

        printRev(str, str.length()-1);

    }
}