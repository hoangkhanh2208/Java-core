import java.util.Scanner;

public class Ex2 {

//     Viết chương trình nhập vào mảng A có n phần tử, các phần tử là những số
//     nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.print("Nhập n số phần tử của mảng: ");
        n = sc.nextInt();

        int[] A = new int[n];

        nhapMang(A, n);

        xuatMang(A, n);

       System.out.println("Index: " + soLonThuHai(A, n) + "Value: " );

       

        

    }

    static void nhapMang(int[] A, int n) {
        for (int i = 0; i < A.length; i++) {
            do {
                System.out.print("Index thứ " + i + ": ");
                A[i] = sc.nextInt();

                if(100 <= A[i] || A[i] <= 0){
                    System.out.println("Giá trị bạn nhập không thỏa mãn ĐK. Mời bạn nhập lại. ĐK: 0 < n < 100");
                }
            } while (100 <= A[i] || A[i] <= 0);
        }
    }

    static void xuatMang(int[] A, int n) {
        System.out.println("\nDanh sách mảng: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + "  ");
        }
    }
    
    static void minArray(int[] A, int n) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }

    }
    
    static int soLonThuHai(int[] A, int n) {
        int firstMax, secondMax;
        if (A[0] > A[1]) {
            firstMax = A[0];
            secondMax = A[1];
        } else {
            firstMax = A[1];
            secondMax = A[0];
        }

        for (int i = 2; i < n;i++){
            if (A[i] >= firstMax) {
                secondMax = firstMax;
                firstMax = A[i];
            } else if (A[i] > secondMax) {
                secondMax = A[i];
            }
        }
        return secondMax;
    }
}