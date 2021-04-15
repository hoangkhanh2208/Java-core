import java.io.Serializable;
import java.util.Scanner;

public class SanPham implements Serializable{
    private int ma;
    private String name;
    private float giaNhap;
    private float giaBan;
    private String moTa;
    private int soLuongBan;
    private int soLuongTon;

    public SanPham(){}
    
    public SanPham(int ma, String name, float giaNhap, float giaBan, String moTa, int soLuongBan, int soLuongTon) {
        super();
        this.ma = ma;
        this.name = name;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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

    public float loiNhuan() {
        return (this.giaBan - this.giaNhap) * soLuongBan;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm: ");
        ma = Integer.parseInt(sc.nextLine());
        System.out.println("Tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("Mô tả sản phẩm: ");
        moTa = sc.nextLine();
        System.out.println("Giá nhập: ");
        giaNhap = sc.nextFloat();
        System.out.println("Giá bán: ");
        giaBan = sc.nextFloat();
        System.out.println("Số lượng đã bán: ");
        soLuongBan = sc.nextInt();
        System.out.println("Số lượng tồn kho: ");
        soLuongTon = sc.nextInt();
    }

    @Override
    public String toString() {
        return "  Mã: " + ma + "\tTên: " + name + "\tMô tả: " + moTa + "\tGiá nhập: " + giaNhap + "\tGiá bán: " + giaBan
                + "\tSố lượng đã bán: " + soLuongBan + "\tSố lượng tồn kho: " + soLuongTon + "\tLợi nhuận: "
                + loiNhuan();
    }
    
}