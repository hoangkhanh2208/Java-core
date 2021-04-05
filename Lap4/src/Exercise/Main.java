package Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên cần thêm: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhân viên thứ " + (i + 1));
            employees[i] = new Employee();
            employees[i].input();
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Danh sách nhân viên");
            employees[i].display();
        }
    }
}
