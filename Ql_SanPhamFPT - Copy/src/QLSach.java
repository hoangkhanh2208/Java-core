import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QLSach {
    public static Scanner sc = new Scanner(System.in);
    private List<Sach> listSach;
    private QLFileSach fileSach;
    private Sach sach;
    private int i;

    public QLSach() {
        fileSach = new QLFileSach();
        listSach = fileSach.read();
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
                System.out.println("Tên sách: ");
                String tenSach = sc.nextLine();
                System.out.println("Tên tác giả: ");
                String tenTacGia = sc.nextLine();
                System.out.println("Ngôn ngữ: ");
                String ngonNgu = sc.nextLine();
                TheLoai theLoai = inputTheLoai(sach.s);
                System.out.println("Nhà xuất bản: ");
                String nhaXuatBan = sc.nextLine();
                System.out.println("Ngày phát hành: ");
                Date ngayPhatHanh = inputNgayPhatHanh(ngayPhatHanh);
                System.out.println("Số lượng sách: ");
                int soLuong = sc.nextInt();
                
                Sach sach = new Sach(tenSach, tenTacGia, ngonNgu, theLoai, nhaXuatBan, ngayPhatHanh, soLuong);
                listSach.add(sach);
                fileSach.write(listSach);
            }

        } catch (Exception e) {
            System.out.println("Kí tự không hợp lệ!!!");
        }
    }

    public void inDanhSachSanPham() {
        System.out.println("\nDanh sách sản phẩm: ");
        if (!(listSach != null && !listSach.isEmpty())) {
            System.out.println(" Danh sách trống!!!");
        }
        for (Sach sanPham : listSach) {
            System.out.println(sanPham);
        }
    }

    private Date inputNgayPhatHanh(Date ngayPhatHanh) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String strPhatHanh = sc.nextLine();
        if (strPhatHanh.equals("")) {
            return null;
        } else {
            try {
                ngayPhatHanh = format.parse(strPhatHanh);
            } catch (ParseException e) {
                e.fillInStackTrace();
            }
            return ngayPhatHanh;
        }

    }

    private TheLoai inputTheLoai() {
        menuTheLoai();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                theLoai = TheLoai.CHINH_TRI_PHAP_LUAT;
                break;
            case 2:
                theLoai = TheLoai.VAN_HOC_NGHE_THUAT;
                break;
            case 3:
                theLoai = TheLoai.KHOA_HOC_CONG_NGHE;
                break;
            case 4:
                theLoai = TheLoai.TRUYEN;
                break;
            case 5:
                theLoai = TheLoai.TAM_LY;
                break;

            default:

                break;
        }
        return theLoai;

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

//     public void inThongTinTheoDanhMuc() {
//         int chon;
//         listDanhMuc();
//         chon = sc.nextInt();
//         int size = sanPhamList.size();
//         switch (chon) {
//             case 1:
//                 for (Sach sanPham : sanPhamList) {
//                     if (sanPham.getDanhMuc() == TheLoai.DIENTHOAI) {
//                         System.out.println(sanPham.toString());
//                     }
//                 }
//                 break;
//             case 2:
//                 for (Sach sanPham : sanPhamList) {
//                     if (sanPham.getDanhMuc() == TheLoai.LAPTOP) {
//                         System.out.println(sanPham.toString());
//                     }
//                 }
//                 break;
//             case 3:
//                 for (Sach sanPham : sanPhamList) {
//                     if (sanPham.getDanhMuc() == TheLoai.PHUKIEN){
//                         System.out.println(sanPham.toString());
//                     }
//                 }
//                 break;

//             default:
//                 break;
//         }

//     }
    
//     public void inThongTinTheoHang() {
//         String hang;
//         System.out.println("Nhập tên hãng muốn tìm: ");
//         hang = sc.nextLine();

//         for (Sach sanPham : sanPhamList) {
//             if (sanPham.getHang().equalsIgnoreCase(hang)) {
//                 System.out.println(sanPham.toString());
//             }
//         }

//     }

//     public void inThongTinTheoGiaVaDanhMuc() {
//         int chon, gia;
//         int count = 0;
//         listDanhMuc();
//         chon = sc.nextInt();
//         listMucGia();
//         gia = sc.nextInt();
//         int size = sanPhamList.size();
//         switch (gia) {
//         case 1:
//             for (Sach sanPham : sanPhamList) {
//                 if (sanPham.getGiaBan() < 2000000 && (sanPham.getDanhMuc() == danhMuc(chon))) {
//                     System.out.println(sanPham.toString());
//                     count++;
//                 }
//             }
            
