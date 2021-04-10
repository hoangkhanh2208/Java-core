package Book;

import java.util.Scanner;

public class TaiLieuDienTu extends Sach implements IDownLoad{
    private int dungLuong;
    private int luotTai;
    private int giaThanh;

    public TaiLieuDienTu() {
    }

    public TaiLieuDienTu(int dungLuong, int luotTai, int giaThanh) {
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }

    public TaiLieuDienTu(int idSach, String tenSach, String nhaXuatBan, int namXuatBan, int dungLuong, int luotTai,
            int giaThanh) {
        super(idSach, tenSach, nhaXuatBan, namXuatBan);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {      
        super.display();
        System.out.println("Dung lượng sách: ");
        dungLuong = sc.nextInt();
        System.out.println("Lượt tải: ");
        luotTai = sc.nextInt();
        System.out.println("Giá thành: ");
        giaThanh = sc.nextInt();
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Dung lượng sách: " + dungLuong + "\tLượt tải: " + "\tGiá thành: " + giaThanh + "\tTổng tiền: " + tongTien());
    }

    @Override
    public int tongTien() {       
        return luotTai * giaThanh;
    }
}
