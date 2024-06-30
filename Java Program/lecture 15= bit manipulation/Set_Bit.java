/**
 * Set_Bit
 */
public class Set_Bit {

    public static void main(String[] args) {
        int num = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        int newNum = bitMask|num;
        System.out.println(newNum);
    }
}