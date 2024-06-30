/**
 * Get_Bit
 */
public class Get_Bit {

    public static void main(String[] args) {
        int num = 5;  //0101
        int pos = 0;

        int bitMask = 1<<pos;
        if((bitMask & num)==0){
            System.out.println("bit is 0");
        }
        else{System.out.println("bit is 1");}
    }
}