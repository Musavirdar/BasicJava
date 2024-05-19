import org.w3c.dom.ls.LSOutput;

import javax.lang.model.element.Name;

class Animal{
    protected String Name = "dog";
    public void Sound(){
        System.out.println("dog barks");
    }

}
class dog extends Animal{
    private String name = "sound";


}
class pracinheri{
    public static void main(String[] args) {
        dog mydog = new dog();
        Animal a = new Animal();
        mydog.Sound();
        System.out.println(mydog.Name);


    }
}