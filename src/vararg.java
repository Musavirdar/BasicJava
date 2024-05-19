public class vararg {
    // by using ... we pack arguments in array
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("sum is " + sum(1,2,3,4,5));
        System.out.println("nothing " + sum( ));
        System.out.println("sum is " + sum(1,23,5,8));

    }
}
