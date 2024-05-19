class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 225;
        name = "Your_name_here";
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId(){
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}
class myVox{
    private int Ied;
    private String naav;

    public myVox(){
        naav = "naav-kya-chea";
        Ied = 52;

    }
    public void setIed(int l){
                this.Ied = l;
    }
    public int getIed(){
        return Ied;
    }
    public void setNaav(String nv){
        this.naav =nv;
    }
    public String getNaav(){
        return  naav;
    }


}
public class cons1 {
    public static void main(String[] args) {

        MyMainEmployee musii = new MyMainEmployee();
        myVox mkl = new myVox();
        mkl.setIed(52);
        System.out.println(mkl.getIed());
        System.out.println(musii.getName());
        musii.setName("musavir");
        System.out.println(musii.getName());


    }
}
