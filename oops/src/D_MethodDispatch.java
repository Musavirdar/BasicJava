// super-class
class SmartPhone{

    public void greet(){
        System.out.println("Greeting:");
    }
    public void welcome(){
        System.out.println("welcome to SmartPhone:");
    }
}
// phone is sub-class.
class Phone extends SmartPhone {
    @Override
    public void welcome(){
        System.out.println("you are welcome:");
    }
    public void methh(){
        System.out.println("i am method in sub-class:");
    }
}
public class D_MethodDispatch {
    public static void main(String[] args) {
        //Phone obj = new SmartPhone();
        SmartPhone obj = new Phone();
        // smartphone is here refrence
        obj.greet();
        obj.welcome(); // it runs because it is overridden
        //obj.methh(); it will not run. we have to make separate object
        Phone obj1 = new Phone();
        obj1.methh(); // now this method will run without any errors.
    }
}
