package OOPS;

class Student{
    String name;
    char sec;
    int roll;

    //Constructor
    /*Constructor name == class name
     * no need to return enything even void
     * we can also multiple construct(constructor overloading) using (1.different parameter 2.number of parameter 3.order of parameter may differ for same parameter) 
     */
    public Student(){
        System.out.println("Created object (non parameter)");
        //we can also another constructor in another constructor
        //?? this("demoName");

    }

    //NOTE: bydefault, methods are not public they are default
    
    public Student(String name){
        //parameter name and class variable name same so reduct the confusion we use class var as this.varname
        this.name=name;
        System.out.println("Created object for "+this.name+" (parameter)");
    }
    
    public void showDetails(){
        System.out.println("I "+name+" from Sec: "+sec+", Roll: "+roll);
    }
}
public class basic {

    public static void main(String[] args) {

        Student fst;
        fst=new Student();

        fst.name="Sourin";
        fst.sec='C';
        fst.roll=185;

        fst.showDetails();
        

        Student snd=new Student("Hera");
        snd.sec='b';
        snd.roll=20;

        snd.showDetails();


    }
}
