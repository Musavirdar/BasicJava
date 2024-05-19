class Employeelist{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class Qes {
    public static void main(String[] args) {
        Employeelist musi = new Employeelist();
        musi.setName("musavir");
        musi.salary = 465;
        System.out.println(musi.getName());
        System.out.println(musi.getSalary());

    }
}
