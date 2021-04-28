import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int chon;
        QlSanPham quanLySanPham = new QlSanPham();
        do {
            menu();
            chon = sc.nextInt();
            switch (chon) {
            case 1:
                quanLySanPham.nhapThongTinSanPham();
                break;
            case 2:
                quanLySanPham.inDanhSachSanPham();
                break;
            case 3:
                quanLySanPham.timKiemTheoTen();
                break;
            case 4:
                quanLySanPham.xoa();
                break;
            case 5:
                quanLySanPham.xoaToanBo();
                break;
            case 6:
                quanLySanPham.suaThongTin();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                break;
            }
        } while (true);

    }

    static void menu(){
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("1. Thêm sản phẩm ");
        System.out.println("2. In thông tin toàn bộ sản phẩm trong File ");
        System.out.println("3. Tìm kiếm sản phẩm theo tên ");
        System.out.println("4. Xóa sản phẩm theo tên ");
        System.out.println("5. Xóa toàn bộ sản phẩm ");
        System.out.println("6. Sửa thông tin sản phẩm");
        System.out.println("0. Thoát ");
        System.out.println("-------------------------------");

        System.out.print("Chọn: ");

    }
}

