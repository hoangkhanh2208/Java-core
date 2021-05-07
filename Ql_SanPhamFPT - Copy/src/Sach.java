import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * SanPham
 */
public class Sach implements Serializable{
    public static Scanner sc = new Scanner(System.in);
    
    private String tenSach;
    private String tenTacGia;
    private String ngonNgu;
    private TheLoai theLoai;
    private String nhaXuatBan;
    private Date ngayPhatHanh;
    private int soLuong;

    public Sach() {
    }

    public Sach(String tenSach, String tenTacGia, String ngonNgu, TheLoai theLoai, String nhaXuatBan, Date ngayPhatHanh,
            int soLuong) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.ngonNgu = ngonNgu;
        this.theLoai = theLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.ngayPhatHanh = ngayPhatHanh;
        this.soLuong = soLuong;
    }

    
    

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    @Override
    public String toString() {
        return "Sach [ngayPhatHanh=" + ngayPhatHanh + ", ngonNgu=" + ngonNgu + ", nhaXuatBan=" + nhaXuatBan
                + ", soLuong=" + soLuong + ", tenSach=" + tenSach + ", tenTacGia=" + tenTacGia + ", theLoai=" + theLoai
                + "]";
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    

}
