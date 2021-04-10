package Book;

import java.util.Scanner;

public class Sach {
    private int idSach;
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;

    public Sach() {
    }
    
    public Sach(int idSach, String tenSach, String nhaXuatBan, int namXuatBan) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Mã sách: ");
        idSach = Integer.parseInt(sc.nextLine());
        System.out.println("Tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Nhà xuất bản: ");
        nhaXuatBan = sc.nextLine();
        System.out.println("Năm xuất bản: ");
        namXuatBan = sc.nextInt();
    }
    
    public void display() {
        System.out.println("Mã sách: " + idSach + "\tTên sách: " + tenSach + "\tNhà xuất bản: " + nhaXuatBan
                + "\tNăm xuất bản: " + namXuatBan);
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    
    
}
