package homework;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào n kích thước mảng: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[10];

        inputArray(arr, n);

        System.out.println("Danh sách mảng: ");
        getArray1(arr, n);

        System.out.println("\n\nSố lớn nhất trong mảng: " + maxArray(arr, n));

        System.out.println("\nSố nhỏ nhất trong mảng: " + minArray(arr, n));     
        
        prime(arr, sum);

        System.out.println("\nNhập giá trị muốn thêm: ");
        int x = sc.nextInt();

        System.out.println("\nNhập vị trí muốn thêm: ");
        int k = sc.nextInt();

        chen(arr, n, x, k);

        System.out.printf("Danh sách mảng sau khi thêm giá trị [%d] vào vị trí [%d]: \n" , x , k);
        getArray2(arr, n);
    }

    static void inputArray(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào index thứ " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    static void getArray1(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void getArray2(int arr[], int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    


    static int maxArray(int[] arr, int n) {
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minArray(int[] arr, int n) {
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    static void prime(int arr [] ,int sum) {
        System.out.print("\n\nCác số nguyên tố có trong mảng: ");

        for (int i = 0; i < 10; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + "\t");
                sum += arr[i];
            }

        }

        System.out.println("\n\nTổng các số nguyên tố có trong mảng là: " + sum);
    }

    static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;

    }
    
    static void chen(int [] arr, int n , int x ,int k) {
        for(int i = n; i > k;i--){
            arr[i] = arr[i-1];
        }  
        arr[k] = x;
    }
}
