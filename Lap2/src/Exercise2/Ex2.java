package Exercise2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Nhập vào số nguyên dương n: ");
        n = sc.nextInt();

        long f0 = 0;
        long f1 = 1;
        long fn = 0;

        System.out.println("Dãy fibonaci: ");
        
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                System.out.print(i + "\t");
            }
            else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.print(fn + "\t");
           }
        }
    }

}
