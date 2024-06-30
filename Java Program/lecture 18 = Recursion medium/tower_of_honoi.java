/**
 * tower_of_honoi
 */
public class tower_of_honoi {

    public static void honoi(int n, String src , String hlp, String dst){
        if(n==1){
            System.out.println("disk "+n+" transfer from "+src+" to "+dst);
            return;

        }

        honoi(n-1, src, dst, hlp);
        System.out.println("disk "+n+" transfer from "+src+" to "+dst);

        honoi(n-1, hlp, src, dst);
    }

    public static void main(String[] args) {

        honoi(5,"source","helper", "destination");


    }
}