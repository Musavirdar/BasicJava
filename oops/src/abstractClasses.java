// Abstract means --> existing in thoughts or as an idea without concrete existance
// Abstract method is declared without an implementation. Abstract void moveTo(double x, double y).
// Abstract Class --> If a class include abstract methods, then the class itself must be declared abstract in it.
abstract class BaseAbs{
    public  BaseAbs(){
        System.out.println("i am BaseAbs class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class childAbs extends BaseAbs{
    @Override
    public void greet() {
        System.out.println("Good Morning");


    }
}
abstract class childAbs1 extends BaseAbs{
    @Override
    public void greet() {
        System.out.println("Good Evening --- childabs1");
    }
}
 class fabstractClasses {
    public static void main(String[] args) {
        childAbs n = new childAbs();
        //childAbs1 ca = new childAbs1(); it will through error
        n.greet();

        childAbs1 cb = new childAbs1() {
            @Override
            public void greet() {
                super.greet();

            }
        };

        cb.greet();


    }
}
