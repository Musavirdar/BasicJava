// multiple inheritance is allowed in JAVA, it will create problems
// but we can achieve it by using Interfaces.
// A class can implements multiple Interfaces
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }  public void meth2(){
        System.out.println("meth2");
    }  public void meth3(){
        System.out.println("meth3");
    }  public void meth4(){
        System.out.println("meth4");
    }


}
public class Multi_Inheritance {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        childSampleInterface csi = new MySampleClass();
        csi.meth2();
        msc.meth3();
        msc.meth4();
    }
}
