import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int m = sc.nextInt();
        // int n = sc.nextInt();

        // int a[][] = new int[m][n];

        int[][] b = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }

        int count = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                count++;
            }
        }
        System.out.println(count);
    }

    
}
