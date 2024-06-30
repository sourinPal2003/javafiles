import java.util.*;

public class Update_Bit {

    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        int num = 5; //0101

        System.out.println("Enter the position");
        int pos = Sc.nextInt();

        System.out.println("if you change the position's number into 1 click '1' and if you change the position's number into 0 click '0' ");
        int changesTo = Sc.nextInt();

        int BitMask = 1<<pos;
        int NotBitMask = ~(BitMask);

        if(changesTo==1){
         int newNum = BitMask|num;
         System.out.println(newNum);

        }else if(changesTo==0){
            int newNum = NotBitMask&num;
            System.out.println(newNum);
        }

        else{System.out.println("only input 1 or 0");}


        Sc.close();
    }
}