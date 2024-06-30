/**
 * delete
 */
public class delete {

    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("TonyStark");

        name.delete(2, 5);
        //delete the part ""yst"

        System.out.println(name);
    }
}