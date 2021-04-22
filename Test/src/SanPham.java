import java.util.Scanner;

public class SanPham {
    private String name;
    private DanhMuc danhMuc;
    public SanPham() {
    }

    public SanPham(String name, DanhMuc danhMuc) {
        this.name = name;
        this.danhMuc = danhMuc;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên: ");
        name = sc.nextLine();
        System.out.println("Danh Muc: ");
        danhMuc = inputDanhMuc();
    }
    
    public DanhMuc inputDanhMuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
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
        return "SanPham [danhMuc=" + danhMuc + ", name=" + name + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public DanhMuc getDanhMuc() {
        return danhMuc;
    }
    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
    
}
