import java.util.List;
import java.util.Scanner;

public class QlSanPham {
    public static Scanner sc = new Scanner(System.in);
    private List<SanPham> sanPhamList;
    private QLFile fileSanPham;
    private int i;

    public QlSanPham() {
        fileSanPham = new QLFile();
        sanPhamList = fileSanPham.read();
    }

    public void nhapThongTinSanPham() {
        int n;
        try {
            do {
                System.out.println("Nhập số lượng sản phẩm muốn thêm: ");
                n = sc.nextInt();

                if (!(n > 0 && n < 100)) {
                    System.out.println("Số lượng bạn nhập phải nằm trong khoảng(0 ; 100)");
                }

            } while (!(n > 0 && n < 100));

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                SanPham sanPham = new SanPham();
                sanPham.input();
                sanPhamList.add(sanPham);
                fileSanPham.write(sanPhamList);
            }

        } catch (Exception e) {
            System.out.println("Kí tự không hợp lệ!!!");
        }
    }

    public void inDanhSachSanPham() {
        System.out.println("\nDanh sách sản phẩm: ");
        if (!(sanPhamList != null && !sanPhamList.isEmpty())) {
            System.out.println(" Danh sách trống!!!");
        }
        for (SanPham sanPham : sanPhamList) {
            System.out.println(sanPham);
        }
    }

    public void timKiemTheoTen() {
        SanPham sanPham = null;
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = sc.nextLine();

        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getTen().equalsIgnoreCase(name)) {
                sanPham = sanPhamList.get(i);
            }
        }

        if (sanPham != null) {
            System.out.println(sanPham.toString());
        } else {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }

    public void xoa() {
        SanPham sanPham = null;
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        String name = sc.nextLine();

        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getTen().equalsIgnoreCase(name)) {
                sanPham = sanPhamList.get(i);
            }
        }

        if (sanPham != null) {
            sanPhamList.remove(sanPham);
            fileSanPham.write(sanPhamList);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Sản phẩm này không tồn tại!");
        }
    }

    public void suaThongTin() {
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String name = sc.nextLine();

        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getTen().equalsIgnoreCase(name)) {
                sanPham.input();
                fileSanPham.write(sanPhamList);
            }
            System.out.println("Không có sản phẩm này!");
        }
    }

    public void xoaToanBo() {
        int chon;
        System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sản phẩm!(1. Yes OR 2. No)");
        chon = sc.nextInt();
        if (chon == 1) {
            sanPhamList.clear();
            fileSanPham.write(sanPhamList);
            System.out.println("Xóa thành công!");
        }
    }
}
