package OOPS;

class A{
    public A(){
        System.out.println("class A construct.");
    }
    public A(int n){
        System.out.println("class A parameter constructor.");
    }
}

class B extends A{
    public B(){
        // super(); //bydefault insert it
        // this(20);
        super(233);

        System.out.println("class B construct.");
    }

    public B(int a){
        System.out.println("class B parameter Constructor.");
    }
}




public class superMethodANDthisMethod {
    public static void main(String[] args) {
        B c = new B();
        System.out.println(c);
    }
    
}
