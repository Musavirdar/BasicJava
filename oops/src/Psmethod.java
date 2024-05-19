// in this file it shows diffrence betweenn public and static method.

public class Psmethod {
    // static method
    static void StaticMethod(){
        System.out.println("this is static method");
        // it can be accessed without craeting an Object of the class

    }

   // public method
    public void PublicMethod(){
        System.out.println("this is a public method");

    }

    public static void main(String[] args) {

        // calling the static method
        StaticMethod();

        // but for public Method before calling we had to create an object
         Psmethod myobj = new Psmethod();
         myobj.PublicMethod();

    }
}
