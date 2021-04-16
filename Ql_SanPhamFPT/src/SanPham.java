import java.io.Serializable;
import java.util.Scanner;

/**
 * SanPham
 */
public class SanPham implements Serializable{
    private String maSP, tenSP, moTa, hang;
    private DanhMuc danhMuc;
    private long giaNhap, giaBan;
    private int slTon, slBan;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String moTa, String hang, DanhMuc danhMuc, long giaNhap, long giaBan,
            int slTon, int slBan) {
        super();
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.hang = hang;
        this.danhMuc = danhMuc;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.slTon = slTon;
        this.slBan = slBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public int getSlBan() {
        return slBan;
    }

    public void setSlBan(int slBan) {
        this.slBan = slBan;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.print(" Tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.print(" Mô tả: ");
        moTa = sc.nextLine();
        System.out.print(" Hãng: ");
        hang = sc.nextLine();
        danhMuc = inputDanhMuc();
        System.out.print(" Giá nhập: ");
        giaNhap = sc.nextLong();
        System.out.print(" Giá bán: ");
        giaBan = sc.nextLong();
        System.out.println(" Số lượng tồn: ");
        slTon = sc.nextInt();
        System.out.print(" Số lượng bán: ");
        slBan = sc.nextInt();
    }

    public DanhMuc inputDanhMuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Các danh mục: ");
        System.out.print("\n1. Điện thoại");
        System.out.print("\t2. Laptop");
        System.out.print("\t3. Phụ kiện");

        System.out.println("\nChọn danh mục: ");
        int chon = sc.nextInt();
        switch (chon) {
        case 1:
            danhMuc = DanhMuc.DIENTHOAI;
            break;
        case 2:
            danhMuc = DanhMuc.LAPTOP;
            break;
        case 3:
            danhMuc = DanhMuc.PHUKIEN;
            break;
        default:
            break;
        }
        return danhMuc;

    }

    @Override
    public String toString() {
        return "Ma SP: " + maSP + " | Ten: " + tenSP + " | Mo ta: " + moTa + " | Gia nhap: " + giaNhap + " | Gia ban: " + giaBan + " | So luong ton: " + slTon + " | So luong ban: " + slBan + " | Hang: " + hang + " | Danh muc: "
                + danhMuc;    }

    

}
