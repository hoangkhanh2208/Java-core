import java.io.Serializable;
import java.util.Scanner;

public class SanPham implements Serializable{
    private int ma;
    private String ten;
    private String mota;
    private int giaNhap;
    private int giaBan;
    private int soLuongBan;
    private int soLuongTon;
    
    public SanPham() {
    }

    public SanPham(int ma, String ten, String mota, int giaNhap, int giaBan, int soLuongBan, int soLuongTon) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Mã sản phẩm: ");
        ma = Integer.parseInt(sc.nextLine());
        System.out.print(" Tên sản phẩm: ");
        ten = sc.nextLine();
        System.out.print(" Mô tả: ");
        mota = sc.nextLine();
        System.out.print(" Giá nhập: ");
        giaNhap = sc.nextInt();
        System.out.print(" Giá bán: ");
        giaBan = sc.nextInt();
        System.out.println(" Số lượng bán: ");
        soLuongBan = sc.nextInt();
        System.out.print(" Số lượng tồn: ");
        soLuongTon = sc.nextInt();
    }


    @Override
    public String toString() {
        return "Id: " + ma + "\tTên: " + ten + "\tMô tả: " + mota + "\tGiá nhập: " + giaNhap + "\tGiá bán: " + giaBan
                + "\tSố lượng bán: " + soLuongBan + "\tSố lượng tồn: " + soLuongTon;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    
}
