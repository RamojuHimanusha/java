package javaprograms;
public class TwoDArrays {
    public static void main(String[] args) {
        int a[][] = {{3, 4, 5}, {4, 6, 3}, {1, 3, 2}};
        System.out.println("array:" + a[0][1]);
        System.out.println("sum:" + (a[1][2] + a[1][1]));
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
