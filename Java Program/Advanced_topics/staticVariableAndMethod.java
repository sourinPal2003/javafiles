package Advanced_topics;

class Mobile{
    String brand;
    int price;

    //static variable
    static String typeName;   //intialized once, when class loaded for first object initialized

    //static block
    static{
        System.out.println("its a static block. worked when class is loaded(initialized when first obj is created or another way class is loaded )");
    }
    public void show(){
        System.out.println("Mobile type:"  + typeName + " price:" + price + " brand:" + brand );
    }

    //static function
    public static void fn(){
        System.err.println("I am a static function in Mobile class. without creating Mobile class's Obj i called directly");
        System.out.println("TypeName : " + typeName); //only static variable directly called
    }

}
public class staticVariableAndMethod{


    @SuppressWarnings("static-access")
    public static void main(String args[]){

        // Class.forName("Mobile"); //--> without created object class loaded way

        Mobile obj1 = new Mobile();
        obj1.brand= "samsung";
        obj1.price= 78000;
        obj1.typeName="mymobile"; //we can't write that way. We write this with class name not object name.
        obj1.show();
        
        Mobile.typeName = "phone";    //change typeName in all object 
        
        Mobile obj2 = new Mobile();
        obj2.brand= "redmi";
        obj2.price= 12000;
        
        obj1.show();
        obj2.show();

        Mobile.fn(); //directly called without created object 
        
    }
}
