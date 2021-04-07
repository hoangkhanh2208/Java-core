package Employee;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choose, option, n;
        Employee [] programmers = new Programmer[10];
        Employee [] testers = new Tester[10]; 
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
            case 1:
                System.out.print("Chọn loại nhân viên(1. Lập trình viên, 2. Kiểm thử viên): ");
                option = sc.nextInt();
                switch (option) {
                case 1:

                    System.out.println("Số lập trinh viên muốn thêm: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("NV thứ " + (i + 1) + ": ");
                        programmers[i] = new Programmer();
                        programmers[i].input();
                    }
                    break;

                case 2:
                    System.out.println("Số tester muốn thêm: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("NV thứ " + (i + 1) + ":");
                        testers[i] = new Tester();
                        testers[i].input();
                    }
                    break;
                default:
                    break;
                }
                break;
            case 2:
                System.out.print("Chọn danh sách nhân viên muốn hiển thị(1. Lập trình viên, 2. Kiểm thử viên): ");
                option = sc.nextInt();
                switch (option) {
                case 1:
                    for (int i = 0; i < programmers.length; i++) {
                        if (programmers[i] == null) {
                            System.out.println("Danh sách này trống!");
                            break;
                        }
                        System.out.println("Danh sách lập trình viên: ");
                        System.out.print("NV thứ " + (i + 1) + ": ");
                        programmers[i].display();
                    }

                    break;

                case 2:
                    
                    for (int i = 0; i < testers.length; i++) {
                        if (testers[i] == null) {
                            System.out.println("Danh sách này trống!");
                            break;
                        }
                        System.out.println("Danh sách nhân viên tester: ");
                        System.out.print("NV thứ " + (i + 1) + ": ");
                        testers[i].display();
                    }
                    break;

                case 3:

                default:
                    System.out.println("Không có lựa chọn này. Mời bạn chọn lại");
                    break;
                }
                break;

            case 3:

                break;
            default:
                System.out.println("Lựa chọn của bạn không có");
                break;
            }
        } while (choose != 3);

    }

    static void menu() {
        System.out.println("1. Nhập thông tin cho nhân viên");
        System.out.println("2. Hiển thị thông tin nhân viên");
        System.out.println("3. Thoát");
        System.out.print("Chọn: ");
    }
}
