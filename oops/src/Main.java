//Always remember DRY.
// object is instance of the class
// for creating and object we use two steps
/* 1. is to declare refrence
2. is to allocate object
 */




// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


class Boxer{
    int heigth;
    int width;
    int depth;
    void volume(){
        System.out.println("volume is :");
        System.out.println(heigth*width*depth);
    }
}
class box{
    double Height;
    double width;
    double depth;
}


class Net{
    int number = 10;
    void net1(int n){
        n =10;
        System.out.println(n);
    }
}

public class Main {
    public static void main(String[] args) {
        // here we craete object for the class box
        box myBox = new box();
        myBox.depth= 10;
        myBox.Height =10;
        myBox.width =50;

        // in more open way for creating an object is
        Net mynet; // declaring refrence to object
        mynet = new Net(); // allocating a box object


        mynet.number=10;
        // computing the volume of the box
        double vol;

        vol = myBox.width * myBox.Height *myBox.depth;

        System.out.println("the volume is :" + vol);
        Boxer box1 = new Boxer();
        box1.depth =10;
        box1.width=50;
        box1.heigth=60;

        Boxer box2 = new Boxer();

        box2.heigth =606;
        box2.width =20;
        box2.depth=2;

        box1.volume();
        box2.volume();



    }
}
/* 1.Abstraction -> hiding internal details [ show only essential info!]
* 2.Encapsulation -> The act of putting various components together(in a capsule)
* 3.Inheritance ->  The act of deriving new things from existing things. It implements DRY(don't repeat yourself)
* 4.Polymorphism ->  In simple one entity many forms. e.g smartphone -> is 1.calculator 2. camera 3. phone etc
* */