//             if (count == 0) {
//                 System.out.println("\nKhông có sản phẩm trong tầm giá này!");
//             }
//             break;
//         case 2:
//             for (Sach sanPham : sanPhamList) {
//                 if ((sanPham.getGiaBan() > 2000000 && sanPham.getGiaBan() < 4000000)
//                         && (sanPham.getDanhMuc() == danhMuc(chon))) {
//                     System.out.println(sanPham.toString());
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("\nKhông có sản phẩm trong tầm giá này!");
//             }
//             break;
//         case 3:
//             for (Sach sanPham : sanPhamList) {
//                 if ((sanPham.getGiaBan() > 4000000 && sanPham.getGiaBan() < 7000000)
//                         && (sanPham.getDanhMuc() == danhMuc(chon))) {
//                     System.out.println(sanPham.toString());
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("\nKhông có sản phẩm trong tầm giá này!");
//             }
//             break;
//         case 4:
//             for (Sach sanPham : sanPhamList) {
//                 if ((sanPham.getGiaBan() > 7000000 && sanPham.getGiaBan() < 13000000)
//                         && (sanPham.getDanhMuc() == danhMuc(chon))) {
//                     System.out.println(sanPham.toString());
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("\nKhông có sản phẩm trong tầm giá này!");
//             }
//             break;
//         case 5:
//             for (Sach sanPham : sanPhamList) {
//                 if ((sanPham.getGiaBan() > 13000000) && (sanPham.getDanhMuc() == danhMuc(chon))) {
//                     System.out.println(sanPham.toString());
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("\nKhông có sản phẩm trong tầm giá này!");
//             }
//             break;            

//         default:
//             break;
//         }
//     }
    
//     public TheLoai danhMuc(int chon) {
        
//         switch (chon) {
//             case 1:
//                 return TheLoai.DIENTHOAI;
//             case 2:
//                 return TheLoai.LAPTOP;          
//             case 3:
//                 return TheLoai.PHUKIEN;
            
//             default:
//                 break;
//         }
//         return null;
        
//     }

//     public void timKiemTheoTen() {
//         Sach sanPham = null;
//         System.out.println("Nhập tên sản phẩm muốn tìm: ");
//         String name = sc.nextLine();

//         for (int i = 0; i < sanPhamList.size(); i++) {
//             if (sanPhamList.get(i).getTenSP().equalsIgnoreCase(name)) {
//                 sanPham = sanPhamList.get(i);
//             }
//         }

//         if (sanPham != null) {
//             System.out.println(sanPham.toString());
//         } else {
//             System.out.println("Không tìm thấy sản phẩm này!");
//         }
//     }
    
//     public void xoa() {
//         Sach sanPham = null;
//         System.out.println("Nhập tên sản phẩm muốn xóa: ");
//         String name = sc.nextLine();

//         for (int i = 0; i < sanPhamList.size(); i++) {
//             if (sanPhamList.get(i).getTenSP().equalsIgnoreCase(name)) {
//                 sanPham = sanPhamList.get(i);
//             }
//         }

//         if (sanPham != null) {
//             sanPhamList.remove(sanPham);
//             fileSanPham.write(sanPhamList);
//             System.out.println("Xóa thành công!");
//         } else {
//             System.out.println("Sản phẩm này không tồn tại!");
//         }
//     }

//     public void xoaToanBo() {
//         int chon;
//         System.out.println("Bạn có chắc chắn muốn xóa toàn bộ sản phẩm!(1. Yes OR 2. No)");
//         chon = sc.nextInt();
//         if (chon == 1) {
//             sanPhamList.clear();
//             fileSanPham.write(sanPhamList);
//             System.out.println("Xóa thành công!");
//         }
//     }

//     public void suaThongTin() {
//         System.out.println("Nhập tên sản phẩm muốn sửa: ");
//         String name = sc.nextLine();

//         for (Sach sanPham : sanPhamList) {
//             if (sanPham.getTenSP().equalsIgnoreCase(name)) {
//                 sanPham.input();
//                 fileSanPham.write(sanPhamList);
//             }
//             System.out.println("Không có sản phẩm này!");
//         }
//     }

//     void listDanhMuc() {
//         System.out.println("Chọn danh mục muốn hiển thị: ");
//         System.out.print("\n1. Danh mục điện thoại");
//         System.out.print("\t2. Danh mục laptop");
//         System.out.print("\t3. Danh mục phụ kiện");
//         System.out.print("\nChọn: ");
//     }

//     void listMucGia() {
//         System.out.println("\nChọn tầm giá: ");
//         System.out.println("1. Dưới 2 triệu");
//         System.out.println("2. Từ 2 đến 4 triệu");
//         System.out.println("3. Từ 4 đến 7 triệu");
//         System.out.println("4. Từ 7 đến 13 triệu");
//         System.out.println("5. Trên 13 triệu. ");
//         System.out.print("Chọn: ");
//     }
}