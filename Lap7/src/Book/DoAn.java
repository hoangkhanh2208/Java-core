package Book;

import java.util.Scanner;

public class DoAn extends Sach implements IKho{
    private int soTrang;
    private String tinhTrang;
    private int namBaoVe;

    public DoAn() {
    }

    public DoAn(int soTrang, String tinhTrang, int namBaoVe) {
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }

    public DoAn(int idSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int namBaoVe) {
        super(idSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        super.display();
        System.out.println("Số trang: ");
        soTrang = Integer.parseInt(sc.nextLine());
        System.out.println("Tình trạng: ");
        tinhTrang = sc.nextLine();
        System.out.println("Năm bảo vệ: ");
        namBaoVe = sc.nextInt();
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Số trang: " + soTrang + "\tTình trạng: " + tinhTrang + "\tNăm bảo vệ: " + namBaoVe + "\tVị trí: " + viTri());
    }

    @Override
    public int viTri() {
        return getIdSach();
    }
    
}
