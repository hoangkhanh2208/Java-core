import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm vào để kiểm tra: ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.printf("Year %d is a leap year", year);
        }
        else {
            System.out.printf("Year %d is NOT a leap year", year);
            
        }
    }
}