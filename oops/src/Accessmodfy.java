class MyFriend{
   private int id;
    private String name;

    public String getName(){
        return name;
    }
    // getter -> Returns the value.[accessors]
    // setter -> Sets/updates the value.[mutators]
    public void setName(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class Accessmodfy {
    // access Modifiers specific where a property/ method is accessible .
   /* there are 4 type of access modifiers
   1. private 2. Default 3. protected 4. public
    */
    public static void main(String[] args) {
        MyFriend Haseeb = new MyFriend();
        // Haseeb.id = 1;
        // Haseeb.name ="TP haseeb"; // these errors come because we private id and name
        Haseeb.setName("TP haseeb");
        System.out.println(Haseeb.getName());
        Haseeb.setid(1);
        System.out.println(Haseeb.getId());

    }
}
