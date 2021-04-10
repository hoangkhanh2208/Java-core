package Book;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements IMuon, IKho {
    private int soTrang;
    private String tinhTrang;
    private int soLuongSach;
    private int soLuongMuon;
    
    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int soTrang, String tinhTrang, int soLuongSach, int soLuongMuon) {
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongSach = soLuongSach;
        this.soLuongMuon = soLuongMuon;
    }

    public SachGiaoKhoa(int idSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int soLuongSach, int soLuongMuon) {
        super(idSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.soLuongSach = soLuongSach;
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Số trang: " + soTrang + "\tTình trạng: " + tinhTrang + "\tSố lượng sách: " + soLuongSach + "\tSố lượng mượn: " + soLuongMuon + "\tSố lượng sách tồn kho: " + tonKho());
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        super.input();
        System.out.println("Số trang: ");
        soTrang = Integer.parseInt(sc.nextLine());
        System.out.println("Tình trạng: ");
        tinhTrang = sc.nextLine();
        System.out.println("Số lượng sách: ");
        soLuongSach = sc.nextInt();
        System.out.println("Số lượng mượn: ");
        soLuongMuon = sc.nextInt();
    }
    
    @Override
    public int tonKho() {
        return soLuongSach - soLuongMuon;
    }

    @Override
    public int viTri() {
        return getIdSach();
    }
    
}
