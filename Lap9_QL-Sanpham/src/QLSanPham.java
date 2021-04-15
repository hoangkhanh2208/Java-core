
import java.util.List;
import java.util.Scanner;


public class QLSanPham {
    public static Scanner sc = new Scanner(System.in);
    private List<SanPham> sanPhamList;
    private SanPhamFile sanPhamFile;

    public QLSanPham() {
        sanPhamFile = new SanPhamFile();
        sanPhamList = sanPhamFile.read();
    }

    public void nhapThongTinSanPham() {
        int n;
        try {
            do {
                System.out.println("Nhập số lượng sản phẩm muốn thêm: ");
                n = sc.nextInt();

            } while (!(n > 0 || n < 100));

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                SanPham sanPham = new SanPham();
                sanPham.input();
                sanPhamList.add(sanPham);
                sanPhamFile.write(sanPhamList);
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

    public void suaThongTin() {
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String name = sc.nextLine();

        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getName().equalsIgnoreCase(name)) {
                sanPham.input();
                sanPhamFile.write(sanPhamList);
            }
            System.out.println("Không có sản phẩm này!");
        }
    }

    public void xoa() {
        SanPham sanPham = null;
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        String name = sc.nextLine();

        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getName().equalsIgnoreCase(name)) {
                sanPham = sanPhamList.get(i);
            }
        }
        
        if (sanPham != null) {
            sanPhamList.remove(sanPham);
            sanPhamFile.write(sanPhamList);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Sản phẩm này không tồn tại!");
        }
    }

    public void timKiem() {
        SanPham sanPham = null;
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = sc.nextLine();
        
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getName().equalsIgnoreCase(name)) {
                sanPham = sanPhamList.get(i);
            }
        }

        if (sanPham != null) {
            System.out.println(sanPham.toString());
        } else {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }

    public void timHangTonKho() {
        final int INVENTORY_MIN = 5;
        int count = 0;
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getSoLuongTon() < INVENTORY_MIN) {
                System.out.println(sanPhamList.get(i).toString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("Không có hàng tồn kho nhỏ hơn 5");
        }
    }


}
