package OOPS;

abstract class Car{

    public abstract void drive();
    //as we use abstract method so the class also be abstract


    public void playMusic(){
        System.out.println("Music is playing...");
    }
}

class Tesla extends Car{

    //the drive() is must be deifined as drive() is abstract from extends class Car
    public void drive(){
        System.out.println("Tesla is driving...");
    }
}
 


public class abstruction {
    public static void main(String[] args) {

        // Car c = new Car(); //we cant do this as Car is abstract class

        Car t = new Tesla();
        t.drive();
        t.playMusic();



    }
}
