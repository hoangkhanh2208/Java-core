import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        QLSanPham qlSanPham = new QLSanPham();

        int choose;
        do {
            Menu();
            choose = Integer.parseInt(sc.nextLine());
 
            switch (choose) {
                case 1:
                    qlSanPham.nhapThongTinSanPham();
                    break;

                case 2:
                   qlSanPham.inDanhSachSanPham();
                    break;

                case 3:
                   qlSanPham.suaThongTin();
                    break;

                case 4:
                    qlSanPham.timHangTonKho();
                    break;

                case 5:
                   qlSanPham.xoa();
                    break;

                case 6:
                   qlSanPham.timKiem();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhap choose sai!!!");
                    break;
            }

        } while (choose != 0);
    }

    static void Menu() {
        System.out.println();
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sản phẩm và lưu vào file ");
        System.out.println("2. Hiển thị danh sách sản phẩm ");
        System.out.println("3. Sửa thông tin sản phẩm ");
        System.out.println("4. Hàng tồn kho < 5 ");
        System.out.println("5. Xóa sản phẩm ");
        System.out.println("6. Tìm kiếm sản phẩm ");
        System.out.println("0. Thoát");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }

}
