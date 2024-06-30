import java.util.*;
public class equation_solve{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("if the two equation is aX + bY = c and dX + eY = f input the value of a,b,c and d,e,f     ");
        System.out.print("a = ");
 float a =sc.nextFloat();
 
 System.out.print("b = ");
 float b =sc.nextFloat();
 
 System.out.print("c = ");
 float c =sc.nextFloat();
 
 System.out.print("d = ");
 float d =sc.nextFloat();
 
 System.out.print("e = ");
 float e =sc.nextFloat();
 
 System.out.print("f = ");
 float f =sc.nextFloat();

 sc.close();
 
                 
      System.out.println("You entered the two equation is :");
   System.out.println(a+"X + "+b+"Y = " + c);
   System.out.println(d+"X + "+e+"Y = " + f);           
                 
   a = a*e;
   b = b*e;
   c = c*e;
   
   d = d*(b/e);
   f = f*(b/e);
   e = e*(b/e);
   
   
   
   float m = (c-f)/(a-d);
   float n = (c-(a*m))/b ;
   
   System.out.println("X = " + m);
   System.out.println(" and Y = " + n);
        
     
        
    }
}