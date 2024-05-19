class A{
    public int a;
    public void meth4(){
        System.out.println("i am method 4 in classs A");
    }

    public void meth1(){
        System.out.println("i am method 1 in class A");


    }
    public void meth2(){
        System.out.println("i am method 2 in class A");
    }
}
class B extends A {
    public int b;
    @Override
   public void meth1(){
       System.out.println("i am method 1 in class B");
   }

   @Override
   public void meth2(){
       System.out.println("I am method 2 in class b");
   }
   public void meth3(){
       System.out.println("i am method 3 in class B");
   }
}
public class Methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.meth1();
        b.meth1();
        b.meth3();
        b.meth4();


    }
}
