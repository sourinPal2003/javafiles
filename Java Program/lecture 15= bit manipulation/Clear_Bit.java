/**
 * Clear_Bit
 */
public class Clear_Bit {

    public static void main(String[] args) {
        
        int num = 5;
        int pos = 2 ; 

        int BitMask = 1<<pos;
        int NotBitMask = ~(BitMask);

        int NewNum = NotBitMask&num;
        System.out.println(NewNum);
    }
}