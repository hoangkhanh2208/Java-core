package homework;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.println("Nhập vào n : ");
        n = sc.nextInt();

        do{
            System.out.println("Nhập vào m: ");
            m = sc.nextInt();

            if(m != n){
                System.out.println("giá trị m và n phải bằng nhau. Mời bạn nhập lại!");
            }
        }while(m != n);

        int [][] arr = new int [n][m];

        nhapMang(arr, n, m);      

        getArray(arr, n, m);

        diagonal(arr, n, m);
    }

    static void getArray(int arr[][], int n, int m){
        System.out.println("Danh sách mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void nhapMang(int arr[][], int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập index thứ [" + i + "]" + "[" + j + "]" + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void diagonal(int[][] arr, int n, int m) {
        int sum = 0;
        System.out.println("Danh sách các phần tử nằm trên đường chéo chính: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("\nTổng các phần tử nằm trên đường chéo chính: " + sum);
    }

}