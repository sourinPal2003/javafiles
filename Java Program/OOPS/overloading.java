package OOPS;

class Abc{
    void fn(){
        System.out.println("This fn");
    }

    void fn(String str){
        System.out.println("THis is fn for "+str);
    }

    void fn(int num){
        System.out.println("THis is fn for "+num);
    }

}

public class overloading {
    public static void main(String[] args) {
        Abc x=new Abc();
        x.fn();
        x.fn(30);
        x.fn("sourin");
    }
}
