class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void running(){
        System.out.println("Tommy is running");
    }
}
class Square{
    int side;
    public int arae(){
        return side*side;
    }
    public int Perimeter(){
        return 4*side;
    }
}
public class problem {

    public static void main(String[] args) {

        Square sq = new Square();
        sq.side=3;
        System.out.println("Side of the square is : " + sq.side);
        System.out.println("area of square: " + sq.arae());
        System.out.println("perimeter of square: "+ sq.Perimeter());
     Tommy t = new Tommy();
     t.running();
     t.hit();

    }
}
