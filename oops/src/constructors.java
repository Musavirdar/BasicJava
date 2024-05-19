// in this we learn about constructors

// a constructor initializes an object immediately upon creation
// a member function used to initialize an object while creating it.
class Mew{
    double side1;
    double side2;
    // creating parameterized constructor
    Mew(double s1, double s2){
        side1 = s1;
        side2 = s2;
    }
    double area(){
        return side1 * side2;
    }
}
class Box{
    double h;
    double w;
    double d;
    // now we deploy or create constructor

    Box() // constructors have the same name as their class
    {
       // System.out.println("constructing Box");
        h = 10;
        d = 10;
        w = 10;
    }
    // now compute and return value
     double volume(){

        return h * w * d;
     }
}
public class constructors {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol ;
        // getting the volume of box
        vol = mybox.volume();
        System.out.println("the volume of the box is " + vol);

        // allocate mew object
         Mew sq = new Mew(10,10);
         double area;
         area = sq.area();
        System.out.println("the area is " + area);


    }
}
