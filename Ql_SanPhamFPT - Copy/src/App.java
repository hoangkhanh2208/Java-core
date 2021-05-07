import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int chon;
        QLSach qlSach = new QLSach();
        do {
            menu();
            chon = sc.nextInt();
            switch (chon) {
            case 1:
                qlSach.nhapThongTinSanPham();
                break;
            case 2:
                qlSach.inDanhSachSanPham();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
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
        System.out.println("3. In thông tin sản phẩm dựa theo danh mục ");
        System.out.println("4. In thông tin sản phẩm dựa theo hãng ");
        System.out.println("5. In thông tin sản phẩm dựa theo mức giá và danh mục ");
        System.out.println("6. Tìm kiếm sản phẩm theo tên ");
        System.out.println("7. Xóa sản phẩm theo tên ");
        System.out.println("8. Xóa toàn bộ sản phẩm ");
        System.out.println("9. Sửa thông tin sản phẩm");
        System.out.println("0. Thoát ");
        System.out.println("-------------------------------");

        System.out.print("Chọn: ");

    }
}
