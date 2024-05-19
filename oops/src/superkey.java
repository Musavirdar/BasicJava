class Mus{
    int a;
    Mus(int v){
       this.a = v;
       this.a = a;
    }
    public int getA() {
        return a;
    }


    public int One(){
        return 1;
    }
}
class Musi extends Mus{
     Musi(int c){
         super(c);

         System.out.println("Musi's class constructor");
     }
}
public class superkey {
    public static void main(String[] args) {


        Mus e = new Mus(64);
        Musi m = new Musi(5);
        System.out.println(e.getA());

    }
}