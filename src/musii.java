import java.util.Scanner;
public class musii {
    static void Musavir(String fname ){
        System.out.println(fname + "musasvir");
    }
    // return values
    static int mymethod(int x){
        return x + 10;
    }
    // store the results in a variable

    static int nizzz(int y, int a){
        return y + a;

    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int s = sc.nextInt();
        System.out.println(s);

        int z = nizzz(5,7);
        System.out.println(z);
        System.out.println("testing");

    Musavir("dar");
        System.out.println(mymethod(3));
        int k = 0;
        do {
            System.out.println(k);
            k++;

        }
        while(k<=50);
        // arrays

        int[] musa ={1,2,3,45,6,8};
        for (int o = 0; o< musa.length; o++)
        System.out.println(musa[o]);
     String[] name ={"musaDUB","haseeb"};

}}
