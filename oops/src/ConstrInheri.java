/* constructor in inheritance
when a Derived class extended from the base class, the constructor of the Base class
is executed first followed by the constructor of the derived class.
 */
class Base1{
    Base1(){
        System.out.println("i am a constructor");
    }
    Base1(int x){
        System.out.println("i am a overloaded constructor with value of x :" + x);
    }
    int x;


}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("i am the constructor of derived class");
    }
    Derived1(int x, int y){
        super(55);

        System.out.println("i am an overloaded constructor of Derived class with value of y : "+ y);
    }
    public int y;


}
class ChildofDerived extends Derived1{

    ChildofDerived(){
        System.out.println("i am a constructor of COD");
    }
    ChildofDerived(int x, int y, int z){
        super(x,y);

        System.out.println("i am an overloaded constructor of COD with value of z :" + z);
    }
}
public class ConstrInheri {
    public static void main(String[] args) {
       // Base1 b = new Base1();
        //Derived1 d = new Derived1(554,456);
        ChildofDerived cod = new ChildofDerived();

    }
}
