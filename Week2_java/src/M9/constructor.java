package M9;

public class constructor {
    public String name;

    //constructor
    constructor(){
        System.out.println("Constrctor Called: ");
        name = "Programiz";
    }

    public static void main(String[] args) {
        //const is invoked while
        //creating an object of the constructor class
        constructor obj = new constructor();
        System.out.println("The name is "+ obj.name);
    }
}