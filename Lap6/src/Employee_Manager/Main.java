package Employee_Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // EmployeeParttime [] employee1 = new EmployeeParttime [n];

        // EmployeeFulltime [] employee2 = new EmployeeFulltime [n];

        Employee[] employee1 = new Employee[50];

        int a;

        System.out.println("Chọn loại nhân viên cần thêm (1. Part Time || 2. Full Time): ");
        a = sc.nextInt();
        switch (a) {
        case 1:
            System.out.println("Nhập số nhân viên Part Time cần thêm: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                employee1[i] = new EmployeeParttime();
                employee1[i].input();
            }
            for (int i = 0; i < n; i++) {
                employee1[i].display();
            }
            break;
        case 2:
            System.out.println("Nhập số nhân viên FullTime cần thêm: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                employee1[i] = new EmployeeFulltime();
                employee1[i].input();
            }
            for (int i = 0; i < n; i++) {
                employee1[i].display();
                ;
            }
            break;
        default:
            break;
        }

    }
}
