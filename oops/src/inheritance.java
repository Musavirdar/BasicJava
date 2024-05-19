// in this we will learn about inheritance
// inheritance is used to borrow properties and methods from an existing class.

class Base{ // superclass
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("in Base and setting the x");
        this.x = x;
    }

    public void printme(){
        System.out.println("i am a constructor");
    }
}
// inheritance is declared using extends keyword

class Derived extends Base{ // subclass
    // here we create another class named as Derived.
    // we also use the keyword extends which means the properties in Base will be present also in Derived class.
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("setting the y");
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Base b = new Base(); // creating an object of base class
        Derived c = new Derived() ; // creating an object of Derived class
        b.setX(4);
        c.setX(5);
        System.out.println(b.getX());
        System.out.println(c.getX());
        c.setY(4);
        System.out.println(c.getY());
      //  b.sety(); we can't derive elements from derived class from Base class vice versa is true.


    }
}
