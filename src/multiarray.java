public class multiarray {
    public static void main(String[] args) {
        int[][] mus = {{1, 2, 3}, {5, 4}};
        for (int i = 0; i < mus.length; i++) {
            for (int j = 0; j < mus[i].length; j++) {
                System.out.println(mus[i][j]);
            }
        }
    }}