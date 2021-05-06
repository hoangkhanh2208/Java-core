import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String choose = null;
        boolean exit = false;
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
                    qlSach.inThongTinSach();
                    break;
                case "3":
                    qlSach.inThongTinTheoTheLoai();
                    break;
                case "4":
                    qlSach.timKiemTheoTen();
                    break;
                case "5":
                    qlSach.suaThongTin();
                    break;
                case "6":
                    qlSach.xoa();
                    break;
                case "7":
                    qlSach.sachBanChay();
                    break;
                case "8":
                    qlSach.sachSapHet();
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
        System.out.println("1. Thêm sách");
        System.out.println("2. Hiển thị sách có trong thư viện ");
        System.out.println("3. Hiển thị sách theo thể loại ");
        System.out.println("4. Tìm kiếm ");
        System.out.println("5. Sửa thông tin sách");
        System.out.println("6. Xóa sách theo tên");
        System.out.println("7. Sách bán chạy");
        System.out.println("8. Sách sắp hết");

        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }
}
