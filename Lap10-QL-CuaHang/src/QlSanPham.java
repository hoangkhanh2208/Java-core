import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QlSanPham {
    public static Scanner sc = new Scanner(System.in);
    List<SanPham> sanPhamList = new ArrayList<>();

    public void nhapThongTin() {
        System.out.println("Số sản phẩm muốn thêm: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SanPham sanPham = new SanPham();
            sanPham.input();
            sanPhamList.add(sanPham);
        }
    }

    public List<SanPham> danhSachSamPham() {
        for (SanPham sanPham : sanPhamList) {
            
        }
        return sanPhamList;       
    }
}
