class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;

    }
    public double area(){
        System.out.println(area());
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle{
    public int height;

    Cylinder1(int r, int h) {
        System.out.println("i am cylinder"  );
      //  System.out.println("the volume is %d:",area());

        super(r);
        this.height = h;

    }
    public double volume(){
        System.out.println("volue");
        return Math.PI*this.radius*this.radius*height;

    }
}
public class volumeOfCircle {
    public static void main(String[] args) {
   Cylinder1 C = new Cylinder1(10,5);
   C.area();
   C.volume();
       

    }
}
