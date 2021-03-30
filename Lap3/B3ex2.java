import java.util.Scanner;

public class B3ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
       
        String[] arr = new String[n];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập index thứ [" + i + "]");
            arr[i] = sc.nextLine();
        }

        System.out.println("DS mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index thứ [" + i + "]" + arr[i]);
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("Java")) {
                count++;
            }
        }

        System.out.println("Số lần chuỗi JAVA xuất hiện trong mảng: " + count);

        System.out.println("Nhập chuỗi bất kì kiểm tra: ");
        String check = sc.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (check.equals(arr[i])) {
                System.out.println("Chuỗi " + check + " ở vị trí index thứ: " + i);
                break;
            }
        }


        


    }
}
