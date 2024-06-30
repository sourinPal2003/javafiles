package OOPS;

class A{

}

class B extends A{

}



class Parent{
    String name;
    int age;

    

    public void profession(){
        System.out.println("is Farmer");
    }
    

    // (i) return type: parent > child [here, A>B]
    // (ii) private>default>protected>public
    // here we can give same named fn in child ,same as(or his child) return type of  parent

    protected A fn(){
        System.out.println("hii");
        return new A();
    }

}

class Child extends Parent{


    //If we not rewrite(overridding) the profession() method, by default child take parents profession
    public void profession(){
        System.out.println("is Developer");
    }
    


    public B fn(){
        System.out.println("hello");
        return new B();
    }
}


public class overriding {
    public static void main(String[] args) {
        
        Child c1 = new Child();
        c1.profession();
        

    }
    
}