import java.util.Scanner;

public class B3ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Nhập số hàng: ");
        // int n = sc.nextInt();
        // System.out.println("Nhập số cột: ");
        // int m = sc.nextInt();

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");

        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        int[][] arr1 = {{10,20,3},{43,54,66},{72,83,90}};

       
        
        System.out.println("DS mảng 2 chiều: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("Các số chia hết cho 5: ");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr1[i][j] % 5 == 0) {
                            System.out.print(arr1[i][j] + "\t");
                        }
                    }
                  
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arr1[i][j] % 5 == 0) {
                            sum += arr1[i][j];
                        }
                    }

                }

                System.out.println("Tổng của mảng 2 chiều: " + sum);
        
                // int[][] c = new int[3][3];

                // for (int i = 0; i < 3; i++) {
                //     for (int j = 0; j < 3; j++) {
                //         c[j][i] = arr1[i][j];
                //     }

                // }
                
                // for (int i = 0; i < 3; i++) {
                //     for (int j = 0; j < 3; j++) {
                //         System.out.print(c[i][j] + "\t");
                //     }
                //     System.out.println();
                // }


    }
}
