import java.util.Date;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sach implements Serializable {
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

    public void input() {
        System.out.println("Tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Tên tác giả: ");
        tenTacGia = sc.nextLine();
        System.out.println("Ngôn ngữ: ");
        ngonNgu = sc.nextLine();
        theLoai = inputTheLoai();
        System.out.println("Nhà xuất bản: ");
        nhaXuatBan = sc.nextLine();
        System.out.println("Ngày phát hành: ");
        ngayPhatHanh = inputNgayPhatHanh();
        System.out.println("Số lượng sách: ");
        soLuong = sc.nextInt();
    }

    private TheLoai inputTheLoai() {
        menuTheLoai();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
        case 1:
            theLoai = TheLoai.CHINH_TRI_PHAP_LUAT;
            break;
        case 2:
            theLoai = TheLoai.VAN_HOC_NGHE_THUAT;
            break;
        case 3:
            theLoai = TheLoai.KHOA_HOC_CONG_NGHE;
            break;
        case 4:
            theLoai = TheLoai.TRUYEN;
            break;
        case 5:
            theLoai = TheLoai.TAM_LY;
            break;

        default:

            break;
        }
        return theLoai;

    }

    private Date inputNgayPhatHanh() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String strPhatHanh = sc.nextLine();
        if (strPhatHanh.equals("")) {
            return null;
        } else {
            try {
                ngayPhatHanh = format.parse(strPhatHanh);
            } catch (ParseException e) {
                e.fillInStackTrace();
            }
            return ngayPhatHanh;
        }
        
    }

    private void menuTheLoai() {
        System.out.println("Thể loại: ");
        System.out.print("\n1. Chính trị - pháp luật");
        System.out.print("\t2. Văn học - nghệ thuật");
        System.out.print("\t3. Khoa học công nghệ");
        System.out.print("\t4. Truyện");
        System.out.print("\t5. Tâm lý");

        System.out.println("\nChọn thể loại sách: ");
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


    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return tenSach + " - " + tenTacGia + " - " + ngonNgu + " - "
                + theLoai.getTen() + " - " + nhaXuatBan + " - " + format.format(ngayPhatHanh) + " - " + soLuong;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }


    public String getNgonNgu() {
        return ngonNgu;
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
