import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choose;
        String st;
        Team team = new Team();
        System.out.println("Danh sách cầu thủ: ");
        team.getGetAllPlayer();

        do {
            lineUp();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
            case 1:
                team.buildTeam(4, 4, 2);
                break;
            case 2:
                team.buildTeam(3, 5, 2);
                break;
            case 3:
                team.buildTeam(4, 3, 3);
                break;
            case 4:
                System.out.println("Bạn chọn chức năng thoát! Tạm biệt!");
                System.exit(0);
                break;
            default:
                System.out.println("Chưa có đội hình này.");
                break;
            }
        } while (choose != 4);
        
    }
    
    static void lineUp() {
        System.out.println("\n\nDanh sách sơ đồ chiến thuật: ");
        System.out.println("  1. Đội hình 4-4-2: 4 hậu vệ - 4 trung vệ - 2 tiền đạo");
        System.out.println("  2. Đội hình 3-5-2: 3 hậu vệ - 5 trung vệ - 2 tiền đạo");
        System.out.println("  3. Đội hình 4-3-3: 4 hậu vệ - 3 trung vệ - 3 tiền đạo");
        System.out.println("  4. Thoát");
        System.out.println("  Choose: ");
    }
}
