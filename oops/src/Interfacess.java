// in english Interface is a point where two systems meet and interact
// in JAVA Interface is a group of related methods with empty bodies
interface Bicycle{
    int a =45;
    void applyBreak(int decrement);
    void Speedup(int increment);
}
interface hornBicycle{

    void blowwHorn();
    void blowHorn2();
}
class AvonCycle implements Bicycle, hornBicycle{
    void blowhorn(){
        System.out.println("blowing Horn");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void Speedup(int increment) {
        System.out.println("increasing the speed");
    }

    @Override
    public void blowwHorn() {
        System.out.println("horn-bicycle method blowwHorn");
    }

    @Override
    public void blowHorn2() {
        System.out.println("hornbicycle method blowHorn2");
    }
}
public class Interfacess {
    public static void main(String[] args) {
        AvonCycle cm = new AvonCycle();
        cm.applyBreak(1);
        // we can't modify the properties in the interfaces.
        System.out.println(cm.a);
        cm.blowwHorn();
        cm.blowHorn2();

    }
}
