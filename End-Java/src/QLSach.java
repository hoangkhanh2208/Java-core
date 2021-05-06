import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSach {
    public static Scanner sc = new Scanner(System.in);

    private List<Sach> dsSach;
    private SachFile fileSach;

    public QLSach() {
        fileSach = new SachFile();
        dsSach = fileSach.read();
    }

    public void themSach() {
        int n;
        try {
            do {
                System.out.println("Nhập số lượng sách muốn thêm: ");
                n = Integer.parseInt(sc.nextLine());

            } while (!(n > 0 || n < 100));

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
                Sach sach = new Sach();
                sach.input();
                dsSach.add(sach);
                fileSach.write(dsSach);
            }

        } catch (Exception e) {
            System.out.println("Kí tự không hợp lệ!!!");
        }
    }

    public void inThongTinSach() {
        System.out.println("\nDanh sách các sách có trong thư viện: ");
        if (dsSach != null && dsSach.isEmpty()) {
            System.out.println(" Thư viện trống!!!");
        }
        dsSach.forEach(element -> System.out.println(element));
    }

    public void inThongTinTheoTheLoai() {
        int chon;
        menuTheLoai();
        chon = sc.nextInt();
        int size = dsSach.size();
        switch (chon) {
            case 1:
                kiemTraTheLoai(TheLoai.CHINH_TRI_PHAP_LUAT);
                break;
            case 2:
                kiemTraTheLoai(TheLoai.VAN_HOC_NGHE_THUAT);
                break;
            case 3:
                kiemTraTheLoai(TheLoai.KHOA_HOC_CONG_NGHE);
                break;
            case 4:
                kiemTraTheLoai(TheLoai.TRUYEN);
                break;
            case 5:
                kiemTraTheLoai(TheLoai.TAM_LY);
                break;
            default:
                System.out.println("Không có lựa chọn này!");
                break;
        }

    }

    private void kiemTraTheLoai(TheLoai theLoai) {
        for (Sach sach : dsSach) {
            if (sach.getTheLoai() == theLoai) {
                System.out.println(sach.toString());
            }
        }
    }
    
    public void timKiemTheoTen() {
        Sach sach = null;
        System.out.println("Tìm kiếm theo: ");
        System.out.println("  1. Tên sách");
        System.out.println("  2. Tên tác giả");
        System.out.print("Chọn: ");
        int n = Integer.parseInt(sc.nextLine());
        String name;
        if (n == 1) {
            System.out.println("Nhập tên sách muốn tìm: ");
            name = sc.nextLine();
            for (int i = 0; i < dsSach.size(); i++) {
                if (dsSach.get(i).getTenSach().equalsIgnoreCase(name)) {
                    sach = dsSach.get(i);
                }
            }
        } 
        if (n == 2) {
            System.out.println("Nhập tên tác giả muốn tìm: ");
            name = sc.nextLine();
            for (int i = 0; i < dsSach.size(); i++) {
                if (dsSach.get(i).getTenTacGia().equalsIgnoreCase(name)) {
                    sach = dsSach.get(i);
                }
            }
        }

        if (sach != null) {
            System.out.println(sach.toString());
        } else {
            System.out.println("Không tìm thấy sách này!");
        }
    }

    public void xoa() {
        Sach sach = null;
        int chon;
        System.out.println("Nhập tên sách muốn xóa: ");
        String name = sc.nextLine();

        for (int i = 0; i < dsSach.size(); i++) {
            if (dsSach.get(i).getTenSach().equalsIgnoreCase(name)) {
                sach = dsSach.get(i);
            }
        }

        if (sach != null) {
            System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sách!(1. Yes OR 2. No)");
            chon = Integer.parseInt(sc.nextLine());
            if (chon == 1) {
                dsSach.remove(sach);
                fileSach.write(dsSach);
                System.out.println("Xóa thành công!");
            }
        } else {
            System.out.println("Sách này không tồn tại!");
        }
    }

    // public void xoaToanBo() {
    //     int chon;
    //     System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sách!(1. Yes OR 2. No)");
    //     chon = sc.nextInt();
    //     if (chon == 1) {
    //         dsSach.clear();
    //         fileSach.write(dsSach);
    //         System.out.println("Xóa thành công!");
    //     }
    // }

    public void suaThongTin() {
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String name = sc.nextLine();
        boolean b = true;

        for (Sach sach : dsSach) {
            if (sach.getTenSach().equalsIgnoreCase(name)) {
                sach.input();
                fileSach.write(dsSach);
                b = false;
            }
        }
        if (b) {
            System.out.println("Không có sản phẩm này!");
        }
    }

    public void sachBanChay() {
        System.out.println("\nSách bán chạy: ");
        for (int i = 0; i < dsSach.size(); i++) {
            if (dsSach.get(i).getSoLuongBan() > 50) {
                System.out.println(dsSach.get(i).toString());
            }
        }
    }

    public void sachSapHet() {
        System.out.println("\nSách sắp hết cần nhập thêm: ");
        for (int i = 0; i < dsSach.size(); i++) {
            if (dsSach.get(i).getSoLuongTon() < 10) {
                System.out.println(dsSach.get(i).toString());
            }
        }
    }

    private void menuTheLoai() {
        System.out.println("Thể loại: ");
        System.out.print("\n1. Chính trị - pháp luật");
        System.out.print("\t2. Văn học - nghệ thuật");
        System.out.print("\t3. Khoa học công nghệ");
        System.out.print("\t4. Truyện");
        System.out.print("\t5. Tâm lý");

        System.out.println("\nChọn thể loại sách: ");
    }

}
