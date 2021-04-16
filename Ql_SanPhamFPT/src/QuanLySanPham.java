import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    public static Scanner sc = new Scanner(System.in);
    private List<SanPham> sanPhamList;
    private FileSanPham fileSanPham;
    private int i;

    public QuanLySanPham() {
        fileSanPham = new FileSanPham();
        sanPhamList = fileSanPham.read();
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

    public void inThongTinTheoDanhMuc() {
        int chon;
        listDanhMuc();
        chon = sc.nextInt();
        int size = sanPhamList.size();
        switch (chon) {
            case 1:
                for (SanPham sanPham : sanPhamList) {
                    if (sanPham.getDanhMuc() == DanhMuc.DIENTHOAI) {
                        System.out.println(sanPham.toString());
                    }
                }
                break;
            case 2:
                for (SanPham sanPham : sanPhamList) {
                    if (sanPham.getDanhMuc() == DanhMuc.LAPTOP) {
                        System.out.println(sanPham.toString());
                    }
                }
                break;
            case 3:
                for (SanPham sanPham : sanPhamList) {
                    if (sanPham.getDanhMuc() == DanhMuc.PHUKIEN){
                        System.out.println(sanPham.toString());
                    }
                }
                break;

            default:
                break;
        }

    }
    
    public void inThongTinTheoHang() {
        String hang;
        System.out.println("Nhập tên hãng muốn tìm: ");
        hang = sc.nextLine();

        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getHang().equalsIgnoreCase(hang)) {
                System.out.println(sanPham.toString());
            }
        }

    }

    public void inThongTinTheoGiaVaDanhMuc() {
        int chon, gia;
        int count = 0;
        listDanhMuc();
        chon = sc.nextInt();
        listMucGia();
        gia = sc.nextInt();
        int size = sanPhamList.size();
        switch (gia) {
        case 1:
            for (SanPham sanPham : sanPhamList) {
                if (sanPham.getGiaBan() < 2000000 && (sanPham.getDanhMuc() == danhMuc(chon))) {
                    System.out.println(sanPham.toString());
                    count++;
                }
            }
            
            if (count == 0) {
                System.out.println("\nKhông có sản phẩm trong tầm giá này!");
            }
            break;
        case 2:
            for (SanPham sanPham : sanPhamList) {
                if ((sanPham.getGiaBan() > 2000000 && sanPham.getGiaBan() < 4000000)
                        && (sanPham.getDanhMuc() == danhMuc(chon))) {
                    System.out.println(sanPham.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("\nKhông có sản phẩm trong tầm giá này!");
            }
            break;
        case 3:
            for (SanPham sanPham : sanPhamList) {
                if ((sanPham.getGiaBan() > 4000000 && sanPham.getGiaBan() < 7000000)
                        && (sanPham.getDanhMuc() == danhMuc(chon))) {
                    System.out.println(sanPham.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("\nKhông có sản phẩm trong tầm giá này!");
            }
            break;
        case 4:
            for (SanPham sanPham : sanPhamList) {
                if ((sanPham.getGiaBan() > 7000000 && sanPham.getGiaBan() < 13000000)
                        && (sanPham.getDanhMuc() == danhMuc(chon))) {
                    System.out.println(sanPham.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("\nKhông có sản phẩm trong tầm giá này!");
            }
            break;
        case 5:
            for (SanPham sanPham : sanPhamList) {
                if ((sanPham.getGiaBan() > 13000000) && (sanPham.getDanhMuc() == danhMuc(chon))) {
                    System.out.println(sanPham.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("\nKhông có sản phẩm trong tầm giá này!");
            }
            break;            

        default:
            break;
        }
    }
    
    public DanhMuc danhMuc(int chon) {
        
        switch (chon) {
            case 1:
                return DanhMuc.DIENTHOAI;
            case 2:
                return DanhMuc.LAPTOP;          
            case 3:
                return DanhMuc.PHUKIEN;
            
            default:
                break;
        }
        return null;
        
    }

    public void timKiemTheoTen() {
        SanPham sanPham = null;
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = sc.nextLine();

        for (int i = 0; i < sanPhamList.size(); i++) {
            if (sanPhamList.get(i).getTenSP().equalsIgnoreCase(name)) {
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
            if (sanPhamList.get(i).getTenSP().equalsIgnoreCase(name)) {
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

    public void xoaToanBo() {
        int chon;
        System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sản phẩm!(1. Yes OR 2. No)");
        chon = sc.nextInt();
        if (chon == 1) {
            sanPhamList.removeAll(sanPhamList);
            fileSanPham.write(sanPhamList);
            System.out.println("Xóa thành công!");
        }
    }

    void listDanhMuc() {
        System.out.println("Chọn danh mục muốn hiển thị: ");
        System.out.print("\n1. Danh mục điện thoại");
        System.out.print("\t2. Danh mục laptop");
        System.out.print("\t3. Danh mục phụ kiện");
        System.out.print("\nChọn: ");
    }

    void listMucGia() {
        System.out.println("\nChọn tầm giá: ");
        System.out.println("1. Dưới 2 triệu");
        System.out.println("2. Từ 2 đến 4 triệu");
        System.out.println("3. Từ 4 đến 7 triệu");
        System.out.println("4. Từ 7 đến 13 triệu");
        System.out.println("5. Trên 13 triệu. ");
        System.out.print("Chọn: ");
    }
}