public class reccursion {

    static int recur(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n*recur(n-1);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("fact" + recur(4));
    }
}