import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class SanPham {
    private int id;
    private String ten;
    private String moTa;
    private float giaNhap;
    private float giaBan;
    private java.util.Date hsd;

    public SanPham() {
    }
    
    public SanPham(int id, String ten, String moTa, float giaNhap, float giaBan, Date hsd) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.hsd = hsd;
    }

    public void input() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Tên: ");
        ten = sc.nextLine();
        System.out.println("Mô tả: ");
        moTa = sc.nextLine();
        System.out.println("Hạn sử dụng(dd/MM/yyyy): ");
        String HSDString = sc.nextLine();

        if (HSDString.equals("")) {
            hsd = null;
        } else {
            try {
                hsd = format.parse(HSDString);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Giá nhập: ");
        giaNhap = sc.nextFloat();
        System.out.println("Giá bán: ");
        giaBan = sc.nextFloat();
    
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return "SanPham [giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hsd=" + format.format(hsd) + ", id=" + id + ", moTa=" + moTa
                + ", ten=" + ten + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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

    public Date getHsd() {
        return (Date) hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    
}
