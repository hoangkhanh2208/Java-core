import java.util.Scanner;

public class B3ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int sum = 0;
        int sumchan = 0;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập mảng index thứ [" + i + "]");
            arr[i] = sc.nextInt();
        }

        System.out.print("DS mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // System.out.print("\n\nDS mảng gồm các số chẵn :");
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0) {
        //         System.out.print(arr[i] + " ");
        //         sumchan += arr[i];
        //     }
        // }

        // System.out.println("Tổng các số chẵn : " + sumchan);

        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }

        // System.out.println("Tổng : " + sum);

        // System.out.println("Sắp xếp theo thứ tự tăng dần:");

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] >= arr[j]) {
        //            int temp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //         }
        //     }
        // }

        // System.out.print("DS mảng theo thứ tự tăng dần");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println("Sắp xếp theo thứ tự giảm :");

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] <= arr[j]) {
        //             int temp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //         }
        //     }
        // }

        // System.out.print("DS mảng theo thứ tự giảm dần: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println("Các số nguyên tố có trong mảng: ");

        for (int i = 0; i < 10; i++) {
            if (laSoNguyenTo(arr[i]))
                System.out.println(arr[i]);

        }
        

    }
    
    public  static boolean laSoNguyenTo(int n){
     if (n == 1) return false;
     for (int i = 2; i <= Math.sqrt (n); i ++)
          if (n% i == 0) return false;
     return true;
    }
}
