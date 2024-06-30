package OOPS;

interface Animal{
   /*
   NOTE: (i) Interfaces don't have constuctor
         (ii) All the fields in interfaces are public static final by default
         (iii) All the methods are public abstract by default
         (iv) All class that implements an interfaces must implement all methods declared in the interfaces
         (v) Interfaces support the functionality of multiple inheritance

    */        

   int i = 10;
// public static final int i=10; (default in interfaces)

   void walk();
// public abstruct void walk();  (default in interfaces)
   
   void eat();
}


class Horse implements Animal{
    public void walk(){
        System.out.println("walks in 4 legs");
    }

    public void eat(){
        System.out.println("eat vesitable");
    }
}

public class interfaces {
    public static void main(String[] args) {
        
    }
    
}
