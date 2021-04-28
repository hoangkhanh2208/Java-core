import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String choose = null;
        boolean exit = false;
        System.out.println("PHẦN MỀM QUẢN LÝ THƯ VIỆN");
        Sach sach = new Sach();
        QLSach qlSach = new QLSach();
        showMenu();
        while (true) {
            choose = sc.nextLine();
            switch (choose) {
            case "1":
                qlSach.themSach();
                break;
            case "2":
                
                // System.out.print("\tTên sách");
                // System.out.print("\tTác giả");
                // System.out.print("\tNgôn ngữ");
                // System.out.print("\tThể loại");
                // System.out.print("\tNhà xuất bản");
                // System.out.print("\tNgày phát hành");
                // System.out.print("\tSố lượng");
                // System.out.println();
                qlSach.inThongTinSach();
                break;
            case "3":

                break;
            case "4":

                break;
            case "0":
                exit = true;
                break;

            default:
                System.out.println("Không hợp lệ! Chọn lại:");
                break;
            }
            
            if (exit) {
                break;
            }
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sinh viên mượn sách.");
        System.out.println("2. Thêm sách");
        System.out.println("3. Hiển thị sinh viên");
        System.out.println("4. Hiển thị sách");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }
}
