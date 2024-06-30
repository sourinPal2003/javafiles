import java.util.*;

public class twoD_arrays {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int row = Sc.nextInt();
        int column = Sc.nextInt();

        int [][] number = new int [row][column];

        //Input...................................
        for(int i = 0 ; i< row ; i++){
            for(int j = 0 ; j< column; j++){
                number[i][j] = Sc.nextInt();

            }
        }

        //Output..................................
        for(int i = 0 ; i< row ; i++){
            for(int j = 0 ; j< column; j++){
                System.out.print(number[i][j] + " ");    
            }
                System.out.println();
        }
        Sc.close();
    }
    
}