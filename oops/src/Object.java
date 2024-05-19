import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

// in this file we see how to create a class and object
class Cellphone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void Calling(){
        System.out.println("calling Haseeb");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}
class Employee{
    int id;
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void Details(){
        System.out.println("my name is " + name);
        System.out.println("my Id is " + id);
    }
}


public class Object {
    // create a class, NOTE in java there is only one public class


    int x = 10;
    int y = 5;
    public static void main(String[] args) {

        Object myObj1 = new Object();
        Object myObj2 = new Object();
        // for accessing the attributes or getting the value from Object we use '.'
        // we can also modify the attributes values
        myObj1.x=40;
        System.out.println(myObj1.x);
       System.out.println(myObj2.y);
       // here we create an Object to class Employee
        Employee musavir = new Employee(); // instantiating a new Employee object
        Employee Jhon = new Employee();
        // setting properties(Attributes) for Musavir.
        musavir.id = 24;
        musavir.name = "Dar";
        musavir.salary = 85000000;
        // setting Attributes for Jhon.
        Jhon.id = 54;
        Jhon.salary = 5500;
        Jhon.name = "Jhonny";


        System.out.println(musavir.id);
        System.out.println(musavir.name);


        Cellphone asus = new Cellphone();
        asus.Calling();
        asus.vibrating();
        asus.ringing();




    }
}

// Here is an example of real world Object = properties + Behaviour.
//                          Object in oops = Attributes + Methods.